class Bank {
  private String bankName, area;
  private String phoneNumber;
  Bank() {    // Default constructor
    bankName = "IBank";
    area = "Gandhi Nagar";
    phoneNumber = "9876543210";
  }
  Bank(String bname, String barea, String phoneNo) {  // Parameterized constructor
    bankName = bname;
    area = barea;
    phoneNumber = phoneNo;
  }
  void displayBankDetails(){
      System.out.println("bank Name: " + bankName);
      System.out.println("Area of bank: " + area);
      System.out.println("Phone number of bank: " + phoneNumber);
  }
  
  public static void main(String[] args){
      Bank bank1 = new Bank();  //call default constructor
      Bank bank2 = new Bank("IBank", "Jaydev Nagar", "8876543219"); //call Parameterized constructor
      
      bank1.displayBankDetails();
      System.out.println("***********************");
      bank2.displayBankDetails();
  }
}