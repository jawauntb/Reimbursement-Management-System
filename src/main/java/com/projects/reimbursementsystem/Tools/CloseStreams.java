package com.projects.reimbursementsystem.Tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseStreams {

    public static void close(Statement stmt){
        if(stmt!=null){try {stmt.close();}
        catch (SQLException e) {e.printStackTrace();}
        }
    }

    public static void close(ResultSet rs){
        if(rs!=null){try {rs.close();}
        catch (SQLException e) {e.printStackTrace();}
        }
    }

    public static void close(FileInputStream fis){
        if(fis!=null){try {fis.close();}
        catch (IOException e) {e.printStackTrace();}
        }
    }

    public static void close(Connection conn){
        if(conn!=null){try {conn.close();}
        catch (SQLException e) {e.printStackTrace();}
        }
    }


}