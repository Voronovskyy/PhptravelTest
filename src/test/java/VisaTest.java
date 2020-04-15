import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VisaTest {

    @Test
    @Description("This testcase verify open visa result page")
    public void testVisaBooking(){
        BaseClass baseClass = new BaseClass();
        Information information = new Information();

        String actualResult = baseClass
                .openHomePage()
                .clickVisaContainerButton()
                .selectVisaFromCountryField(information.visaFromCountry)
                .selectVisaToCountryField(information.visaToCountry)
                .setDate(information.actualDate)
                .clickSubmitButton()
                .setFirstName(information.visaFirstName)
                .setLastName(information.visaLastName)
                .setEmail(information.visaEmail)
                .setConfirmEmail(information.visaEmail)
                .setPhone(information.visaPhone)
                .checkAdditionalRequests()
                .clickBookingButton()
                .getConfirmationText();
        baseClass.afterTest();
        Assert.assertEquals(actualResult,information.visaExpectedResult);

    }
}