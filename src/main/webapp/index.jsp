<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 	
	<script src="js/test.js"></script>
</head>
<body>
	<h2>Hello World!</h2>

	<h3>
		<a href="login/loginMain">Click Here</a>
	</h3>
	
	<h3>
		<a href="javascript:;" onclick="testsubmit()">forward to bootstarp model page</a>

		
	</h3>
	
	<form name="loginForm">
		<input type="hidden" name="username" value="lisong"/>
		<input type="hidden" name="password" value="69"/>
		<input type="button" onclick="testsubmit()" value="submit"/>
	</form>
	
	<script src="../../js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript">
		function testsubmit(){
			var loginForm = document.getElementsByName("loginForm")[0];
			loginForm.action = "/personal_blog/login/userLogin";
			loginForm.submit(); 
			
			/* test(); */
		}
	</script>
</body>
</html>
