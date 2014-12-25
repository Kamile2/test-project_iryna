package com.example.tests;

import org.testng.annotations.Test;

public class AddNewContactTests extends TestBase {
  @Test
  public void addNewContactWithData() throws Exception {
    openMainPage();
    addNewContact();
    ContactData contact = new ContactData();
    contact.firstName = "iryna";
    contact.lastName = "Nizamiyeva2";
    contact.address = "Kiev";
    contact.home = "Kiev";
    contact.mobile = "999";
    contact.email = "myemail@i.ua";
    contact.email2 = "email2@i.ua";
    contact.birthdayDate = "18";
    contact.birthdayMonth = "November";
    contact.birthdayYear = "1984";
    contact.groupSelectionValue = "name1";
    contact.address2 = "kiev2";
    contact.phone2 = "888";
	fillAllFieldsForContact(contact);
    submitAddingContact();
    backToHomePage();
  }

  @Test
  public void addNewContactWithoutData() throws Exception {
    openMainPage();
    addNewContact();
    fillAllFieldsForContact(new ContactData("", "", "", "", "", "","", "" ,"", "", "", "", "",""));
    submitAddingContact();
    backToHomePage();
  }
}
