import java.sql.*;
public class CheckCardNumber {
   
    ResultSet rs;
    Statement s;
    CheckCardNumber(){
        getConnection();
        getExperiment();
    }
    void getExperiment()
    {
        try
        {
            String sql1;
            int c;
            sql1="select max(CARD_NUMBER) from login";
            rs=s.executeQuery(sql1);
            rs.next();
            if(rs==null)
                c=1000;
            else
                c=rs.getInt(1)+1;
            System.out.println("C is "+c);
        }
        catch(SQLException e)
        {
            System.out.println("Error is "+e);
        }
    }
    void getConnection()
    {
        try
        {
              DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
              Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
              s=c.createStatement();
        }
        catch(SQLException e)
        {
            System.out.println("Error is "+e);
        }
    }
    public static void main(String [] args)
    { 
        CheckCardNumber c1=new CheckCardNumber();
    }
}
