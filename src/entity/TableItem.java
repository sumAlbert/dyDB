package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/22.
 */
public class TableItem {
    private List<String> header;
    private Map<String,String> items;
    public TableItem(){
        super();
        header=new ArrayList<>();
        items=new HashMap<>();
    }
    public List<String> getHeader(){
        return header;
    }
    public Map<String,String> getItems(){
        return this.items;
    }
    public void setItems(Map<String,String> items){
        this.items=items;
    }
    public void setHeader(List<String> header){
        this.header=header;
    }
}
