import java.sql.*;

/**
 *
 * @author Sneha
 */
public class JavaConnection {
    
    public static void main(String[] args) {
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
            
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aictsl","root","root");
            System.out.println("connectd");
             
            st=con.createStatement();
            
            rs=st.executeQuery("Select * from user");
            
            while(rs.next())
            {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
            }
            
            con.close();
        }   
           
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
    }
    
}
