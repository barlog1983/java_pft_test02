package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class UserDeletionTests extends TestBase {


    @Test
    public void testUserDeletion() {

        app.getNavigationHelper().gotoUserPage();
        app.getUserHelper().selectUser();
        app.getUserHelper().deleteSelectedUser();
        app.getNavigationHelper().gotoUserPage();

        }

}
