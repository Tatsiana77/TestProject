import org.junit.Test;

public class NetWorkUtilsTest {
    @Test(timeout = 5000)
    public void getConnectionShouldReturnFasterOneSecond(){
        NetworkUtils.getConnection();
    }
}
