import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class mainPersonDB3
{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{

		Class.forName("org.h2.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa", "");
		Statement st = conn.createStatement();
		st.executeUpdate("insert into person values(33,'Geria', 'Fotus', 23)");
		st.close();
		conn.close();
	}

}
