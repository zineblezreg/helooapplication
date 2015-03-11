package dao;


import java.sql.Connection;
import java.util.ArrayList;


import dao.Database;

import dao.Project;
import com.heloo.models.User;

public class UserManager {

	public ArrayList<User> GetFeeds(String id)throws Exception {
		ArrayList<User> feeds = null;
		try {
			    Database database= new Database();
			    Connection connection = database.Get_Connection();
				Project project= new Project();
				feeds=project.GetFeeds(connection,id);
		
		} catch (Exception e) {
			throw e;
		}
		return feeds;
	}

}

