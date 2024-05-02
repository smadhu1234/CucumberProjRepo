package test;

import io.cucumber.java.en.When;

public class ScenarioOutline {
	@When("^User enters valid prouduct into the search box Hardware (.+)$")
	public void user_enters_valid_prouduct_into_the_search_box_hardware(String pname) {
		System.out.println(pname);
	}

}
