 class ExecuteLoan {
        public static void main(String[] args) {
            Loan loan = null;
            loan =  new HomeLoan();                 // Runtime polymorphism
             double hloan = loan.calculateEMI(2000000);
             System.out.println("Home loan emi per year..."+ hloan);
        }
    }
class Loan {
public double calculateEMI(double principal) {
    double simpleInterest = (principal*8.5*5) / 100;
    double emi = (simpleInterest+principal)/5;
    return emi;
    }
}
           
    class HomeLoan extends Loan {
        public double calculateEMI(double principal) {
            int additionaltax = 200;
            double emi = super.calculateEMI(principal);      //calling super class method
            return emi + additionaltax;
        }
    }
           
   