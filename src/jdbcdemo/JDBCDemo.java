
package jdbcdemo;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/studentdemo";
        String uname = "root";
        String pass ="";
        
        
        String query = "select * from student";
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        String fname = "";
        String lname = "";
        
        while(rs.next()){
            fname = rs.getString("fname");
            lname = rs.getString("lname");
            
            System.out.println(fname+" "+lname);
        }
        
        
        
        
        st.close();
        con.close();
        
        
        
    }
    
}
