package Lab3;

import org.junit.Test;
import static org.junit.Assert.*;

public class VendingMachineTest {
      // global class type machine variable

    //Creating a new VendingMachine() object for each test, to ensure that the tests are independent of each other.
    //assertEquals checks if the expected value is equal to the actual value.
    //assertFalse checks if the given condition is False.
    //assertTrue checks if the given condition is True.

    @Test
    public void testInitialBalance(){
        VendingMachine m1 = new VendingMachine();
        assertEquals(0, m1.getBalance());

    }


    @Test
    public void testInitialRevenue(){
        VendingMachine m2 = new VendingMachine();
        assertEquals(0, m2.getRevenue());
    }

    @Test
    public void testInsertCoins(){
        VendingMachine m3 = new VendingMachine();
        m3.insertCoin();
        m3.insertCoin();
        assertEquals(2, m3.getBalance());
        assertEquals(0, m3.getRevenue());
    }

    @Test
    public void testRefund(){
        VendingMachine m4 = new VendingMachine();
        m4.insertCoin();
        m4.insertCoin();
        int refundedValue = m4.refund();
        assertEquals(2, refundedValue);
        assertEquals(0, m4.getBalance());

    }

    @Test
    public void testVendFailure(){
        VendingMachine m5 = new VendingMachine();
        m5.insertCoin();
        boolean vendout = m5.vendCandyBar();
        assertFalse(vendout);

    }

    @Test
    public void testVendSuccess(){
        VendingMachine m6 = new VendingMachine();
        m6.insertCoin();
        m6.insertCoin();
        m6.insertCoin();
        boolean vendout = m6.vendCandyBar();
        assertTrue(vendout);

    }
}

