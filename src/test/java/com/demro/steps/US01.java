package com.demro.steps;

import com.demro.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.ResultSet;
import java.util.List;

public class US01 {
    int Cyka1;
    int Cyka2;
    @Given("Establish the database connection")
    public void establish_the_database_connection() {
        DB_Util.createConnection();
        System.out.println("shabault cyka");
    }
    @When("Execute query to get all IDs from users")
    public void execute_query_to_get_all_i_ds_from_users() {
        DB_Util.runQuery("select id from users");
    }
    @Then("verify all users has unique ID")
    public void verify_all_users_has_unique_id() {
        Cyka1 = DB_Util.getColumnCount();
        DB_Util.runQuery("select distinct id from users");
        Cyka2 = DB_Util.getColumnCount();
        Assert.assertEquals(Cyka1,Cyka2);

    }

    @When("Execute query to get all columns")
    public void execute_query_to_get_all_columns() {
        DB_Util.runQuery("select * from users");
    }

    @Then("verify the below columns are listed in result")
    public void verify_the_below_columns_are_listed_in_result(List<String>tchshit) {
        Assert.assertTrue(tchshit.equals(DB_Util.getAllColumnNamesAsList()));
    }
}
