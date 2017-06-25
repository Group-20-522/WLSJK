package show;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class whochoose
 */
@WebServlet("/whochoose")
public class whochoose extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public whochoose() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		String kaoshenghao = null;
		String kaoshenghao1 = null;
		String kaoshenghao2 = null;
		
		kaoshenghao = (String)request.getAttribute("kaoshenghao");//java接收
		kaoshenghao1 = request.getParameter("kaoshenghao");//jsp接收
		kaoshenghao2 = (String) request.getSession().getAttribute("kaoshenghao");//java接收
		
		if(kaoshenghao == null)
		{
			kaoshenghao = kaoshenghao1;
		}
		if(kaoshenghao == null)
		{
			kaoshenghao = kaoshenghao2;
		}
		
		
		request.setAttribute("kaoshenghao",kaoshenghao);
		System.out.println("考生号="+kaoshenghao);
		/*
		 * 
		 * 连接数据库，利用考生号查看已经报考科目
		 * 需要知道已报考科目数目number；
		 * 知道具体科目号；
		 * 
		 * */
		
		RequestDispatcher rd = request.getRequestDispatcher("choose.jsp");
		int number = 3 ;
		request.setAttribute("number",number);
        
		for(int i = 0 ; i < number ; ++i)
		{
		
			request.setAttribute("subjectnumber"+i,i+3);
			
		}
		
		
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
