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

      
    
  </head>  
    
  <body>  
  <div id="blog-news">
   <embed wmode="transparent" src="http://chabudai.sakura.ne.jp/blogparts/honehoneclock/honehone_clock_tr.swf" quality="high" bgcolor="#ffffff" width="160" height="70" name="honehoneclock" align="middle" allowscriptaccess="always" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer">
   </div>
   
 <%  
	String name = (String)request.getAttribute("name");
 String kaoshenghao = (String)request.getAttribute("kaoshenghao");
 	String sex = (String)request.getAttribute("sex");
 	String maritalstatus = (String)request.getAttribute("maritalstatus");
	String chusheng = (String)request.getAttribute("year") + "年" +  (String)request.getAttribute("month") + "月" +  (String)request.getAttribute("day") + "日";
 	String id = (String)request.getAttribute("id");
 	String minzu = (String)request.getAttribute("minzu");
 	String jiguan = (String)request.getAttribute("jiguan");
 	String origin = (String)request.getAttribute("origin");
 	String soldier = (String)request.getAttribute("soldier");
 	String schooladdress = (String)request.getAttribute("schooladdress");
 	String politicalstatus = (String)request.getAttribute("politicalstatus");
 	String address = (String)request.getAttribute("address");
 	String phone = (String)request.getAttribute("phone");
 	String email = (String)request.getAttribute("email");
 	String youbian = (String)request.getAttribute("youbian");
%> 
  
  <div id="hd_cnt">
<div class="list_hdcnt">
 <form id="add_user" name="add_user" action="hadchoose.jsp" method="post">
			  <table width="100%" align="center" cellpadding="0" cellspacing="0" border="1" bordercolor="#BBBBBB">
                <tbody>
               
                    <tr class="TDtop">
     <td height="25" colspan="8" align="center" bgcolor="#D3E3ED" class="bs_bg"><div align="center">超 级 机 构 地 质 专 业 研 究 生 考 试 考 生 信 息 表</div></td>
                    </tr>
             
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">姓　　名：</td>
                    <td align="left" width="300" bgcolor="#FFFFFF" height="27"><%=name %></td>
                 </tr>
				          
				          
				       <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">考　　号：</td>
                    <td align="left" width="300" bgcolor="#FFFFFF" height="27"><%=kaoshenghao %></td>
                 </tr>   
                 
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">性　　别：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=sex %></td>
                  </tr>
                  
                  
                   <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">婚　　否：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=maritalstatus %></td>
                  </tr>
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">出生日期：</td>
					<td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=chusheng %></td>
                   
                  </tr>
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">身份证号：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=id %></td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">民　　族：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=minzu %></td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">籍　　贯：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=jiguan %></td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">考生来源：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=origin %></td>
                  </tr>
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">现役军人：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=soldier %></td>
                  </tr>
                  
                  
                   <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">学习或工作单位：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=schooladdress %></td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">政治面貌：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=politicalstatus %></td>
                  
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">家庭住址：</td>
					<td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=address %></td>
                  </tr>
                
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">个人电话：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=phone %></td>
                  </tr>
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">Email：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=email %></td>
                  </tr>
                  
                  
                  <tr>
                    <td align="right" width="104" bgcolor="#FFFFFF" height="27">邮　　编：</td>
                    <td align="left" width="104" bgcolor="#FFFFFF" height="27"><%=youbian %></td>
                  </tr>
                  
             
                  <tr valign="center" bgcolor="#009966">
                    <td height="16" colspan="3" bgcolor="#FFFFFF" style="BORDER-TOP-WIDTH: 1px; BORDER-RIGHT: #000080 1px solid; BORDER-LEFT: #000080 1px solid; BORDER-BOTTOM: #000080 1px solid"><p align="center">

                      <input name="submit" type="submit" style="COLOR: #000000" value="返 回">
                 
                     
                    </p></td>
                  </tr>
                
                </tbody>
            </table></form>
</div>
</div>
  
  
  </body>  
</html>  