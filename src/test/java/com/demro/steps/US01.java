package com.demro.steps;

import com.demro.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US01 {
    @Given("Establish the database connection")
    public void establish_the_database_connection() {
        DB_Util.createConnection();
        System.out.println("shabault cyka");
    }
    @When("Execute query to get all IDs from users")
    public void execute_query_to_get_all_i_ds_from_users() {
    }
    @Then("verify all users has unique ID")
    public void verify_all_users_has_unique_id() {
    }

    @When("Execute query to get all columns")
    public void execute_query_to_get_all_columns() {
    }

    @Then("verify the below columns are listed in result")
    public void verify_the_below_columns_are_listed_in_result(io.cucumber.datatable.DataTable dataTable) {

    }
}
