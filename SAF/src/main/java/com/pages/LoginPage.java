package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.browser.Driver;
import com.listener.ListenerClass;
import com.reports.ExtentReport;
import com.utils.ReadPropertyFile;

import com.utils.TestUtils;

public class LoginPage extends BasePage {

    @FindBy(name = "identifier")
    WebElement txtbox_email;

    @FindBy(xpath = "//span[text()='Next']")
    WebElement btn_next;


    public void login(String username) {
        //sendkeys(txtbox_email, TestUtils.getCellContent("TestData", ListenerClass.getTestcaseName(), "username"));
        sendkeys(txtbox_email,username);
        click(btn_next);
    }
}
