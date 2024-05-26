package services;

import java.util.List;

import admin.model.addmachine;

public interface machineservice {
   public boolean isaddmachine(addmachine model,String[] typeid,String[] capacity);
   public  List<Object[]> getallmachine();
   public boolean ismachinedeletebyID(int mid);
   public boolean isupdatemachine(addmachine model);
   public  List<addmachine> getallmachineusing_addmachine_model();
}
