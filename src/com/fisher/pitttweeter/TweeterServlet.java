package com.fisher.pitttweeter;

import java.io.IOException;
import javax.servlet.http.*;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

@SuppressWarnings("serial")
public class TweeterServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		try 
        {
            // configuring twitter4j
            ConfigurationBuilder cb = new ConfigurationBuilder();
            cb.setOAuthConsumerKey("x");
            cb.setOAuthConsumerSecret("x");
            cb.setOAuthAccessToken("x");
            cb.setOAuthAccessTokenSecret("x");
            // get Twitter instance
            Twitter twitter = new TwitterFactory(cb.build()).getInstance();
            // get tweet
            String newTweet = request.getParameter("text");
            if ((newTweet.length() > 140) || (newTweet.isEmpty()))
            {
            	// invalid tweet, respond with error
            	// user should hopefully never see this
            }
            else
            {
           		// tweeting
            	twitter.updateStatus(newTweet);
            	// send success response
            }
        }
        catch(TwitterException te)
        {
            te.printStackTrace();
            System.out.println("Twitter4j Error: " + te.getMessage());
            System.exit(-1);
        }
	}
}