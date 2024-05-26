package repositary;

import java.util.*;
import java.util.List;

import admin.model.addmachine;
import config.DBConfig;

public class machinerepositaryIMPL extends DBConfig implements machinerepositary {
     
     List<Object[]> list=new ArrayList<Object[]>();
     
     List<addmachine> list1=new ArrayList<addmachine>();
     
     public int getautomaticID()
     {
    	try {
    		int mid=0;
    	    stmt=conn.prepareStatement("select max(mid) from machineinfo");
    	    rs=stmt.executeQuery();
    	    if(rs.next())
    	    {
    	    	mid=rs.getInt(1);
    	    }
    	    
    	    return ++mid;
    	}
    	catch(Exception ex)
    	{
    		System.out.println("error is getautomaticID...:"+ex);
    		return -1;
    	}
		
     }
	@Override
	public boolean isaddnewmachine(addmachine model,String[] typeid,String[] capacity) {
		try {
			int mid = this.getautomaticID();
			String mname=model.getMachinecode();
			stmt=conn.prepareStatement("insert into machineinfo values("+mid+",'"+mname+"')");
			int value=stmt.executeUpdate();
			if(value>0)
			{
				for(int i=0;i<capacity.length;i++)
				{
					if(capacity!=null)
					{
				stmt=conn.prepareStatement("insert into machinetypejoin values(?,?,?)");
				stmt.setInt(1,mid);
				stmt.setInt(2,Integer.parseInt(typeid[i]));
				stmt.setInt(3,Integer.parseInt(capacity[i]));
				 value=stmt.executeUpdate();
					}
				}
				return value>0?true:false;
			}
			else
			{
				return false;
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("error isaddmachine repositary:.."+ex);
			return false;
		}
		
	}

	@Override
	public List<Object[]> getallmachine() {
    try {
    	stmt=conn.prepareStatement("select m.mname,f.name,mtj.capacity,m.mid from machineinfo m left join machinetypejoin mtj on m.mid=mtj.mid left join fueltype f on f.id=mtj.id");
    	rs=stmt.executeQuery();
    	while(rs.next())
    	{
    		Object obj[]=new Object[] {rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)};
    		list.add(obj);
//    		addmachine model=new addmachine();
//    		model.setId(rs.getInt(1));
//    		model.setMachinecode(rs.getString(2));
    		
    	}
    	return list.size()>0?list:null;
    }
    catch(Exception ex)
    {
    	System.out.println("Error is Getallmachine:..."+ex);
    }
		return null;
	}

	@Override
	public boolean ismachinedeletebyID(int mid) {
		   try {
			   stmt=conn.prepareStatement("delete from machineinfo where mid=?");
			   stmt.setInt(1, mid);
			   int value=stmt.executeUpdate();
			  return value>0?true:false;
		   }catch(Exception ex)
		   {
			   System.out.println("error is is ismachinedeletebyID>..."+ex);
			   return false;
		   }
		
		
		
		
	}

	@Override
	public boolean isupdatemachine(addmachine model) {
		try {
			stmt=conn.prepareStatement("update machineinfo set mname=? where mid=?");
			stmt.setString(1, model.getMachinecode());
			stmt.setInt(2, model.getId());
			int value=stmt.executeUpdate();
			return value>0?true:false;
			
		}
		catch(Exception ex)
		{
			System.out.println("Error is isupdatemachine...> "+ex);
		}
		return false;
	}
	@Override
	public List<addmachine> getallmachineusing_addmachine_model() {
		 try {
		    	stmt=conn.prepareStatement("select * from machineinfo");
		    	rs=stmt.executeQuery();
		    	while(rs.next())
		    	{	    	
		    		addmachine model=new addmachine();
		    		model.setId(rs.getInt(1));
		    		model.setMachinecode(rs.getString(2));	
		    		list1.add(model);
		    	}
		    	return list1.size()>0?list1:null;
		    }
		    catch(Exception ex)
		    {
		    	System.out.println("Error is getallmachineusing_addmachine_model():..."+ex);
		    }
				return null;
	}

}
