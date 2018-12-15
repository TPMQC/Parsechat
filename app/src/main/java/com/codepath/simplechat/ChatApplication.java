package com.codepath.simplechat;

import android.app.Application;

import com.parse.Parse;

public class ChatApplication extends Application {

    public void onCreate(){
        super.onCreate();

//        // Use for monitoring Parse network traffic
//        OkHttpClient.Builder builder = new OkHttpClient.Builder();
//        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
//        // Can be Level.BASIC, Level.HEADERS, or Level.BODY
//        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        builder.networkInterceptors().add(httpLoggingInterceptor);

        // set applicationId and server based on the values in the Heroku settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("simplechat-client")
                .server("https://codepath-chat-lab.herokuapp.com/parse/").build());
                //.addNetworkInterceptor(new ParseLogInterceptor()).build());
    }

}
