package maven_oops.oops_maven;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit1 credit1=new Credit1() {
			public void PayPalPayment() {
				System.out.println("Credit1 PayPal method using anonymous inner class");
			}
		};
		credit1.CreditCardPayment();
		credit1.PayPalPayment();
		
		Credit2 credit2=new Credit2() {
			public void CreditCardPayment() {
				System.out.println("Credit Card Payment of Credit2 using anonymous inner class");
			}
		};
		credit2.PayPalPayment();
		credit2.CreditCardPayment();

	}

}
