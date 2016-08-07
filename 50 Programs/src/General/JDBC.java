package General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class JDBC {

	static{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (ClassNotFoundException e){
            System.out.println("Unable To Load The Driver class");
        }
    }
 
    public static void main(String[] args){
        Connection con = null;
        Statement stmt = null;
        try{
            String URL = "jdbc:mysql//localhost:3306//sampledb";
            String username = "root";
            String password = "root";
            con = DriverManager.getConnection(URL, username, password);
            stmt = (Statement) con.createStatement();
            String sql = "CREATE TABLE EMPLOYEE(" +
                    "ID NUMBER NOT NULL, " +
                    "FIRST_NAME VARCHAR2(200), " +
                    "LAST_NAME VARCHAR2(200), " +
                    "DISIGNATION VARCHAR2(200))";
            int i = stmt.executeUpdate(sql); 
            if(i == 0){
                System.out.println("Table is created");
            }
            else{
                System.out.println("Table is not created");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(stmt!=null){
                    stmt.close();
                    stmt=null;
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            try{
                if(con!=null){
                    con.close();
                    con=null;
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
