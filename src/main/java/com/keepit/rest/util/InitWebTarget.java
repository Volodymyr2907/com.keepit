package com.keepit.rest.util;
import org.testng.annotations.BeforeSuite;

import javax.ws.rs.client.WebTarget;

public class InitWebTarget {

    protected static WebTarget keepItWebTarget;

    public static WebTarget initWebTarget() {
        if (keepItWebTarget == null) {
            keepItWebTarget = WebTargetUtil.init();
        }
        return keepItWebTarget;
    }

//setting up our web URL
    @BeforeSuite
    public void setUpBeforeSuite(){
        initWebTarget();
    }
}
