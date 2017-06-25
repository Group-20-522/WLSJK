package show;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class outServlet3
 */
@WebServlet("/outServlet3")
public class outServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public outServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String kaoshenghao = (String) request.getParameter("kaoshenghao");
		System.out.println(kaoshenghao);
		
		RequestDispatcher rd = request.getRequestDispatcher("outwrite3.jsp");
        String name = "史迪仔";
     	String sex = "男";
     	String maritalstatus = "未婚";
    	String year = "2017"; 
    	String month = "6"; 
    	String day = "18"; 
     	String id = "441900197604142912";
     	String minzu = "汉";
     	String jiguan = "广东";
     	String origin = "本科毕业生";
     	String soldier = "非军人";
     	String schooladdress = "中国地质大学（武汉）";
     	String politicalstatus = "共青团员";
     	String address = "佛山顺德区";
     	String phone = "13016467243";
     	String email = "313804866@qq.com";
     	String youbian = "523000";
     	
     	
     	System.out.println("考生号"+kaoshenghao);
     	/*
     	 * 
     	 * 数据库拿信息
     	 * 
     	 * 
     	 * */
     	
     	
     	
     	
     	
        request.setAttribute("name",name);//存值
        
        request.setAttribute("kaoshenghao",kaoshenghao);
        
        request.setAttribute("sex",sex);
        request.setAttribute("maritalstatus",maritalstatus);
        request.setAttribute("year",year);
        request.setAttribute("month",month);
        request.setAttribute("day",day);
        request.setAttribute("id",id);
        request.setAttribute("minzu",minzu);
        request.setAttribute("jiguan",jiguan);
        request.setAttribute("origin",origin);
        request.setAttribute("soldier",soldier);
        request.setAttribute("schooladdress",schooladdress);
        request.setAttribute("politicalstatus",politicalstatus);
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
