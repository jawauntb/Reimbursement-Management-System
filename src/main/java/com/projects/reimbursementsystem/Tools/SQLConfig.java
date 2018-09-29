package com.projects.reimbursementsystem.Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConfig {

    public static Connection connect() throws SQLException{
        try {Class.forName("");}
        catch (ClassNotFoundException e) {e.printStackTrace();}
        return DriverManager.getConnection(
                "",
                "",
                "");
    }



}
