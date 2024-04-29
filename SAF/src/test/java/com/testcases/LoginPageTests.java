package com.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.pages.LoginPage;

import java.util.Hashtable;

public class LoginPageTests extends BaseTest {

    LoginPage loginpage;

    @Test
    public void loginTest(Hashtable<String,String> data) {
        loginpage = new LoginPage();
        loginpage.login(data.get("username"));
    }


}
