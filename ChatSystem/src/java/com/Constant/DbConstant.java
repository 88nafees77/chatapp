/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Constant;

/**
 *
 * @author nafees
 */
public interface DbConstant {

    String URL = "jdbc:mysql://localhost:3306/ChatSystem";

    String USER_NAME = "root";

    String PASSWORD = "admin";

    String DRIVER = "com.mysql.jdbc.Driver";
    
    String query="insert into User_Table values(?,?,?,?,?)";

}
