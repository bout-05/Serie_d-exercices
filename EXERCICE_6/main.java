public class main {
    public static void main(String [] args){

        BankAccount AC1 = new BankAccount("bout2005", 100000);

        System.out.println("le solde est :"+AC1.getBalanceInCents());

        AC1.deposit(1000);
        System.out.println("le solde apres la deposition :"+AC1.getBalanceInCents());

        AC1.withdraw(20000);
        System.out.println("le solde apres la withdraw :"+AC1.getBalanceInCents());

        System.out.println("le solde est :" +AC1.getFormattedBalence());


    }
}
