package lesson16.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalc {

    Calc c;

    @BeforeEach
    public void setUp() {
        c = new Calc();
    }

    @BeforeAll
    @AfterEach
    @AfterAll



    @Test
    public void testAdd() {
        int actualResult = c.add(2, 5);
       assertTrue(actualResult == 7);
       assertEquals(7, actualResult);
       assertNull(new Object());
       assertNotNull(new Object());
       assertFalse(actualResult == 7);
    }

    @Test
    public void testDivSuccessful() {
        assertEquals(2, c.div(10, 5));
    }


    @Test
    public void testDivException1() {
        try{
            c.div(2, 0);
        } catch(Exception e) {
        }
    }

    @Test(/*expected = Exception.class*/)
    public void testDivException2() {
        new Calc().div(2, 0);
    }

}
