public class Ass_p_2_2_main {
    public static void main(String[] args) {

        Ass_p_2_2 ace = new Ass_p_2_2();  // create object of class file  

// for printing call method 

        System.out.println("Annual Interest -> "+ace.getAnnual() + "%");
        System.out.println("Balance -> "+ace.getBalance());
        System.out.println("Id -> "+ace.getId());
        System.out.println("Date -> "+ace.getDate());
        System.out.println("Monthly Interest Rate -> "+ace.getMonthlyrate());
        System.out.println("Get Monthly Interest -> "+ace.getMonthlyinterest());
        System.out.println("Balance After Deposit  -> "+ace.deposit(1000));
        System.out.println("Balance After Withdraw -> "+ace.withdraw(1250));
    }
}

