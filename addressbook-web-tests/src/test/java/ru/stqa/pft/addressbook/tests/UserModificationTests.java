package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserModificationTests extends TestBase {

  @Test
  private void testUserModification() {
    app.getNavigationHelper().gotoUserPage();
    app.getUserHelper().selectUser();
    app.getUserHelper().initUserModification();
    app.getUserHelper().fillUserForm(new UserData("Test10", "Test21", "Test31", "Test41", "Test51", "Test61", "Test71", "Test81", "Test91", "Test101", "Test111", "Test121", "Test113", "Test114", "Test115", "1990", "1991", "Test116", "Test117", "\\91"));
//    app.getUserHelper().fillUserForm(new UserData("Test1", "Test2", "Test3", "Test4", "Test5", "Test6", "Test7", "Test6", "Test9", "Test10", "Test11", "Test12", "Test13", "Test14", "Test15", "1998", "1999", "Test16", "Test17", "\\9"));
    app.getUserHelper().submitUserModification();
    app.getNavigationHelper().gotoUserPage();




  }





}
