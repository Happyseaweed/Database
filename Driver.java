package jdbcDriver;
import java.sql.*;

//--------------------SQL command sheet ----------------------------------//

//Add data: 
// String sql = "insert into users "
// 		   + " (idusers, username, password) "
// 		   + " values ('" + index + "' ,'"+ insertName + "', '"+insertPassword+"')";

//Update data:
// String sql = "update users "
// 	    + " set password = 'update'"
// 	    + " where idusers=9";

//delete data:
// String sql = " delete from [table] where [feature] = [something] ";



public class Driver {
	public static String url = "jdbc:mysql://localhost/userDatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static String ConnectionUser = "root";
	public static String ConnectionPassword = "XiaoXiao0105"; 
	
	public static void main(String args[]){
		
		
		// ----------------------------Constants -----------------------------//
		
		//Temporary testing variables
		String insertName = "test1";
		String insertPassword = "test2";
		String index = Integer.toString(123456789);
		
		try { //main try/catch code
			
			// Do any addition operations or call functions to operate on database
			
			
			
			
			
			
			//----Process result set----//
			// Listing all elements:
			
			//ResultSet myRs = myStmt.executeQuery("select * from users");
			//while(myRs.next()) {
			//	System.out.println(myRs.getString("username") + " " + myRs.getString("password"));
			//}
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		
	}
	
	public static void insertData(String userName, String password, int counter) {
		try {
			String sql = "insert into users "
			 		   + " (idusers, username, password) "
			 		   + " values ('" + counter + "' ,'"+ userName + "', '"+password+"')";
			Connection MyCon = DriverManager.getConnection(url, ConnectionUser, ConnectionPassword);
			Statement myStmt = MyCon.createStatement();
			myStmt.executeQuery(sql);
			System.out.println("Informatoin added!");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	public static void updateData(String newValue, String type, String Index) {
		try {
		//Update data:
		 String sql = "update users "
		 	    + " set "+type+" = '"+newValue+"'"
		 	    + " where idusers="+Index+"";
		 Connection MyCon = DriverManager.getConnection(url, ConnectionUser, ConnectionPassword);
		 Statement myStmt = MyCon.createStatement();
		 myStmt.executeQuery(sql);
		 System.out.println("Information Updated!");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	public static void deleteData (String feature, String index) {
		try {
			String sql = " delete from users where "+feature+" = "+index+"";
			Connection MyCon = DriverManager.getConnection(url, ConnectionUser, ConnectionPassword);
			Statement myStmt = MyCon.createStatement();
			myStmt.executeQuery(sql);
			System.out.println("Information Deleted!");
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}
}















