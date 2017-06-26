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
         <script   Language="javaScript">   
		function   validate()   
		{   
				if (Login.Username.value=="")   
				{   
						alert("用户名不能为空.");   
						document.Login.Username.focus();   
						return false  ;   
				}  
			
				if (Login.Password.value=="")   
				{   
						alert("密码不能为空.");   
						document.Login.Password.focus();   
						return false  ;   
				}   
 				return  true;   
		}   
		
		
		
		
  </script>    
</head>
<body>
 </br>
  </br>
  <h1 class="threed" align="center">公 共 报 考 系 统</h1>
   
<div class="page">
	<div class="loginwarrp">
		<div class="logo">管理员登陆</div>
        <div class="login_form">
			<form id="Login" name="Login" method="post" onsubmit="return validate()" action="man_choose.jsp">
				<li class="login-item">
					<span>用户名：</span>
					<input type="text" id="username" name="Username" class="login_input" >
                                        <span id="count-msg" class="error"></span>
				</li>
				<li class="login-item">
					<span>密　码：</span>
					<input type="password" id="password" name="Password" class="login_input" >
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