package com.library.steps;

import com.library.pages.BookPage;
import com.library.pages.DashBoardPage;
import com.library.utility.BrowserUtil;
import com.library.utility.DB_Util;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;



public class US03_StepDefs {

    BookPage bookPage=new BookPage();
    List<String> actualCategoryList;


    @Given("the {string} on the home page")
    public void the_on_the_home_page(String string) {

        System.out.println("--------------------------------------------------");
        System.out.println("--- CONNECTION WILL BE DONE WITH BEFORE HOOK -----");
        System.out.println("--------------------------------------------------");
    }




        @When("the user navigates to {string} page")
    public void the_user_navigates_to_page(String moduleName) {



            new DashBoardPage().navigateModule(moduleName);




    }
    @And("the user clicks book categories")
    public void the_user_clicks_book_categories() {

     bookPage.mainCategoryElement.click();

    }
    @Then("verify book categories must match book_categories table from db")
    public void verify_book_categories_must_match_book_categories_table_from_db() {

        String query = "select name from book_categories";
        //run query to get data from db
        DB_Util.runQuery(query);
        //store the information inside the list
        List<String> expectedCategoryList = DB_Util.getColumnDataAsList(1);
        System.out.println("expectedCategoryList = " + expectedCategoryList);
        //compare UI vs DB
        Assert.assertEquals("Verify category list is matching",actualCategoryList,expectedCategoryList);
    }
    }




