package repositary;

import java.util.List;

import admin.model.addmachine;
import admin.model.fualtypemodel;

public interface fueltyperepo {
   public boolean isaddfueltype(fualtypemodel model);
   public List<fualtypemodel> getallfueltype();
   public boolean isfueltypedeletebyID(int id);
   public boolean isupdatefueltype(fualtypemodel model);
   public List<Object[]> isgetfuelprice();
   public boolean isaddfuelprice(int id,int price);
   public boolean isaddfuelpriceupdate(int newprice,int price);
}
