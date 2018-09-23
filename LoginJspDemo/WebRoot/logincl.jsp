<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'logincl.jsp' starting page</title>
    
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
  	//接收用户名和密码，完成对用户的验证
  	String u = request.getParameter("username");
  	String p = request.getParameter("password");
  	//验证
  	if(u.equals("xiaosong")&&p.equals("123")){
  		//合法，跳转loginwel.jsp
  		response.sendRedirect("loginwel.jsp");
  	}else{
  		//不合法，跳转到login.jsp
  		//如何将login.jsp得到的数据传给下一个页面
  		//1.cookie 2.session 3.response.sendRedirect
  		response.sendRedirect("login.jsp?user="+u);
  	}
   %>
  </body>
</html>
