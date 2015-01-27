		import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class mainPersonDB2 
{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{

		Class.forName("org.h2.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM Person");

		while( rs.next() )
		{
			Person p = new  Person( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			System.out.println( p );
		}
		st.close();
		conn.close();
	}

}
