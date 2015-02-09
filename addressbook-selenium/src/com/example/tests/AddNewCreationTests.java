package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddNewCreationTests extends TestBase{
  
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    openMainPage();
    goToGroupsPage();
    initGroupCreation();
    GroupData group = new GroupData();
    group.name = "name1";
    group.header = "header1";
    group.footer = "footer1";
	fillGroupForm(group);
    submitGroupCreation();
    returnToGroupsPage();
  }


  @Test
  public void testEmptyGroupCreation() throws Exception {
    openMainPage();
    goToGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupData("", "", ""));
    submitGroupCreation();
    returnToGroupsPage();
  }
  //added comments for checking how push done
}
