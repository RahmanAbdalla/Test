package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {

    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "ctl00_MainContent_username")
    public WebElement userNameInput;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy (xpath = "//h1[.='Web Orders']")
    public WebElement webOrder;

    @FindBy (xpath = "//a[.='Order']")
    public WebElement orderLinkBtn;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement pricePerUnit;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement calculateBtn;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy (id ="ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCode;

    @FindBy (id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement cardRadioBox;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement date;

    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;

    @FindBy (xpath = "//a[.='View all orders']")
    public WebElement viewAllOrderBtn;

    @FindBy (xpath = "((//tbody)[2]//td)[2]")
    public WebElement johnWickName;



}
