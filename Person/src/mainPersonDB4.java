import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class mainPersonDB4
{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{


		Person [] pp = new Person [9];

		pp[0] = new Person (10, "Vasya","Pupkin",22);
		pp[1] = new Person (20, "Vitya","Pots",26);
		pp[2] = new Person (13, "Vitalya","Ivanov",28);
		pp[3] = new Person (17, "Vova","Salo",62);
		pp[4] = new Person (01, "Dima","Medved",77);
		pp[5] = new Person (65, "Tolik","Shwarz",88);
		pp[6] = new Person (12, "Valya","Shakh",27);
		pp[7] = new Person (45, "Vitya","Potsenko",26);
		pp[8] = new Person (15, "Vitalya","Ivanov",28);

		Class.forName("org.h2.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
		Statement st = conn.createStatement();



		for (int i = 0; i < pp.length; i++) 
		{
			String str = "insert into person values(" + pp[i].getId() +" ,'" +pp[i].getFName() + "', '"+ pp[i].getLName() + "', " +pp[i].getAge()+ ")";
			//System.out.println(str);
			st.executeUpdate(str);
		}
		st.close();
		conn.close();
	}

}