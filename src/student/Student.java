/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Yogesh
 */
public class Student {
    Connection conn = null;

    public static Connection connection()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:stud.db");
            System.out.println("Succesful");
            return conn;       
        }
        catch(Exception ex)
        {
            System.out.println("connection failed");
            return null;
        }
        
    }
    
}
