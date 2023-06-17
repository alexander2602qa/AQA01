import org.testng.Assert;
import org.testng.annotations.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldReturnCorrectValueIfRemainIsNotZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2300;

        int actual = service.remain(amount);
        int expected = 700;

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnCorrectValueIfRemainIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}
