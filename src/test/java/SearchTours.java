import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTours {

    @Test
    @Description("This testcase verify that tours result page open")
    public void testToursSearch(){

        BaseClass baseClass = new BaseClass();
        Information information = new Information();

        String actualResult = baseClass
                .openHomePage()
                .goToToursSearchMenu()
                .setValueIntoToursDestination(information.toursDestination)
                .selectFromToursDropDownList()
                .setValueIntoToursToDate(information.actualDatePlusMonth)
                .setValueIntoToursFromDate(information.actualDate)
                .clickToursSearchButton()
                .getToursConfirmationText();
        Assert.assertEquals(actualResult,information.toursExpectedResult);
        baseClass.afterTest();
    }
}
