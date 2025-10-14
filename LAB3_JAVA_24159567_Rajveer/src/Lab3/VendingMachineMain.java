package Lab3;

public class VendingMachineMain {

    public static void main(String[] args){

        System.out.println("--------Initial State of Vending Machine--------");
        VendingMachine m1 = new VendingMachine(); // Creating a new Object m1 of class type Vending Machine
        //A constructor in Java is a special kind of method whose main job is to initialize a new object when it is created...here VendingMachine() is a constructor.
        System.out.println("Initial Balance = " + m1.getBalance()); // 0 expected

        VendingMachine m2 = new VendingMachine(); // Creating a new Object m of class type Vending Machine
        System.out.println("Initial Revenue = " + m2.getRevenue());// 0 expected
        System.out.println();


        VendingMachine m3 = new VendingMachine(); // Creating a new Object m3 of class type Vending Machine
        m3.insertCoin();
        System.out.println("--------After Inserting a coin--------");
        System.out.println("Balance = " + m3.getBalance()); // 1 expected
        System.out.println("Revenue = " + m3.getRevenue()); // 0 expected
        // 0 was expected because the revenue will only be added after a fully successful transaction of vending and inserting 3 coins(Candy Price).
        System.out.println();

        VendingMachine m4 = new VendingMachine(); // Creating a new Object m4 of class type Vending Machine
        m4.insertCoin();
        m4.insertCoin();
        int refund = m4.refund();
        System.out.println("------Refund Process After Inserting 2 coins------");
        System.out.println("Refund Amount : " + refund); // 2 expected
        System.out.println("Balance After refund : " + m4.getBalance()); // 0 expected
        System.out.println("Revenue After Refund : " + m4.getRevenue()); //0 expected
        System.out.println();

        System.out.println("------Vending Cases------");
        VendingMachine m5 = new VendingMachine();// Creating a new Object m5 of class type Vending Machine
        m5.insertCoin();
        m5.insertCoin();
        m5.insertCoin();
        boolean vendout1 = m5.vendCandyBar();
        System.out.println("1) Can we Vend after inserting the Candy Price : " + vendout1); //true expected
        System.out.println("Balance After Vending : " + m5.getBalance()); // 0 expected
        System.out.println("Revenue After Vending : " + m5.getRevenue()); // 3 expected
        System.out.println();

        VendingMachine m6 = new VendingMachine();// Creating a new Object m6 of class type Vending Machine
        boolean vendout2 = m6.vendCandyBar();
        System.out.println("2) Can we vend by inserting 0 or less coins than Candy Price : " + vendout2); // false expected

        
    }


}
