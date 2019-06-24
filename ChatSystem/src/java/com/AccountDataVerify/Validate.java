/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AccountDataVerify;

import com.Constant.DataPatternVerify;
import com.Constant.DbConnection;
import com.dto.SignupRequest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author nafees
 */
public class Validate {

    public static List<String> isvalid(SignupRequest signupRequest) throws NullPointerException, SQLException {

        List<String> err = new ArrayList<>();
        
        err.clear();

        if (signupRequest.getEmail() != null) {

            Pattern p = Pattern.compile(DataPatternVerify.emailCheck);
            boolean m = p.matcher(signupRequest.getEmail()).matches();

            if (m == false) {
                err.add("invalid Email Address");
            }
        }

        if (signupRequest.getMobile() != null) {

            Pattern p = Pattern.compile(DataPatternVerify.mobileCheck);

            boolean mo = p.matcher(signupRequest.getMobile()).matches();

            if (mo == false) {
                err.add("invalid phone number");
            }
        }
        
        if(signupRequest.getName()!=null){
            
            Connection connection=DbConnection.getConnection();
            
            Statement statement=connection.createStatement();
            
            ResultSet resultSet=statement.executeQuery("select User_Name from User_Table");
            
            while(resultSet.next()){
                
                String name=resultSet.getString("User_Name");
                
                if(signupRequest.getName().equals(name)){
                    
                    err.add("User Name already exits");
                }
                
            }       
            
        }
        return err;

    }

}
