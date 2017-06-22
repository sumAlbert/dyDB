package sql;

import entity.Table;
import entity.TableItem;

import java.util.List;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by dell2 on 2017/6/22.
 */
public class SqlSearch {

    public String execute() throws Exception {
        // TODO Auto-generated method stub
        return SUCCESS;
    }
    public Table search(String tableName){
        Table table=new Table();
        table.setTableName(tableName);
        List<TableItem>tables=table.getTableItems();
        /*****



         */



        return table;
    }
}
