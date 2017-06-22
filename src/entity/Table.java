package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell2 on 2017/6/23.
 */
public class Table {
    private String tableName;
    private List<TableItem> tableItems;
    public Table(){
        tableName="";
        tableItems=new ArrayList<TableItem>();
    }
    public String getTableName(){
        return tableName;
    }
    public List<TableItem> getTableItems(){
        return tableItems;
    }
    public void setTableName(String tableName){
        this.tableName=tableName;
    }
    public void setTableItems(List<TableItem> tableItems){
        this.tableItems=tableItems;
    }
}
