package com.keepit.rest.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.keepit.rest.response.UsersResponse;
import com.keepit.rest.util.InitWebTarget;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.testng.Assert.assertEquals;

public class UsersTest extends InitWebTarget {

    @Parameters({"guid"})
    @Test
    public void test(String guId) {
        //building the request
        Response response = keepItWebTarget
                .path("/users/"+guId)
                .request(MediaType.APPLICATION_XML)
                .get();
        //getting our response
        UsersResponse usersResponse = response.readEntity(UsersResponse.class);

        //getting values from response
        boolean isEnabled = usersResponse.isEnabled();
        boolean isSubscribed = usersResponse.isSubscribed();
        String responseCreated  = usersResponse.getCreated();
        String responseProduct  = usersResponse.getProduct();
        String responseParent  = usersResponse.getParent();
        int statusCode = response.getStatus();

        //verifying actual data with expected
        assertEquals(statusCode, 200);
        assertEquals(isEnabled, true);
        assertEquals(isSubscribed, true);
        assertEquals(responseCreated, "2019-02-28T13:07:49Z");
        assertEquals(responseProduct, "7dwqnq-5cvrcm-1z3ehj");
        assertEquals(responseParent, "80ltks-yhfls5-24zyf2");
    }

}
