package com.river.stepdefinition;

import com.river.pageobject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeSteps {
    HomePage homePage= new HomePage();
    @Given("^user is on home page$")
    public void user_is_on_home_page()  {

    }
    @Then("^user click on men$")
    public void user_click_on_men()  {
        homePage.selection();

    }
    @Then("^user clicked on tops$")
    public void user_clicked_on_tops()  {
        homePage.clickAction();

    }
    @Then("^user chose size$")
    public void user_chose_size()  {
        homePage.choseSize();

    }
    @Then("^user chose M$")
    public void user_chose_M()  {
       homePage.choice();
    }

}
