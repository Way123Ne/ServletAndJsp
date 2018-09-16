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

<title>00000</title>

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

	<%
		//接收第一个数
		String s_num1 = request.getParameter("num1");
		//接收第二个数
		String s_num2 = request.getParameter("num2");
		//接收运算符号
		String flag = request.getParameter("flag");

		int num1 = 0;
		int num2 = 0;
		int result = 0;
		//为了防止异常的发生，分别对三个数值进行校验
		if (s_num1 != null && s_num2 != null && flag != null) {
		
		num1 = Integer.parseInt(s_num1);
		num2 = Integer.parseInt(s_num2);
			//计算
			if (flag.equals("+")) {
				result = num1 + num2;
			} else if (flag.equals("-")) {
				result = num1 - num2;
			} else if (flag.equals("*")) {
				result = num1 * num2;
			} else if (flag.equals("/")) {
				result = num1 / num2;
			}
		}
		
	%>

	<h2>我的计算器</h2>
	<form name="form1" action="myResult.jsp">
		请输入第一个数:<input type="text" maxlength="6" name="num1"
			value="<%=num1%>"><br> <select name="flag">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select><br> 请输入第二个数:<input type="text" maxlength="6" name="num2"
			value="<%=num2%>"><br> <input type="submit" value="计算"
			onclick="return checkNum()">
	</form>
	<br>
	<hr>
	计算结果:<%=result%><!-- 表达式语法 -->
</body>
</html>
