package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class myHooks {
	@Before(order = 1)
	public void setupOne(Scenario scenario) {
		System.out.println("+++ == Setup one before hook got executed");
		System.out.println("*** Execution setup for the scenario :" + scenario.getName());

	}

	@Before(order = 0)
	public void setupTwo() {
		System.out.println("+++ == Setup two before hook got executed");

	}

	@After()
	public void tearDownone(Scenario scenario) {
		System.out.println("+++ == Teardown one After hook got executed");
		System.out.println("&& Execution ended with the scenario :" + scenario.getName());
	}

}
