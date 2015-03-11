package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



import com.heloo.models.User;


public class Project {
	
	
	public ArrayList<User> GetFeeds(Connection connection,String id) throws Exception
	{
		ArrayList<User> feedData = new ArrayList<User>();
		try
		{
			
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM user WHERE id=? ORDER BY id DESC");
			ps.setString(1,id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				User feedObject = new User();
				feedObject.setId(rs.getString("id"));
				feedObject.setFname(rs.getString("fname"));
				feedObject.setLname(rs.getString("lname"));
				feedObject.setGender(rs.getString("gender"));
				feedObject.setEmail(rs.getString("email"));
				feedObject.setGender(rs.getString("gender"));
				feedObject.setNumbertel(rs.getString("numbertel"));
				feedObject.setLogin(rs.getString("login"));
				feedObject.setPassword(rs.getString("password"));
				feedObject.setAddress(rs.getString("address"));
				feedData.add(feedObject);
			}
			return feedData;
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
}
