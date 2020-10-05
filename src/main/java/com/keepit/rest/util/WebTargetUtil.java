package com.keepit.rest.util;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.filter.LoggingFilter;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class WebTargetUtil {


    protected static final String  USERNAME = "automation@keepitqa.com";
    protected static final String  PASSWORD = "E#*b2wGIbFHz";

    //login and initialization URL
    public static WebTarget init() {
        ClientConfig clientConfig = new ClientConfig();
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(USERNAME, PASSWORD);
        clientConfig.register( feature) ;
        Client client = ClientBuilder.newClient(clientConfig.register(LoggingFilter.class));
        return client.target("https://ws-test.keepit.com");
    }
}
