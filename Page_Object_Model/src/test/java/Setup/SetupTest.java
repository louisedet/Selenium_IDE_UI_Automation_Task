package Setup;

import org.testng.annotations.Test;

public class SetupTest {
    public class setUpTest extends setups{

        @Test
        public void testsetUp(){
            String pageURL = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/login";
            if(pageURL.equalsIgnoreCase("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login")){
                System.out.println("The webpage URL is" + pageURL);
            }else {
                System.out.println("Invalid URL. Actual webpage URL");
            }
        }
    }
}
