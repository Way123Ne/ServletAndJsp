<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'myCal.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function checkNum() {

		if (form1.num1.value == "") {
			window.alert("num1,不能为空!");
			return false;

		}

		if (Math.round(form1.num1.value) != form1.num1.value) {
			window.alert("num1,不是一个数!");
			return false;
		}
	}
</script>

</head>

<body>
	<h2>我的计算器</h2>
	<form name="form1" action="myRes.jsp">
		请输入第一个数:<input type="text" name="num1"><br> <select
			name="flag">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select><br> 请输入第二个数:<input type="text" name="num2"><br> <input
			type="submit" value="计算" onclick="return checkNum()">
	</form>
	<br>
</body>
</html>
