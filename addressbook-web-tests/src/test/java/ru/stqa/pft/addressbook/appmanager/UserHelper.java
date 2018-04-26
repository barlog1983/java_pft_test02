package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class UserHelper extends HelperBase {

  public UserHelper(FirefoxDriver wd) {super(wd); }

  public void returnToUserPage() {
    wd.findElement(By.id("content")).click();
  }


  public void submitUserCreation() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

    public void fillUserForm(UserData userData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(userData.getFirstname());
      wd.findElement(By.name("middlename")).click();
      wd.findElement(By.name("middlename")).clear();
      wd.findElement(By.name("middlename")).sendKeys(userData.getMiddlename());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(userData.getLastname());
      wd.findElement(By.name("nickname")).click();
      wd.findElement(By.name("nickname")).clear();
      wd.findElement(By.name("nickname")).sendKeys(userData.getNickname());
      wd.findElement(By.name("title")).click();
      wd.findElement(By.name("title")).clear();
      wd.findElement(By.name("title")).sendKeys(userData.getTitle());
      wd.findElement(By.name("company")).click();
      wd.findElement(By.name("company")).clear();
      wd.findElement(By.name("company")).sendKeys(userData.getCompanyname());
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("address")).clear();
      wd.findElement(By.name("address")).sendKeys(userData.getCompanyaddress());
      wd.findElement(By.name("home")).click();
      wd.findElement(By.name("home")).clear();
      wd.findElement(By.name("home")).sendKeys(userData.getHomephone());
      wd.findElement(By.name("mobile")).click();
      wd.findElement(By.name("mobile")).clear();
      wd.findElement(By.name("mobile")).sendKeys(userData.getMobilephone());
      wd.findElement(By.name("work")).click();
      wd.findElement(By.name("work")).clear();
      wd.findElement(By.name("work")).sendKeys(userData.getWorkphone());
      wd.findElement(By.name("fax")).click();
      wd.findElement(By.name("fax")).clear();
      wd.findElement(By.name("fax")).sendKeys(userData.getFax());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(userData.getEmail1());
      wd.findElement(By.name("email2")).click();
      wd.findElement(By.name("email2")).clear();
      wd.findElement(By.name("email2")).sendKeys(userData.getEmail2());
      wd.findElement(By.name("email3")).click();
      wd.findElement(By.name("email3")).clear();
      wd.findElement(By.name("email3")).sendKeys(userData.getEmail3());
      wd.findElement(By.name("homepage")).click();
      wd.findElement(By.name("homepage")).clear();
      wd.findElement(By.name("homepage")).sendKeys(userData.getHomesite());
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[1]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[1]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[2]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[2]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[2]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[2]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[1]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[1]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[1]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[1]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[2]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[2]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[1]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[1]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[4]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[4]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[4]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[4]")).click();
      }
      wd.findElement(By.name("byear")).click();
      wd.findElement(By.name("byear")).clear();
      wd.findElement(By.name("byear")).sendKeys(userData.getBirthdayear());
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[1]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[1]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[2]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[2]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[2]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[2]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[3]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[3]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[3]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[3]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[4]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[4]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[4]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[4]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[5]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[5]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[5]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[5]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[6]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[6]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[6]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[6]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[1]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[1]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).click();
      }
      wd.findElement(By.name("ayear")).click();
      wd.findElement(By.name("ayear")).clear();
      wd.findElement(By.name("ayear")).sendKeys(userData.getSecondeyar());
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[9]")).isSelected()) {
        wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[9]")).click();
      }
      wd.findElement(By.name("address2")).click();
      wd.findElement(By.name("address2")).clear();
      wd.findElement(By.name("address2")).sendKeys(userData.getUseraddress());
      wd.findElement(By.name("phone2")).click();
      wd.findElement(By.name("phone2")).clear();
      wd.findElement(By.name("phone2")).sendKeys(userData.getUserphone());
      wd.findElement(By.name("notes")).click();
      wd.findElement(By.name("notes")).clear();
      wd.findElement(By.name("notes")).sendKeys(userData.getUsernotes());
    }

    public void initUserCreation () {
      wd.findElement(By.linkText("add new")).click();
    }

    public void deleteSelectedUser () {
      wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
//      wd.switchTo().alert().accept();
    }

    public void selectUser () {
      if (!wd.findElement(By.name("selected[]")).isSelected()) {
        wd.findElement(By.name("selected[]")).click();
      }
    }
  }
