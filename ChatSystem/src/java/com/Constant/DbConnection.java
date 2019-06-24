/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Constant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nafees
 */
public class DbConnection {
    
      public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DbConstant.DRIVER);
            
        } catch (Exception er) {
            
            er.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(DbConstant.URL, DbConstant.USER_NAME, DbConstant.PASSWORD);
        
        return connection;

    }

    public static void closeConnection(Connection connection) throws SQLException {
        
        connection.close();
    }
    
}
