package com.projects.reimbursementsystem.Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConfig {

    public static Connection connect() throws SQLException{
        try {Class.forName("org.postgresql.Driver");}
        catch (ClassNotFoundException e) {e.printStackTrace();}
        return DriverManager.getConnection(
                "jdbc:postgresql://wrsdb.c5yi8p8lqb1o.us-east-1.rds.amazonaws.com:5432",
                "WRS",
                "reimbursment");
    }



}
