package repositary;

import java.util.ArrayList;
import java.util.List;

import admin.model.fualtypemodel;
import config.DBConfig;

public class fualtyperepoIMPL extends DBConfig implements fueltyperepo {

	List<fualtypemodel> list=new ArrayList<fualtypemodel>();
	
	List<Object[]> list1=new ArrayList<Object[]>();
	@Override
	public boolean isaddfueltype(fualtypemodel model) {
          try {
        	  stmt=conn.prepareStatement("insert into fueltype values('0',?) ");
        	  stmt.setString(1, model.getName());
        	  int value=stmt.executeUpdate();
        	  return value>0?true:false;
          }
          catch(Exception ex)
          {
        	  System.out.println("error is isaddfueltype..."+ex);
          }
		return false;
	}

	@Override
	public List<fualtypemodel> getallfueltype() {
		try {
			stmt=conn.prepareStatement("select * from fueltype");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				fualtypemodel model=new fualtypemodel();
				model.setId(id);
				model.setName(name);
				list.add(model);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error is getallfueltype...>"+ex);
		}
		return null;
	}

	@Override
	public boolean isfueltypedeletebyID(int id) {
		
		try {
			stmt=conn.prepareStatement("delete from fueltype where id=?");
			stmt.setInt(1, id);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is isfueltypedeletebyID"+ex);
		}
		return false;
	}

	@Override
	public boolean isupdatefueltype(fualtypemodel model) {
		    try {
		    	stmt=conn.prepareStatement("update fueltype set name=? where id=?");
		    	stmt.setString(1,model.getName());
		    	stmt.setInt(2,model.getId());
		    	int value=stmt.executeUpdate();
		    	return value>0?true:false;
		    }
		    catch(Exception ex)
		    {
		    	System.out.println("Error is isupdatefueltype>...."+ex);
		    }
		return false;
	}

	@Override
	public List<Object[]> isgetfuelprice() {
try {
			
        	stmt=conn.prepareStatement(" select f.name,fp.fprice,f.id from fuelpricejoin fp inner join fueltype f on f.id=fp.id");      	
        	rs=stmt.executeQuery();
        	while(rs.next())
        	{
        		Object obj1[]=new Object[] {rs.getString(1),rs.getInt(2),rs.getInt(3)};
        		list1.add(obj1);     		
        		
        	}
        	return list1.size()>0?list1:null;
        }
        catch(Exception ex) {  
        	System.out.println("Error is isgetfuelprice:>>>>"+ex);
        }
		return null;
	}

	@Override
	public boolean isaddfuelprice(int id, int price) {
		try {
			stmt=conn.prepareStatement("insert into fuelpricejoin values(?,?)");
			stmt.setInt(1, id);
			stmt.setInt(2, price);
			int value=stmt.executeUpdate();			
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is isaddfuelprice:>>>>"+ex);
		}
		return false;
	}

	@Override
	public boolean isaddfuelpriceupdate(int newprice, int price) {
		try {
			stmt=conn.prepareStatement("update fuelpricejoin set fprice="+newprice+" where fprice="+price+"");
			int value=stmt.executeUpdate();			
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is isaddfuelpriceupdate:>>:>>>>"+ex);
		}
		return false;
	}

	
	

}
