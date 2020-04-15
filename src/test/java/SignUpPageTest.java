import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTest {


    @Test
    @Description("This testcase verify open sign up result page")
    public void signUpTest(){

        BaseClass baseClass = new BaseClass();
        Information information = new Information();

        String actualResult = baseClass
                .openHomePage()
                .goToSignUpPage()
                .setFirstName(information.firstName)
                .setLastName(information.lastName)
                .setPhone(information.phone)
                .setEmail(information.email)
                .setPassword(information.password)
                .setConfirmPassword(information.password)
                .clickSignUpButton()
                .getAccountName();
        Assert.assertEquals(actualResult,information.signUpExpectedResult);
        baseClass.afterTest();

    }
}