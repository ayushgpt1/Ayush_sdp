class Account{
    public static void main(String[] args){
        double balance = 600;
        System.out.println("Amount to withdraw");
        double amount = 500;
        if(amount<=0){
            System.out.println("Withdrawal has failed as the amount is negative");
        }
        else if(amount>balance){
            System.out.println("Withdrawal has failed as the balance is low");
        }
        else{
            balance-=amount;
            System.out.println("Withdrawal has succeeded");
        }
    }
}