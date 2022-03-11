package starter.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import net.thucydides.core.annotations.Steps;
import starter.navigation.AcceptCookies;
import starter.navigation.NavigateTo;

public class VolvoCarStepDefinitions {

    @Steps
    NavigateTo navigateTo;
    
    @Steps
    AcceptCookies acceptcookies;

    
    
       @Given("i am on the volvocar home page")
    public void i_am_on_the_volvocar_home_page() {
        navigateTo.VolvoCarHomePage();
    }
       
       @And("Click on AcceptButton")
       public void Click_on_AcceptButton() throws Exception {
    	   acceptcookies.Acceptcookies();
       }

}
