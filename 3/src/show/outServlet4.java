package show;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class outServlet4
 */
@WebServlet("/outServlet4")
public class outServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public outServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("outwrite4.jsp");
        String name = "史迪仔";
     	String sex = "男";
    	String year = "2017"; 
    	String month = "6"; 
    	String day = "18"; 
     	String id = "441900197604142912";
     	String minzu = "汉";
     	String jiguan = "广东";
     	String schooladdress = "中国地质大学（武汉）";
     	String baokaojibie = "一级";
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
        request.setAttribute("sex",sex);
        request.setAttribute("year",year);
        request.setAttribute("month",month);
        request.setAttribute("day",day);
        request.setAttribute("id",id);
        request.setAttribute("minzu",minzu);
        request.setAttribute("jiguan",jiguan);
        request.setAttribute("schooladdress",schooladdress);
        request.setAttribute("baokaojibie",baokaojibie);
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
