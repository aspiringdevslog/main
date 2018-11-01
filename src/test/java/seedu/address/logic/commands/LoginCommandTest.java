package seedu.address.logic.commands;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.address.model.person.Accounts;

public class LoginCommandTest {

    private String testUsername = "test-username";
    private String testPassword = "test-password";
    private Accounts account = new Accounts(testUsername, testPassword);


    @Test
    public void executeLoginSuccessful() {
        new CreateCommand(account);
        LoginCommand login = new LoginCommand(account);
        assertTrue(login.getLoginIsSuccessful());
    }

    @Test
    public void executeLoginWithWrongPasswordFailure() {
        new CreateCommand(account);
        String rightUsername = "test-username";
        String wrongPassword = "wrong-password";
        Accounts wrongAccount = new Accounts(rightUsername, wrongPassword);

        LoginCommand login = new LoginCommand(wrongAccount);
        assertFalse(login.getLoginIsSuccessful());
    }


}
