package Numbers;

import org.junit.*;
import static org.junit.Assert.*;

public class MyNumberTest {
    public MyNumber number1;
    public MyNumber number2;

    @Before
    public void setUp() throws Exception {
        System.out.println("Run @Before"); // for illustration
        number1 = new MyNumber(10);
        number2 = new MyNumber(5);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Run @After"); // for illustration
    }

    @Test
    public void testAdd() {
        System.out.println("Run @Test testAdd"); // for illustration
        number1.add(number2);
        assertEquals(15, number1.getNumber());
    }

    @Test
    public void testDiv() {
        System.out.println("Run @Test testDiv"); // for illustration
        number1.div(number2);
        assertEquals(2, number1.getNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivByZero() {
        System.out.println("Run @Test testDivByZero"); // for illustration
        number1.div(new MyNumber(0));
    }

}