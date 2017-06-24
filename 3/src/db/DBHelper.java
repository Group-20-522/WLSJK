package db;

public class DBHelper {
	public static void DB_driver() {
	    try {
	        Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
	        //Class.forName("org.gjt.mm.mysql.Driver");
	       System.out.println("Success loading Mysql Driver!");
	      }
	      catch (Exception e) {
	        System.out.print("Error loading Mysql Driver!");
	        e.printStackTrace();
	      }

	}
}
