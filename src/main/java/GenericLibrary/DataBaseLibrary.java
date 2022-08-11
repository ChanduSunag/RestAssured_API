package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * This class contains all the database generic methods
 * @author Chandan
 *
 */

public class DataBaseLibrary {

	Driver driverRef;
	Connection conn;

	/**
	 * This method will establish connect with MYSql database
	 * @throws SQLException
	 */
	public void connectToDB() throws SQLException {
		driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		conn=DriverManager.getConnection(IConstants.dbURL, IConstants.dbUsername, IConstants.dbPassword);

	}

	/**
	 * This method will close the database
	 * @throws SQLException
	 */
	public void closeDB() throws SQLException {
		conn.close();
	}

	/**
	 * This method will excute query and return the value only if the validation is
	 * @param query
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException
	 */
	public String readDataFromDBAndValidate(String query, int columnIndex, String expData) throws SQLException {
		boolean flag = false;
		ResultSet result = conn.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
			{
				flag = true;
				break;
			}
		}
		if(flag)

		{
			System.out.println("Data verified");
			return expData;
		}
		else
		{
			System.out.println("Data not verified");
			return "";
		}
	}
}
