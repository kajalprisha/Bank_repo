package CreateAccountTest;

import org.testng.annotations.Test;

public class UpdateAccountTest {

	@Test(groups="regressionTest")
	public void updateAccount() {
		System.out.println("account is updated");
	}
	@Test(groups="smokeTest")
	public void updateMyAccount() {
		System.out.println("my account is updated");
	}
}
