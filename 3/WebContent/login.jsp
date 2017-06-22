<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>考试报名系统</title>  
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
    <link rel="stylesheet" href="reset.css" />
	<link rel="stylesheet" href="login.css" />
  
    
      
   <script   Language="javaScript">   
		function   validate()   
		{   
				if (Login.Username.value=="")   
				{   
						alert("身份证号不能为空.");   
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
  <div class="page">
	<div class="loginwarrp">
		<div class="logo">考 生 登 陆</div>
        <div class="login_form">
			<form id="Login" name="Login" method="post" onsubmit="return validate()" action="choose.jsp">
				<li class="login-item">
					<span>身份证号：</span>
					<input type="text" id="username" name="Username" class="login_input" >
                                        <span id="count-msg" class="error"></span>
				</li>
				<li class="login-item">
					<span>密　　码：</span>
					<input type="password" id="password" name="Password" class="login_input" >
                                        <span id="password-msg" class="error"></span>
				</li>
            
				
				<div class="clearfix"></div>
				<li class="login-sub">
					<input align="center" type="submit" name="Submit" value="登录" />
                    <input type="button" name="Reset" value="注册" onclick="window.location.href='logon.jsp'"/>
				</li>  
				<li class="login-tiao">
                    <input type="button" name="Run" value="进入管理者登陆界面" onclick="window.location.href='man_login.jsp'"/>
				</li>                     
           </form>
		</div>
	</div>
</div>
  
 
  </body>  
</html>  >