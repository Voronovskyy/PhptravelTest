import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest {

    @Test
    @Description("This testcase verify that result login page open")
    public void loginTest(){

        BaseClass baseClass = new BaseClass();
        Information information = new Information();

        String actualResult = baseClass
                .openHomePage()
                .goToLoginPage()
                .setUserName(information.userName)
                .setPassword(information.userPassword)
                .clickSearchButton()
                .getAccountText();
        Assert.assertEquals(actualResult,information.loginExpectedResult);
        baseClass.afterTest();

    }
}