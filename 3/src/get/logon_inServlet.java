package get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class logon_inServlet
 */
@WebServlet("/logon_inServlet")
public class logon_inServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logon_inServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*注册的*/
		request.setCharacterEncoding("UTF-8");		
		String id = request.getParameter("Username");//身份证号
     	String password = request.getParameter("NPassword");//密码
     	
     	/*
     	 * 
     	 * 查数据库看看有没有这个人
     	 * 
     	 * 
     	 * 
     	 * */
     	
     	
     	/*
     	if(查无此人)
     	{
     		
     		
     		 //入库

     		request.getRequestDispatcher("logon_success.jsp").forward(request, response);
     	}
     	else
     	{
     		request.getRequestDispatcher("logon_fail.jsp").forward(request, response);
     	}
		*/
     	
     	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
