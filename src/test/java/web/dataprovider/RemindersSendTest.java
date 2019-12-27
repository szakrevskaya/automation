package web.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RemindersSendTest {

    @Test(dataProvider = "provideDaysInterval")
    public void test_Days_Are_Valid(int numberOfDaysInterval){
        System.out.println("Reminder is sent after " + numberOfDaysInterval);
    }

    @DataProvider(name = "provideDaysInterval")
    public Object[][] provideData() {
        return new Object[][]{{1}, {5}, {30}, {180}, {365}};
    }
}

