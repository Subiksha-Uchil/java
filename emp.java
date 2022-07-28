public class emp
{
	int empID;
	String empName;
	emp(int id, String name)
	{
		this.empID=id;
     	this.empName=name;
	}
	void info()
	{
		System.out.println("ID:"+empID+"Name:"+empName);
	}
	public static void main(String[] args)
	{
		emp obj1 = new emp(100,"Jack");
		emp obj2 = new emp(109,"John");
		obj1.info();
		obj2.info();
	}
}