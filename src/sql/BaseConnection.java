package sql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 * Created by dell2 on 2017/6/1.
 */
public class BaseConnection {
    private final String USER="root";
    private final String PASS="";
    private final String DB_URL_PRE="jdbc:mysql://localhost:3306/";
    private final String DB_URL_AFT="?useUnicode=true&characterEncoding=UTF-8";
    private final String DB_Name="";
    private String DB_URL;
    private Connection connection;
    public BaseConnection(){
        try{
//            DB_URL=DB_URL_PRE+DB_Name+DB_URL_AFT;
            DB_URL="";
            Driver driver=new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection=DriverManager.getConnection(DB_URL,USER,PASS);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
