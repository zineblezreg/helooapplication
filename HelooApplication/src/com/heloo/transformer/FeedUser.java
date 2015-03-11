package com.heloo.transformer;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.heloo.models.User;
import com.heloo.transformer.*;

public class FeedUser 
{
  public static String UserFeed(ArrayList<User> feedData)
	{
	String feeds  = null;
	Gson gson = new Gson();
	feeds = gson.toJson(feedData);
	return feeds;
	}
}
