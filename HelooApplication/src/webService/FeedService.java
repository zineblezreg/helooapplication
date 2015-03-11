package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import dao.UserManager;
import com.heloo.transformer.FeedUser;
import com.heloo.models.User;


@Path("/WebService")
public class FeedService {
	
	@GET
	@Path("/GetFeeds")
	@Produces("application/json")
	public String messageFeed(@QueryParam("id") String id)
	{
		String feeds  = null;
		try 
		{
			ArrayList<User> feedData = null;
			UserManager projectManager= new UserManager();
			feedData = projectManager.GetFeeds(id);
			feeds=FeedUser.UserFeed(feedData);
			

		} catch (Exception e)
		{
			System.out.println("error");
		}
		return feeds;
	}

}
