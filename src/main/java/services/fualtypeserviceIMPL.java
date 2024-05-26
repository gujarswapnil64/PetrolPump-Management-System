package services;

import java.util.List;

import admin.model.fualtypemodel;
import repositary.fualtyperepoIMPL;
import repositary.fueltyperepo;

public class fualtypeserviceIMPL implements fuelservice {
	fueltyperepo m=new fualtyperepoIMPL();
	
	@Override
	public boolean isaddfuelmodel(fualtypemodel model) {
		
		return m.isaddfueltype(model);
	}

	@Override
	public List<fualtypemodel> getallfueltype() {
		
		return m.getallfueltype();
	}

	@Override
	public boolean isfueltypedeletebyID(int id) {
		// TODO Auto-generated method stub
		return m.isfueltypedeletebyID(id);
	}

	@Override
	public boolean isupdatefueltype(fualtypemodel model) {
		return m.isupdatefueltype(model);
	}

	@Override
	public List<Object[]> isgetfuelprice() {
		
		return m.isgetfuelprice();
	}

	@Override
	public boolean isaddfuelprice(int id, int price) {
		
		return m.isaddfuelprice(id, price);
	}

	@Override
	public boolean isaddfuelpriceupdate(int newprice, int price) {
		
		return m.isaddfuelpriceupdate(newprice, price);
	}

}
