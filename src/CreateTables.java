
import java.sql.*;
import javax.swing.JOptionPane;
public class CreateTables {
        
     Connection c;
     Statement stmt;
     ResultSet rs;
    CreateTables()
    {
        getConnection();
        getCreateTable();
    }
    
    
    void getCreateTable()
    {
        try{

            String sql;
            sql="create table vkr(srno number(3) primary key,name varchar(30))";
            stmt.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null,"Command Successfully Run");
        }
        catch(SQLException e)
        {
            System.out.println("Error is " +e);
        }
    }
    
    
    void getConnection()
    {
        try
        {
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
            stmt=c.createStatement();
        }
        catch(SQLException e)
        {
            System.out.println("Error is "+e);
        }
    }
    public static void main(String [] args)
    {
        CreateTables c1=new CreateTables();
    }
}
