package Manual;
import java.sql.*;  
class EX_18_XIII_1{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/my_database","root","Atharva");  
Statement stmt=con.createStatement();  
String sql = "CREATE TABLE `my_database`.`Employee`"
+"(`Emp_id` INT NOT NULL,"
 +"`Emp_Name` VARCHAR(100) NULL)";
stmt.executeUpdate(sql);
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  