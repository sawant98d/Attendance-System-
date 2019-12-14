
package controllers;

import java.sql.*;

public class EstablishedConnection 
{
    public static Connection getEstablishedConnection() throws Exception
    {        
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:H:\\MyDashboardApp\\src\\database\\sysdatabase.db");
            return conn;                        
    }
}
