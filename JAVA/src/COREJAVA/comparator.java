package COREJAVA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class comparator implements Comparator<Employee>{

	
	@Override
	public int compare(Employee e1, Employee e2) {
		int value=1;
		
		if(e1.getEsalary()>e2.getEsalary())
		{
			value = -1;  
		}
		else if(e1.getEsalary()<e2.getEsalary()) 
		{
			value = 1;
		}
		else if(e1.getEsalary()==e2.getEsalary())
		{
			value = 0;
		}
		
		return value;
		
	}
public static void main(String[] args) {
		 ArrayList<Employee> list = new ArrayList<Employee>();
		 
		 Employee e1 = new Employee();
		 e1.setEid(1);
		 e1.setEname("manan");
		 e1.setEsalary(12000);
		 
		 Employee e2 = new Employee();
		 e2.setEid(2);
		 e2.setEname("swati");
		 e2.setEsalary(13000);
		 
		 Employee e3 = new Employee();
		 e3.setEid(3);
		 e3.setEname("Harsh");
		 e3.setEsalary(4000);
		 
		 Employee e4 = new Employee();
		 e4.setEid(4);
		 e4.setEname("gopal");
		 e4.setEsalary(50000);
		 
		 list.add(e1);
		 list.add(e2);
		 list.add(e3);
		 list.add(e4);
		 
		 
		 Collections.sort(list,new comparator());
		 
		 for(Employee e : list)
		 {
			 System.out.println("Eid\t"+e.getEid()+"\nEname\t"+e.getEname()+"\nEsalary\t"+e.getEsalary());
		 }
		 System.out.println("");
		 
	}

}
