package services;

import java.util.List;

import admin.model.billingmodel;
import admin.model.employeemodel;
import repositary.employeerepositary;
import repositary.employeerepositaryIMPL;

public class employeeserviceIMPL implements employeeservice {
     
	employeerepositary r=new employeerepositaryIMPL();
	@Override
	public boolean isaddnewemp(employeemodel model) {
		
		return r.isaddnewemp(model);
	}
	@Override
	public List<employeemodel> isgetallemployee() {
		
		return r.isgetallemployee();
	}
	@Override
	public boolean isdeleteemployeebyID(int eid) {
		
		return r.isdeleteemployeebyID(eid);
	}
	@Override
	public boolean isupdateemployee(employeemodel model) {
		
		return r.isupdateemployee(model);
	}
	@Override
	public boolean alloacatemachine(int eid, int mid, String ...x) {
		return r.alloacatemachine(eid, mid, x);
	}
	@Override
	public int varifyEmployee(String email, String contact) {
		return r.varifyEmployee(email, contact);
	}
	@Override
	public employeemodel getprofile(int id) {
		return r.getprofile(id);
	}
	@Override
	public List<Object[]> viewallocatemachineinfobyID(int eid, int mid) {
		return r.viewallocatemachineinfobyID(eid,mid);
	}
	@Override
	public int getmid(int eid) {
		
		return r.getmid(eid);
	}
	
	@Override
	public boolean isaddbill(billingmodel model) {
		
		return r.isaddbill(model);
	}
	@Override
	public List<Object[]> getsellingreport() {
	
		return r.getsellingreport();
	}
	@Override
	public int gettotal() {
		
		return r.gettotal();
	}
	@Override
	public int todaygettotal() {
		
		return r.todaygettotal();
	}
	@Override
	public int todaygettotalbyEMPID(int eid) {
		
		return r.todaygettotalbyEMPID(eid);
	}

}
