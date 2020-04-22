import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchHotelsTest {

    @Test
    @Description("This testcase verify that hotels result page open")
    public void testSearchHotels () {

        BaseClass baseClass = new BaseClass();
        Information information = new Information();

        String actualResult = baseClass
                .openHomePage()
                .goToHotelsSearchMenu()
                .setValueIntoHotelsDestination(information.hotelsDestination)
                .selectValueFromHotelsDropDownList()
                .setValueIntoHotelsCheckOutDate(information.actualDatePlusMonth)
                .setValueIntoHotelsCheckInDate(information.actualDate)
                .clickSearchHotel()
                .getHotelsConfirmationText();

        Assert.assertEquals(actualResult,information.hotelsExpectedResult);
        baseClass.afterTest();
    }

}
