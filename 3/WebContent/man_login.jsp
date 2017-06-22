<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE html>
<html>
<title>考试报名系统</title>
	
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="reset.css" />
	<link rel="stylesheet" href="login.css" />
        
</head>
<body>

   
<div class="page">
	<div class="loginwarrp">
		<div class="logo">管理员登陆</div>
        <div class="login_form">
			<form id="Login" name="Login" method="post" onsubmit="" action="">
				<li class="login-item">
					<span>用户名：</span>
					<input type="text" id="username" name="UserName" class="login_input" >
                                        <span id="count-msg" class="error"></span>
				</li>
				<li class="login-item">
					<span>密　码：</span>
					<input type="password" id="password" name="password" class="login_input" >
                                        <span id="password-msg" class="error"></span>
				</li>
            
				
				<div class="clearfix"></div>
				<li class="login-sub">
					<input type="submit" name="Submit" value="登录" />
                     <input type="reset" name="Reset" value="重置" />
				</li>                      
				<li class="login-tiao">
                    <input type="button" name="Reset" value="返回考生登陆界面" onclick="window.location.href='login.jsp'"/>
				</li> 
           </form>
		</div>
	</div>
</div>



  
  </body>  
  
</html>  