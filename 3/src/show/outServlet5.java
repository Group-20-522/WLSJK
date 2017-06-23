package show;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class outServlet5
 */
@WebServlet("/outServlet5")
public class outServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public outServlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String kaoshenghao = (String) request.getParameter("kaoshenghao");
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("outwrite5.jsp");
        String name = "史迪仔";
     	String sex = "男";
    	String year = "2017"; 
    	String month = "6"; 
    	String day = "18"; 
     	String id = "441900197604142912";
     	String minzu = "汉";
     	String jiguan = "广东";
     	String xueli = "本科";
     	String schooladdress = "中国地质大学（武汉）";
     	String zhuanye = "会计专业";
     	String xuelixingzhi = "函授";
     	String dotime = "5";
     	String baokaojibie = "初级";
     	String zhiwu = "项目经理";
     	String address = "佛山顺德区";
     	String phone = "13016467243";
     	String email = "313804866@qq.com";
     	String youbian = "523000";
     	
     	
     	
     	/*
     	 * 
     	 * 数据库拿信息
     	 * 
     	 * 
     	 * */
     	
     	
     	
     	
     	
        request.setAttribute("name",name);//存值
        
        request.setAttribute("kaoshenghao",kaoshenghao);
        
        request.setAttribute("sex",sex);
        request.setAttribute("year",year);
        request.setAttribute("month",month);
        request.setAttribute("day",day);
        request.setAttribute("id",id);
        request.setAttribute("minzu",minzu);
        request.setAttribute("jiguan",jiguan);
        request.setAttribute("xueli",xueli);
        request.setAttribute("schooladdress",schooladdress);
        request.setAttribute("zhuanye",zhuanye);
        request.setAttribute("xuelixingzhi",xuelixingzhi);
        request.setAttribute("dotime",dotime);
        request.setAttribute("baokaojibie",baokaojibie);
        request.setAttribute("zhiwu",zhiwu);
        request.setAttribute("address",address);
        request.setAttribute("phone",phone);
        request.setAttribute("email",email);
        request.setAttribute("youbian",youbian);
        rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
