package services;

import java.util.List;

import admin.model.addmachine;
import admin.model.fualtypemodel;

public interface fuelservice {
    public boolean isaddfuelmodel(fualtypemodel model);
    public List<fualtypemodel> getallfueltype();
    public boolean isfueltypedeletebyID(int id);
    public boolean isupdatefueltype(fualtypemodel model);
    public List<Object[]> isgetfuelprice();
    public boolean isaddfuelprice(int id,int price);
    public boolean isaddfuelpriceupdate(int newprice,int price);
}
