import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength(){
        Vector2D v1 = new Vector2D();

        //assertion
        //1e-9 =0.00000.....0001
        Assert.assertEquals(0, v1.length(), 1e-9);
    }
}
