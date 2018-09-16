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

<title>My JSP 'myRes.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

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
		//输出结果
		out.println("结果是:" + result);
	%>
</body>
</html>
