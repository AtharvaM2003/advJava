package Practice;
import java.sql.*;  
class EX_18_X_1{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/database","root","Apeksha");  
Statement stmt=con.createStatement();  
String sql = "CREATE TABLE `database`.`Student_Data`"
+"(`Roll No` INT NOT NULL,"
 +"`Student Name` VARCHAR(100) NULL,"
 +"`Address` VARCHAR(100) NULL,"
 +"PRIMARY KEY (`Roll No`))";
String sql2 ="INSERT INTO `database`.`Student_Data`"+
"VALUES('01', 'Apeksha Shinde', 'Wadgaon Sahani'),('02', 'Nikita Tamboli', 'Wadgaon Sahani'),('03', 'Ankita Wavhal', 'Junnar')";

stmt.executeUpdate(sql);
stmt.executeUpdate(sql2);


con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
