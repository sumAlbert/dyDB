package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.Table;
import entity.TableItem;
import javafx.scene.control.Tab;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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
        table.setTableName("123");
        for(int i=0;i<100;i++){
            TableItem tableItem=new TableItem();
            for(int j=0;j<20;j++){
                List<String> header=new ArrayList<>();
                header.add(String.valueOf(j));
                tableItem.setHeader(header);
//                tableItem.setItems();
            }


        }
        return table;
    }
}
