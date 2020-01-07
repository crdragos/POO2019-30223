import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnBisect {

    @Test
    public void esteAnBisect() throws Exception {
        Assert.assertTrue(!AnBisect.esteAnBisect(203));
        Assert.assertTrue(AnBisect.esteAnBisect(4));
        Assert.assertTrue(!AnBisect.esteAnBisect(99));
        Assert.assertTrue(!AnBisect.esteAnBisect(100));
        Assert.assertTrue(!AnBisect.esteAnBisect(200));
        Assert.assertTrue(AnBisect.esteAnBisect(400));
        Assert.assertTrue(!AnBisect.esteAnBisect(500));
        Assert.assertTrue(!AnBisect.esteAnBisect(1000));
        Assert.assertTrue(AnBisect.esteAnBisect(1600));
        Assert.assertTrue(!AnBisect.esteAnBisect(2018));
    }
}