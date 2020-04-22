import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFlightsTest {

    @Test
    @Description("This testcase verify that flights result page open")
    public void testFlightSearch(){

        BaseClass baseClass = new BaseClass();
        Information information = new Information();

        String actualResult = baseClass
                .openHomePage()
                .goToFlightsSearchMenu()
                .chooseFlightsType()
                .setValueIntoFlightsFromField(information.flightsFromValue)
                .setValueIntoFlightsToField(information.flightsToValue)
                .clickSearchFlights()
                .getFlightsConfirmationText();
        Assert.assertEquals(actualResult,information.flightsExpectedResult);
        baseClass.afterTest();
    }

}
