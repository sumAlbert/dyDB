package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Table;
import entity.TableItem;
import javafx.scene.control.Tab;
import org.apache.poi.ss.formula.functions.T;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dell2 on 2017/6/22.
 */
public class StartupAction extends ActionSupport {
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        HttpServletRequest request = ServletActionContext.getRequest();
        Table table=init();
        request.setAttribute("table",table);
        return SUCCESS;
    }
    public Table init(){
        Table table=new Table();
        List<TableItem> tableItemList=new ArrayList<TableItem>();
        table.setTableName("123");
        for(int i=0;i<100;i++){
            TableItem tableItem=new TableItem();
            List<String> header=new ArrayList<String>();
            Map<String,String> map=new HashMap<String, String>();
            for(int j=0;j<20;j++){
                header.add(String.valueOf(j));
                map.put(String.valueOf(j),"content"+String.valueOf(j));
                tableItem.setHeader(header);
                tableItem.setItems(map);
            }
            tableItemList.add(tableItem);
        }
        table.setTableItems(tableItemList);
        return table;
    }
}
