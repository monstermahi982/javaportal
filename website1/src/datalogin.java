import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class datalogin {

	static Connection con;
	//PreparedStatement psmt;
	//Statement st;
	//ResultSet res = null;
	
	 public datalogin() {
		
	}
	
	 public static boolean display(String username , String password) {
		 boolean status1 = false;
		 System.out.println("Connecting....");
			try {
				Class.forName("com.mysql.jdbc.Driver");
			//	System.out.println("driver connect ho gya");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				//System.out.println("error1");
				e.printStackTrace();
			}
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
				System.out.println("connection ho gya");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("error2");
				e.printStackTrace();
			}
		 //System.out.println("statement mil gya lake ");
		 try {
			 //System.out.println("statement mil gya before");
			 PreparedStatement pse = con.prepareStatement("select * from web1 where username= ? and password= ?");
			//System.out.println("statement mil gya");
			pse.setString(1, username);
			pse.setString(2, password);
			ResultSet re = pse.executeQuery();
			status1 = re.next();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("error3"+e);
		}
		 
		 return status1;
	 }

	
	
}

