package show;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hadchoose_outServlet
 */
@WebServlet("/hadchoose_outServlet")
public class hadchoose_outServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hadchoose_outServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String kaoshenghao = (String) request.getSession().getAttribute("testSession");//考生号
	
		request.setAttribute("kaoshenghao",kaoshenghao);
		
		/*
		 * 
		 * 连接数据库，利用考生号查看已经报考科目
		 * 需要知道已报考科目数目number；
		 * 知道具体科目号及科目名；
		 * 
		 * */
		
		RequestDispatcher rd = request.getRequestDispatcher("hadchoose.jsp");
		int number = 3 ;
		request.setAttribute("number",number);
        
		for(int i = 0 ; i < number ; ++i)
		{
		
			request.setAttribute("subjectnumber"+i,i+3);
			String subjectname = "apple"+i+3;
			request.setAttribute("subjectname"+i,subjectname);
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
