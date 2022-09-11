package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int Eid;
	String Ename;
	double Esalary;

	Employee(int Eid, String Ename, double Esalary)
	{
		this.Eid = Eid;
		this.Ename = Ename;
		this.Esalary = Esalary;
	}
	
	public String toString()
	{
		return "Eno :"+ Eid +"\nEname :"+Ename+"\nEsalary :"+Esalary;
	}
}
public class serialization
{
	public static void main(String[] args) throws Exception
	{
		Employee e = new Employee(1,"manan",10000);
		Employee e3 = new Employee(2,"manan",20000);
		Employee e5 = new Employee(3,"manan",40000);
		FileOutputStream fos = new FileOutputStream("ser1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.writeObject(e3);
		oos.writeObject(e5);
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("ser1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee)ois.readObject();
		Employee e4 = (Employee)ois.readObject();
		Employee e6 = (Employee)ois.readObject();
		System.out.println(e);
		System.out.println(e3);
		System.out.println(e5);
	}
}

