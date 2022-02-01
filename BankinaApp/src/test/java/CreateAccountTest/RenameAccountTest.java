package CreateAccountTest;

import org.testng.annotations.Test;

public class RenameAccountTest {
	@Test(groups="smokeTest")
	public void RenameAccount() {
		System.out.println("rename account");
	}
	@Test(groups="regressionTest")
	public void RenameMyAccount() {
		System.out.println("rename my account");
	}

}
