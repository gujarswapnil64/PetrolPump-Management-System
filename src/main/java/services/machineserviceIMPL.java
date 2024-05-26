package services;

import java.util.List;

import admin.model.addmachine;
import repositary.machinerepositary;
import repositary.machinerepositaryIMPL;

public class machineserviceIMPL implements machineservice{

	  machinerepositary m=new machinerepositaryIMPL();
	@Override
	public boolean isaddmachine(addmachine model,String[] typeid, String[] capacity) {
		// TODO Auto-generated method stub
		return m.isaddnewmachine(model,typeid,capacity);
	}
	@Override
	public List<Object[]> getallmachine() {

		return m.getallmachine();
	}
	@Override
	public boolean ismachinedeletebyID(int mid) {
		return m.ismachinedeletebyID(mid);
	}
	@Override
	public boolean isupdatemachine(addmachine model) {
		return m.isupdatemachine(model);
	}
	@Override
	public List<addmachine> getallmachineusing_addmachine_model() {
		
		return m.getallmachineusing_addmachine_model();
	}
   
}
