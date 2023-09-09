package Manual;

import java.sql.*;  
class EX_18_XIII_2{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/my_database","root","Atharva");  
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("SELECT roll_no,Student_name,Percentage FROM my_database.student where Percentage>70");

while(rs.next()){
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+  "     "+ rs.getInt(3));
}

con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
