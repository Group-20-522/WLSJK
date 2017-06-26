<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
 
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    
      
    <title>考试报名系统</title>  
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
<<<<<<< HEAD
	<link rel="stylesheet" href="login.css" />
=======

>>>>>>> 2e65e33e735f9351eff592258fb50178b6d97800
      
    
  </head>  
    
  <body>  
  <div id="blog-news">
   <embed wmode="transparent" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf" quality="high" bgcolor="#ffffff" width="160" height="70" name="honehoneclock" align="middle" allowscriptaccess="always" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer">
   </div>
   
 <%  
	int number = (int)request.getAttribute("number");
<<<<<<< HEAD
 	String subjectname = (String)request.getAttribute("subjectname");
=======
 	String subjectname = (String)request.getAttribute("subjecrname");
>>>>>>> 2e65e33e735f9351eff592258fb50178b6d97800
%> 
  
  <div id="hd_cnt">
<div class="list_hdcnt">
 <form id="add_user" name="add_user" action="update_inServlet1" method="post">
			  <table width="65%" align="center" cellpadding="0" cellspacing="0" border="1" bordercolor="#BBBBBB">
                <tbody>
               
                    <tr class="TDtop">
<<<<<<< HEAD
     <td height="25" colspan="8" align="center" bgcolor="#D3E3ED" class="bs_bg"><div align="center"><%=subjectname %></div></td>
=======
     <td height="25" colspan="8" align="center" bgcolor="#D3E3ED" class="bs_bg"><div align="center"><%=subjectname %>></div></td>
>>>>>>> 2e65e33e735f9351eff592258fb50178b6d97800
                    </tr>
             
                  <tr>
                    <td align="center" width="300" bgcolor="#4767fe" height="27">考 生 号</td>
                    <td align="center" width="300" bgcolor="#4767fe" height="27">姓 名</td>
                    <td align="center" width="300" bgcolor="#4767fe" height="27">身 份 证 号</td>
                 </tr>
                 
                 <%for(int i = 0 ; i < number ; ++i ){ 
                	 String name = (String)request.getAttribute("name"+i);
                	 String id = (String)request.getAttribute("id"+i);
                	 String kaoshenghao = (String)request.getAttribute("kaoshenghao"+i);
                	 String color = null;
<<<<<<< HEAD
                	 if(i%2 == 0)
=======
                	 if(i%2 == 1)
>>>>>>> 2e65e33e735f9351eff592258fb50178b6d97800
                	 {
                		 color = "#FFFFFF";
                	 }
                	 else
                	 {
                		 color = "#d4d8e2";
                	 }
                 %>
                 <tr>
                    <td align="center" width="300" bgcolor="<%=color %>" height="27"><%=kaoshenghao %></td>
<<<<<<< HEAD
                    <td align="center" width="300" bgcolor="<%=color %>" height="27"><%=name %></td>
                    <td align="center" width="300" bgcolor="<%=color %>" height="27"><%=id %></td>
=======
                    <td align="center" width="300" bgcolor="#4767fe" height="27"><%=name %></td>
                    <td align="center" width="300" bgcolor="#4767fe" height="27"><%=id %></td>
>>>>>>> 2e65e33e735f9351eff592258fb50178b6d97800
                 </tr>
                  <% }%>
                  
                  
               
                
                  
                  
                  <tr valign="center" bgcolor="#009966">
                    <td height="16" colspan="3" bgcolor="#FFFFFF" style="BORDER-TOP-WIDTH: 1px; BORDER-RIGHT: #000080 1px solid; BORDER-LEFT: #000080 1px solid; BORDER-BOTTOM: #000080 1px solid"><p align="center">

                   <input type="button" style="COLOR: #000000" value="返 回" onclick="window.location.href='man_choose.jsp'"/>
                 
                     
                    </p></td>
                  </tr>
                     	
                
                </tbody>
            </table></form>
</div>
</div>
  
  
  </body>  
</html>  