package com.mdc.login_form;

/**
 *
 * @author bryan
 */

import java.sql.Connection;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class My_CNX {
    private static final String SERVER_NAME = "localhost";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DB_NAME = "users_db";
    private static final Integer DB_PORT = 3306;
    
    public static Connection getConnection(){
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(SERVER_NAME);
        datasource.setUser(USERNAME);
        datasource.setPassword(PASSWORD);
        datasource.setDatabaseName(DB_NAME);
        datasource.setPortNumber(DB_PORT);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get connection ->" + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
}
