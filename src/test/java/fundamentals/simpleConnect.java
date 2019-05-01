package fundamentals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class simpleConnect {

    public static void main(String[] args) throws SQLException {

        // JDBC(jar library): Java Data Base Connectivity.  it allows java to connect and modify the database

        // first Step:  connect to the data base.

                //    Connection mycon = DriverManager.getConnection("URL","UserName","Password");
                // how to write URL:    "JDBC:database://hostname:port number/dataBase Name.


        String username ="hr",   password ="hr",
                url="jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws.com:5432/hr";


        Connection mycon=DriverManager.getConnection(url,username,password);


        System.out.println("Connected successfully");


    }


}
