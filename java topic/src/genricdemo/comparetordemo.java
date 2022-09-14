package genricdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparetordemo implements Comparator<Employee> {
	
	
	
	public int compare(Employee e1, Employee e2) 
	{
		int value=0;
		
		if(e1.getEsalary()>e2.getEsalary())
		{
			value = 1;
		}
		else if(e1.getEsalary()<e2.getEsalary())
		{	
			value = -1;
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
		e1.setEname("Manan");
		e1.setEsalary(25000.00);
		
		list.add(e1);
		
		Collections.sort(list, new comparetordemo());
		
		for(Employee e : list)
		{
			System.out.println("Eid	"+e.getEid()+"\nEname	"+e.getEname()+"\nEsalary	"+e.getEsalary());
		}
	}
}
