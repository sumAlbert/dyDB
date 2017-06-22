package sql;

import entity.Table;
import entity.TableItem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by dell2 on 2017/6/22.
 */
public class SqlSearch {
    private Connection connection;
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        search("");
        return SUCCESS;
    }
    public Table search(String tableName){
        tableName="";//你要查询的表的名字
        BaseConnection baseConnection=new BaseConnection();
        connection=baseConnection.getConnection();
        Table table=new Table();
        table.setTableName(tableName);
        List<TableItem>tables=table.getTableItems();
        try {
            Statement statement=connection.createStatement();
            String sql="select * from "+tableName;
            ResultSet rs=statement.executeQuery(sql);
            while(rs.next()){
                String attr="";//属性名
                String str=rs.getString(attr);
                System.out.println(str);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return table;
    }
}
