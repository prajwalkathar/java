
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Test_Mavan_pro {
    @Test
    public void testApp() {
    	Mavan_pro t=new Mavan_pro();
        String expected = "sir";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testApp1() {
    	Mavan_pro t=new Mavan_pro();
        String expected = "prajwal";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testApp3() {
    	Mavan_pro t=new Mavan_pro();
        String expected = "madam";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testApp4() {
    	Mavan_pro t=new Mavan_pro();
        String expected = "anadana";
        String actual =t.palindrome(expected);

        Assertions.assertEquals(expected, actual);
    }
}
