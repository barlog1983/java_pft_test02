package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class UserHelper extends HelperBase {

  public UserHelper(FirefoxDriver wd) {super(wd); }

  public void returnToUserPage() {
    click(By.id("content"));
  }


  public void submitUserCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

    public void fillUserForm(UserData userData) {
      type(By.name("firstname"), userData.getFirstname());
      type(By.name("middlename"), userData.getMiddlename());
      type(By.name("middlename"), userData.getMiddlename());
      type(By.name("lastname"), userData.getLastname());
      type(By.name("nickname"), userData.getNickname());
      type(By.name("title"), userData.getTitle());
      type(By.name("company"), userData.getCompanyname());
      type(By.name("address"), userData.getCompanyaddress());
      type(By.name("home"), userData.getHomephone());
      type(By.name("mobile"), userData.getMobilephone());
      type(By.name("work"), userData.getWorkphone());
      type(By.name("fax"), userData.getFax());
      type(By.name("email"), userData.getEmail1());
      type(By.name("email2"), userData.getEmail2());
      type(By.name("email3"), userData.getEmail3());
      type(By.name("homepage"), userData.getHomesite());

      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[1]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[1]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[2]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[2]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[1]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[1]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[1]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[1]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[2]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[4]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[4]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[1]//option[4]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[1]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[2]//option[1]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[2]//option[2]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[2]//option[2]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[2]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[2]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[4]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[2]//option[4]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[4]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[2]//option[4]"));
      }
      type(By.name("byear"), userData.getBirthdayear());
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[1]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[1]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[2]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[2]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[3]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[3]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[4]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[4]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[4]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[4]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[5]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[5]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[5]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[5]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[6]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[6]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[6]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[3]//option[6]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[1]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[4]//option[1]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[4]//option[2]"));
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[4]//option[2]"));
      }
      type(By.name("ayear"), userData.getSecondeyar());
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[9]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[5]//option[9]"));
      }
      type(By.name("address2"), userData.getUseraddress());
      type(By.name("phone2"), userData.getUserphone());
      type(By.name("notes"), userData.getUsernotes());
    }

    public void initUserCreation () {
      click(By.linkText("add new"));
    }

    public void deleteSelectedUser () {
      wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
//      wd.switchTo().alert().accept();
    }

    public void selectUser () {
      if (!wd.findElement(By.name("selected[]")).isSelected()) {
        click(By.name("selected[]"));
      }
    }
  }
