package repositary;

import java.util.ArrayList;
import java.util.List;


import admin.model.billingmodel;
import admin.model.employeemodel;
import config.DBConfig;

public class employeerepositaryIMPL extends DBConfig implements employeerepositary {

	
	List<employeemodel> list= new ArrayList<employeemodel>();
	
	List<Object[]> list1= new ArrayList<Object[]>();
	
	List<Object[]> list2=new ArrayList<Object[]>();
	private String name;
	private String email;
	   
	   public int getautomaticID()
	     {
	    	try {
	    		int eid=0;
	    	    stmt=conn.prepareStatement("select max(eid) from employee");
	    	    rs=stmt.executeQuery();
	    	    if(rs.next())
	    	    {
	    	    	eid=rs.getInt(1);
	    	    }
	    	    
	    	    return ++eid;
	    	}
	    	catch(Exception ex)
	    	{
	    		System.out.println("error is getautomaticID...:"+ex);
	    		return -1;
	    	}
			
	     }
	@Override
	public boolean isaddnewemp(employeemodel model) {
		try {
			int eid=this.getautomaticID();
			stmt=conn.prepareStatement("insert into employee values("+eid+",?,?,?,?,?)");
//			stmt.setInt(1,this.getautomaticID());
			stmt.setString(1, model.getName());
			stmt.setString(2, model.getEmail());
			stmt.setString(3, model.getContact());
			stmt.setString(4,model.getAddress());
			stmt.setInt(5, model.getSalary());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is addnewemp>..."+ex);
		}
		return false;
	}

	@Override
	public List<employeemodel> isgetallemployee() {
		   try {
			   stmt=conn.prepareStatement("select * from employee");
			   rs=stmt.executeQuery();
			   while(rs.next())
			   {
				   int eid=rs.getInt(1);
				  String name= rs.getString(2);
				  String email= rs.getString(3);
				  String contact= rs.getString(4);
				  String address= rs.getString(5);
				  int sal= rs.getInt(6);
				  
				   
				   employeemodel model=new employeemodel();
				   model.setEid(eid);
				  model.setName(name);
				  model.setEmail(email);
				  model.setContact(contact);
				  model.setAddress(address);
				  model.setSalary(sal);
				   list.add(model);			   
			   }
			   return list.size()>0?list:null;
		   }
		   catch(Exception ex)
		   {
			   System.out.println("Error is isgetallemployee>..."+ex);
		   }
		return null;
	}

	@Override
	public boolean isdeleteemployeebyID(int eid) {
		   try {
			   stmt=conn.prepareStatement("delete from employee where eid=?");
			   stmt.setInt(1, eid);
			   int value=stmt.executeUpdate();
			   return value>0?true:false;
				
					   
		   }
		   catch(Exception ex)
		   {
			   System.out.println("error is isdeleteemployeebyID:>..."+ex);
		   }
		return false;
	}
	@Override
	public boolean isupdateemployee(employeemodel model) {
		try
		{
			stmt=conn.prepareStatement("update employee set name=?,email=?,contact=?,address=?,salary=? where eid=?");
			stmt.setString(1, model.getName());
			stmt.setString(2, model.getEmail());
			stmt.setString(3,model.getContact());
			stmt.setString(4,model.getAddress());
			stmt.setInt(5, model.getSalary());
			stmt.setInt(6,model.getEid());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("error is isupdateemployee:>...."+ex);
		}
		return false;
	}
	@Override
	public boolean alloacatemachine(int eid, int mid, String ...x) {
		try {
			stmt=conn.prepareStatement("insert into employeemachinejoin values(?,?,?,?,?)");
			stmt.setInt(1, eid);
			stmt.setInt(2, mid);
			stmt.setString(3, x[0]);
			stmt.setString(4, x[1]);
//			 String s[]=x[2].split("-");
//			 java.sql.Date d=new java.sql.Date(Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
			 stmt.setString(5,x[2]);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is alloacatemachine...>"+ex);
		}
		return false;
	}
	@Override
	public int varifyEmployee(String email, String contact) {
           try {
        	   stmt=conn.prepareStatement("select * from employee where email=? and contact=?");
        	   stmt.setString(1,email);
        	   stmt.setString(2,contact);
        	   rs=stmt.executeQuery();
        	    if(rs.next())
        	    {
        	    	return rs.getInt("eid");
        	    }
        	    else
        	    {
        	    	return 0;
        	    }
           }
           catch(Exception ex)
           {
        	   System.out.println("Error is varifyEmployee...>"+ex);
           }
		return 0;
	}
	@Override
	public employeemodel getprofile(int eid) {
        try {
        	stmt=conn.prepareStatement("select * from employee where eid=?");
        	stmt.setInt(1, eid);
        	rs=stmt.executeQuery();
        	employeemodel model=new employeemodel();
        	if(rs.next())
        	{
             	model.setEid(rs.getInt(1));
        		model.setName(rs.getString(2));
        		model.setEmail(rs.getString(3));
        		model.setContact(rs.getString(4));
        		model.setAddress(rs.getString(5));
        		model.setSalary(rs.getInt(6)); 		     		
        	}
        	return model;
        }
        catch(Exception ex) {
        	System.out.println("Error is getprofile:>>>>"+ex);
        }
		return null;
	}

	@Override
	public int getmid(int eid) {
		
		try {
			stmt=conn.prepareStatement("select * from employeemachinejoin where eid=?");
			  stmt.setInt(1, eid);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt("mid");
			}
			else {
				return 0;
			}
		}
		catch(Exception ex)
		{
			System.out.println("error is getmid>:...."+ex);
		}
		
		
		return 0;
	}
	@Override
	public List<Object[]> viewallocatemachineinfobyID(int eid, int mid) {
		try {		
        	stmt=conn.prepareStatement("select m.mname,e.name,em.stime,em.etime,em.date,em.mid,em.eid from employeemachinejoin em inner join machineinfo m on em.mid=m.mid inner join employee e on e.eid=em.eid");      	
        	rs=stmt.executeQuery();
        	while(rs.next())
        	{
        		Object obj1[]=new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(7)};
        		list1.add(obj1);     		
        		
        	}
        	
        	return list1.size()>0?list1:null;
        }
        catch(Exception ex) {  
        	System.out.println("Error is repository viewallocatemachineinfobyID:>>>>"+ex);
        }
		return null;
	}
	
	@Override
	public boolean isaddbill(billingmodel model) {
		try {
			stmt=conn.prepareStatement("insert into billing values(?,?,?,?,?,?,?)");
			stmt.setInt(1,model.getMid());
			stmt.setInt(2, model.getId());
			stmt.setInt(3, model.getEid());
			stmt.setInt(4, model.getQuantity());
			stmt.setInt(5, model.getPrice());
			stmt.setInt(6, model.getTotal());
			stmt.setString(7, model.getBdate());
			int value=stmt.executeUpdate();
			return (value>0)?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("error is billing repo:>>>>"+ex);
		}
		return false;
	}
	@Override
	public List<Object[]> getsellingreport() {
		  try { 								
			 stmt=conn.prepareStatement("select m.mname,e.name,e.eid,f.name,b.quantity,b.price,b.total,b.bdate from machineinfo m inner join billing b on m.mid=b.mid inner join fueltype f on b.id=f.id inner join employee e on e.eid=b.eid");
			 rs=stmt.executeQuery();
			 while(rs.next())
			 {
				 Object obj[]=new Object[] {
						 rs.getString(1),
						 rs.getString(2),
						 rs.getInt(3),
						 rs.getString(4),
						 rs.getInt(5),
						 rs.getInt(6),
						 rs.getInt(7),
						 rs.getString(8)
						 };
				 list2.add(obj);			 
			 }
			 return list2.size()>0?list2:null;
		  }
		  catch(Exception ex)
		  {
			  System.out.println("Error is getsellingreport:>>>>"+ex);
		  }
		return null;
	}
	@Override
	public int gettotal() {
		try {
			stmt=conn.prepareStatement("select sum(total) as totalvalue from billing");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				int sum=rs.getInt("totalvalue");
				return sum;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is repo gettotal:>>>"+ex);
		}
		return 0;
	}
	@Override
	public int todaygettotal() {
		try {
		
			int eid=1;
			stmt=conn.prepareStatement("select sum(total) as totali from billing where bdate=curdate()");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				int tali=rs.getInt("totali");
				return tali;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is repo todaygettotal:>>>"+ex);
		}
		return 0;
	}
	@Override
	public int todaygettotalbyEMPID(int eid) {
		try {
			stmt=conn.prepareStatement("select sum(total) as tobyid from billing where bdate=curdate() and eid='"+eid+"'");
			rs=stmt.executeQuery();
			if(rs.next())
			{
				int total=rs.getInt("tobyid");
				return total;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is repo todaygettotalbyEMPID:>>>"+ex);
		}
		return 0;
	}

}
