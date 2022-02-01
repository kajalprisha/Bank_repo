package CreateAccountTest;

import org.testng.annotations.Test;

public class CreateNewAccountTest {
	@Test(groups="smokeTest")
	 public void createAccountTest() {
		System.out.println("account created ========>" + System.getProperty("BROWSER") );
	}
	@Test(groups="regressionTest")

	 public void createAccountWithNoBalanceTest() {
			System.out.println("account created with no balance");
		}

}
