class FinalDemo{
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.tenure);
		System.out.println(d.calculateEMI());
	}
}
final class Demo {
	int tenure = 0;
	double principal;
	float interestRate;
	String accountNumber;
    double calculateEMI(){
		return 2000;
	}
}

  class Dummy extends Demo{
  
  // Error as  class is final
  double calculateEMI(){
		return 8000;
	}
  
  }	

