package utils;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;

public class RestFBUtilities {

// DefaultFacebookClient is the FacebookClient implementation
// that ships with RestFB. You can customize it by passing in
// custom JsonMapper and WebRequestor implementations, or simply
// write your own FacebookClient instead for maximum control.

    FacebookClient facebookClient = new DefaultFacebookClient(Constants.MY_ACCESS_TOKEN, Version.VERSION_3_2);

// It's also possible to create a client that can only access
// publicly-visible data - no access token required.
// Note that many of the examples below will not work unless you supply an access token!

    FacebookClient publicOnlyFacebookClient = new DefaultFacebookClient(Constants.MY_ACCESS_TOKEN, Version.VERSION_3_2);




}
