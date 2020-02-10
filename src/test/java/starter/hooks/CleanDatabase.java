package starter.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CleanDatabase {

    @Before
    public static void beforeHook() {
        System.out.println("before hook");
    }

    @Before("@foo")
    public static void beforeHookFoo() {
        System.out.println("before hook foo");
    }

    @After
    public static void afterHook() {
        System.out.println("after hook");
    }

}
