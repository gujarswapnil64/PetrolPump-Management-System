package repositary;

import java.util.List;


import admin.model.billingmodel;
import admin.model.employeemodel;

public interface employeerepositary {
	 public boolean isaddnewemp(employeemodel model);
	 public List<employeemodel> isgetallemployee();
	 public boolean isdeleteemployeebyID(int eid);
	 public boolean isupdateemployee(employeemodel model);
	 public boolean alloacatemachine(int eid,int mid,String ...x);
	 public int varifyEmployee(String email,String contact);	 
	 public employeemodel getprofile(int eid);
	 public List<Object[]> viewallocatemachineinfobyID(int eid, int mid);
	 public int getmid(int eid);
	 public boolean isaddbill(billingmodel model);
	 public List<Object[]> getsellingreport();
	 public int gettotal();
	 public int todaygettotal();
	 public int todaygettotalbyEMPID(int eid);
}
