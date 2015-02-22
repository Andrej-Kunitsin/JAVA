package qwe;


public class Person 
{
	private	int Id;
	private	String FName;
	private	String LName;
	private	int Age;

	public Person(){}
	public Person(int Id, String FName, String LName, int Age) 
	{
		init(Id, FName, LName, Age);
	}
	public void init( int Id, String FName, String LName, int Age)
	{
		this.Id = Id;
		this.FName = FName;
		this.LName = LName;
		this.Age = Age;
	}
	public String toJsonString()
	{
		String str = "{";
		str += "\"Id\":"+Id+",";
		str += "\"FName\":"+FName+",";
		str += "\"LName\":"+LName+",";
		str += "\"Age\":"+Age+",";
		str += "}";
		return str;
	}
	public void fromJsonString(String str)
	{
		  str = str.substring(1, str.length()-1);
		  String[] s = str.split(",");
		  
		  //ID
		  String[] sId = s[0].split(":");
		  this.Id = Integer.parseInt(sId[1]);
		  //FName
		  String[] sFName = s[1].split(":");
		  String tmp1 = sFName[1].substring(1, sFName[1].length()-1);
		  this.FName = tmp1;
		  //LName
		  String [] sLName = s[2].split(":");
		  tmp1 = sLName[1].substring(1, sLName[1].length()-1);
		  this.LName = tmp1;
		  //Age
		  String[] sAge = s[3].split(":");
		  this.Age = Integer.parseInt(sAge[1]);
	}
		
	
	public String toXMLString()
	{
		String str = "<Person>\n";
		str += "   <Id> " +Id+"</Id>\n";
		str += "   <FName> " +FName+"</ FName>\n";
		str += "   <LName> " +LName+"</LName>\n";
		str += "   <Age>  "  +Age+"</Age>\n";
		str += "</Person\n>";
		return str;
	}
	public void  FromXMLString(String str)
	{
		
		int start = str.indexOf("<Id>");
		int end   = str.indexOf("</Id>");
	    String id = str.substring(start+4, end);
	    System.out.println(id);
		this.Id = Integer.parseInt(id);
		
		start = str.indexOf("<FName>");
		end   = str.indexOf("</FName>");
	    String FName = str.substring(start+7, end);
	    System.out.println(FName);
		this.FName = FName;
		
		start = str.indexOf("<LName>");
		end   = str.indexOf("</LName>");
	    String LName = str.substring(start+7, end);
	    System.out.println(LName);
		this.LName = LName;
		
		start = str.indexOf("<Age>");
		end   = str.indexOf("</Age>");
	    String Age = str.substring(start+5, end);
	    System.out.println(Age);
		this.Age = Integer.parseInt(Age);
		
		
		
	}
	public String toString()
	{
		String str = "";
		str = Id + "," + FName + "," + LName + "," + Age;
		return str;
	}

	public int getId() 
	{
		return Id;
	}

	public void setId(int id) 
	{
		Id = id;
	}

	public String getFName()
	{
		return FName;
	}

	public void setFName(String fName)
	{
		FName = fName;
	}

	public String getLName() 
	{
		return LName;
	}

	public void setLName(String lName) 
	{
		LName = lName;
	}

	public int getAge() 
	{
		return Age;
	}

	public void setAge(int age)
	{
		Age = age;
	}

}


