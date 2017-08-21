package wang.relish.ledger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void f(){
        long t = 100000000000L;

        long s = 3051504214L;
        System.out.println(t/1000f/60f/60f/24f);
        System.out.println(System.currentTimeMillis());
    }
}