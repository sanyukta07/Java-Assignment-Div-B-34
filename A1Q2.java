import java.io.*;
class employee
{
	private String name;
	private int employeeId;
	private double wage;
	private boolean fullTime;
	employee(String name, int employeeId, double wage,boolean fullTime)
	{	
		this.name=name;
		this.employeeId=employeeId;
		this.wage=wage;
		this.fullTime=fullTime;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	public int getEmpId()
	{
		return employeeId;
	}
	public void setEmpId(int employeeId)
	{
		this.employeeId=employeeId;
	}
	public double getWage()
	{
		return wage;		
	}
	public void setWage(Double wage)
	{
		this.wage=wage;
	}
	public String getfullTime()
	{	
		if(fullTime){
			String temp="full time";
			return temp;
		}
		else
		{
			String temp="part time";
			return temp;
		
		}
		
	}
	public void setfullTime(boolean fullTime)
	{
		this.fullTime=fullTime;
	}
	public String printDet()
	{	
		String str="name: "+ getName() +", empid: "+ getEmpId()+", wage: "+ getWage()+", Working Status: "+getfullTime();
		return str;
	}
}
public class A1Q2
{
	public static void main(String args[]) throws IOException
	{	
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("enter the name of the employee");
		String name=br.readLine();
		System.out.println("enter employee id");
		int employeeId=Integer.parseInt(br.readLine());
		System.out.println("enter employee wage");
		double wage=Double.parseDouble(br.readLine());
		System.out.println("enter employee working type");
		boolean fullTime=Boolean.parseBoolean(br.readLine());
		employee emp=new employee(name,employeeId,wage,fullTime);	
		emp.setName(name);
		emp.setEmpId(employeeId);
		emp.setWage(wage);
		emp.setfullTime(fullTime);
		System.out.println(emp.printDet());  	
	}

}