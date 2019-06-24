/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseService;

import com.Constant.DbConnection;
import com.dto.SignupRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author nafees
 */
public class DbStoreData {

    public static boolean Dbstore(SignupRequest signupRequest) throws SQLException {

        Connection connection = DbConnection.getConnection();

        System.out.println("con" + connection);

        PreparedStatement preparedStatement = connection.prepareStatement("insert into User_Table(User_Name,User_Password,User_Email,User_Mobile,Status) values(?,?,?,?,?)");

        preparedStatement.setString(1, signupRequest.getName());

        preparedStatement.setString(2, signupRequest.getPassword());

        preparedStatement.setString(3, signupRequest.getEmail());

        preparedStatement.setString(4, signupRequest.getMobile());

        preparedStatement.setString(5, "1");

        preparedStatement.execute();

        return true;

    }

}
