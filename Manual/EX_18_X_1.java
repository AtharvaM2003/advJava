package Manual;
import java.sql.*;  
class EX_18_X_1{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/my_database","root","Atharva");  
Statement stmt=con.createStatement();  
String sql = "CREATE TABLE `my_database`.`Student_Details`"
+"(`Roll No` INT NOT NULL,"
 +"`Student Name` VARCHAR(100) NULL,"
 +"`Address` VARCHAR(100) NULL,"
 +"PRIMARY KEY (`Roll No`))";
String sql2 ="INSERT INTO `my_database`.`Student_Details`"+
"VALUES('56', 'Atharva Mundhe', 'Umbraj'),('39', 'Kartik Mule', 'Umbraj'),('44', 'Ganesh Totare', 'Alephata')";

stmt.executeUpdate(sql);
stmt.executeUpdate(sql2);


con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
