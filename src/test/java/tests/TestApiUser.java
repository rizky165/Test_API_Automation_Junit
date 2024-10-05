package tests;

import io.cucumber.java.*;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;


public class TestApiUser {

    @BeforeAll
    public static void before(){
        System.out.println("Execute before");
    }

    @AfterAll
    public static void after(){
        System.out.println("Execute After");
    }


}
