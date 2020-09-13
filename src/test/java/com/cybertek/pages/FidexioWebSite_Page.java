package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioWebSite_Page {



    public FidexioWebSite_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log In")
    public WebElement loginBtn;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement email;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMsg;

    @FindBy (className = "img img-responsive")
    public WebElement fidexioLogo;

    @FindBy (linkText = "Contact")
    public WebElement contactBtn;

    @FindBy (xpath = "//h4[@class='et_pb_module_header']")
    public WebElement officeAddress;


}
