package work080215;
public class Person
{
	private int Id;
	private String FName;
	private String LName;
	private int Age;

	public Person()
	{
	}

	public Person(int Id, String FName, String LName, int Age)
	{
		this.Id = Id;
		this.FName = FName;
		this.LName = LName;
		this.Age = Age;
	}

	public void init(int Id, String FName, String LName, int Age)
	{
		this.Id = Id;
		this.FName = FName;
		this.LName = LName;
		this.Age = Age;
	}

	@Override
	public String toString()
	{
		String str = Id + " " + FName + " " + LName + " " + Age;
		return str;
	}

	public int getId()
	{
		return this.Id;
	}

	public String getFName()
	{
		return this.FName;
	}

	public String getLName()
	{
		return this.LName;
	}

	public int getAge()
	{
		return this.Age;
	}

	public void setId(int id)
	{
		Id = id;
	}

	public void setFName(String fName)
	{
		FName = fName;
	}

	public void setLName(String lName)
	{
		LName = lName;
	}

	public void setAge(int age)
	{
		Age = age;
	}

}
