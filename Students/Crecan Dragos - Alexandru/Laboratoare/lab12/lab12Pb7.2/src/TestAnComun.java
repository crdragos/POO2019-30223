import org.junit.Assert;
import org.junit.Test;

public class TestAnComun {

    @Test
    public void esteAnBisect() throws Exception {
        Assert.assertFalse(AnBisect.esteAnBisect(203));
        Assert.assertFalse(!AnBisect.esteAnBisect(4));
        Assert.assertFalse(AnBisect.esteAnBisect(99));
        Assert.assertFalse(AnBisect.esteAnBisect(100));
        Assert.assertFalse(AnBisect.esteAnBisect(200));
        Assert.assertFalse(!AnBisect.esteAnBisect(400));
        Assert.assertFalse(AnBisect.esteAnBisect(500));
        Assert.assertFalse(AnBisect.esteAnBisect(1000));
        Assert.assertFalse(!AnBisect.esteAnBisect(1600));
        Assert.assertFalse(AnBisect.esteAnBisect(2018));
    }
}
