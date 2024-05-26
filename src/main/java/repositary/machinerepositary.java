package repositary;

import java.util.List;

import admin.model.addmachine;
import config.DBConfig;

public interface machinerepositary {
	DBConfig db=new DBConfig();
    public boolean isaddnewmachine(addmachine model,String[] typeid,String[] capacity);
    public List<Object[]> getallmachine();
    public boolean ismachinedeletebyID(int mid);
    public boolean isupdatemachine(addmachine model);  
    public  List<addmachine> getallmachineusing_addmachine_model();
}
