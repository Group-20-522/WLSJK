package manager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBHelper;
import db.DBconfig;

/**
 * Servlet implementation class find
 */
@WebServlet("/find")
public class find extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public find() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String kemuhao = request.getParameter("kemuhao");//科目号

		DBHelper.DB_driver();
		int number=0;
		Connection connect = null;
     	Statement stmt = null;
     	String kemuming = DBconfig.kemuming[Integer.parseInt(kemuhao)-1];
     	
     	try {
     	      connect = DriverManager.getConnection(
     	          DBconfig.db_url,DBconfig.db_user,DBconfig.db_password);

     	      System.out.println("Success connect Mysql server!");
     	      stmt = connect.createStatement();
     	      
     	      String sql1 = "select * from baokaokemu where kemuhao='"+kemuhao+"';";
	     	  ResultSet rs = stmt.executeQuery(sql1);	
	     	  while(rs.next()) {
	     		  number++;
     	      }
//System.out.println(number);
	     	  /*
	     	   * 传kemuming
	     	   * 传number
	     	   * 
	     	   * 
	     	   * 
	     	   */
	     	 request.setAttribute("subjectname",kemuming);
	     	 request.setAttribute("number",number);
//System.out.println(DBconfig.kemubiao[Integer.parseInt(kemuhao)-1]);
	     	  String sql2="select user.kaoshenghao,name,ID from "
	     			+DBconfig.kemubiao[Integer.parseInt(kemuhao)-1]+",user,baokaokemu where "
	     			+DBconfig.kemubiao[Integer.parseInt(kemuhao)-1]+".kaoshenghao=user.kaoshenghao=baokaokemu.kaoshenghao and kemuhao="
	     			+kemuhao+";";
	     	  rs = stmt.executeQuery(sql2);	
	     	  int i = 0;
	     	  while(rs.next()) {
	     		  String kaoshenghao = rs.getString("kaoshenghao");
	     		  String name = rs.getString("name");
	     		  String ID = rs.getString("ID");
	     		  request.setAttribute("id"+i,ID);
	     		  request.setAttribute("name"+i,name);
	     		  request.setAttribute("kaoshenghao"+i,kaoshenghao);
	     		  ++i;
	     		  /*
	     		   * chuan 3
	     		   * 
	     		   * 
	     		   */
//System.out.println(kaoshenghao+"\t"+name+"\t"+ID);
    	      }
	     	  
	     	  rs.close();
	     	  if(stmt != null) stmt.close();
	     	  if(connect != null) connect.close();
	     	  
     	    }
     	    catch (Exception e) {
     	      System.out.print("get data error!");
     	      e.printStackTrace();
     	    }
		
     	RequestDispatcher rd = request.getRequestDispatcher("man_show.jsp");
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
