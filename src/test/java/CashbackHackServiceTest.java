import org.junit.*;
import org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturnCorrectValueIfRemainIsNotZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2300;

        int actual = service.remain(amount);
        int expected = 700;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnCorrectValueIfRemainIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 5000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

}
