class BankAccount {
    private String iban;
    private long balanceInCents;
    
    BankAccount(String I,long B){
        if(I.isBlank() || B < 0){
                throw new IllegalArgumentException("Erreur!");
        }else{
            this.iban = I;
            this.balanceInCents = B;
        }
    }
    public void deposit(long amount){
        if(amount <= 0){
                throw new IllegalArgumentException("Montant invalide !");
        }else{
            balanceInCents += amount;
        }
    }
    public void withdraw(long amount){
        if(amount <= 0 || amount > balanceInCents){
                throw new IllegalArgumentException("Montant invalide !");
        }else{
            balanceInCents -= amount;
        }
    }
    public long getBalanceInCents(){
        return this.balanceInCents;
    }
    public String getFormattedBalence(){
        return this.balanceInCents+" EUR\n";
    }
}
