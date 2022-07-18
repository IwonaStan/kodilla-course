package parametrized_tests.Homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import parametrized_tests.Homework.UserValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"iwona", "IWONA", "iWONa", "Iwona123", "iWONA-123_user"})
    public void validateUsernameShouldReturnTrue (String string) {
        assertTrue(userValidator.validateUsername(string));
    }
    @ParameterizedTest
    @ValueSource(strings = {"i", "Iw", "1,2", "i w o n a", "/", "@"})
    public void validateUsernameShouldReturnFalse (String string) {
        assertFalse(userValidator.validateUsername(string));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void validateUsernameCannotBeEmpty (String string) {
        assertTrue(string == null || string.trim().isEmpty());
    }
    @ParameterizedTest
    @ValueSource(strings = {"iwona@kodilla.pl", "IWONA@KODILLA.PL", "iwona.123@123.pl", "123.IWONA@123.pl"})
    public void validateEmailShouldReturnTrue (String string) {
        assertTrue(userValidator.validateEmail(string));
    }
    @ParameterizedTest
    @ValueSource(strings = {"iwona@pl", "iwona.pl", "@kodilla.pl", "iwona@", "iwona.", ".@kodilla.pl", "iwona@.pl", "iwona.123@kodilla.kodilla"})
    public void validateEmailShouldReturnFalse (String string) {
        assertFalse(userValidator.validateEmail(string));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void validateEmailCannotBeEmpty (String string) {
        assertTrue(string == null || string.trim().isEmpty());
    }
}
