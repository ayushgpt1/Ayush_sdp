
class ExecuteLoan{
    public static void main (String[] args) {
        HomeLoan loan = new HomeLoan();     //Runtime polymorphism
        double hloan = loan.calculateEMI(2000000);
        System.out.println("Home loan emi per year..." + hloan);
    }
}
class Loan{
    protected int tenure;
    protected float interestRate;
    
    Loan(int tenure, float interestRate){
        this.tenure = tenure;
        this.interestRate = interestRate;
    }
}

class HomeLoan extends Loan{
    HomeLoan(){
        super(5,8.5f);  //invoking super class constructor
    }
    public double calculateEMI(double principal){
        double simpleInterest = (principal * interestRate * tenure) / 100;
        double emi = (simpleInterest + principal) / tenure;
        int additionalTax = 200;
        return emi + additionalTax;
    }
}
