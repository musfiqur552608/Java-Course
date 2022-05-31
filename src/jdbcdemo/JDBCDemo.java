
package jdbcdemo;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdemo";
        String uname = "root";
        String pass ="";
        
        
//        String query = "insert into student(id, fname, lname, phone, class) values(?, ?, ?, ?, ?)// This is for inserting
//          String query = "select phone from student";
//            String query = "update student set phone = ? where id = 2";
          String query = "delete from student where id = ?";
          
          
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement pres = con.prepareStatement(query);
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(query);

        
        pres.setInt(1, 3);
       
        pres.executeUpdate();
        
        
        
        pres.close();
        con.close();
        
        
        
    }
    
}
