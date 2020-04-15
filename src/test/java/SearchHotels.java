import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchHotels {

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
                .setValueIntoHotelsCheckOutDate(information.actualDate)
                .setValueIntoHotelsCheckInDate(information.actualDatePlusMonth)
                .clickSearchHotel()
                .getHotelsConfirmationText();

        Assert.assertEquals(actualResult,information.hotelsExpectedResult);
        baseClass.afterTest();
    }

}
