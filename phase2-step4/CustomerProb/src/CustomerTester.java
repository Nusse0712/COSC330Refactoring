import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class CustomerTester extends TestResult {
	String title1 = "Pulp fiction";
	int code1 = 0;
	Movie movie1 = new Movie(title1,code1); // REGULAR MOVIE 
	Movie movie2 = new Movie("Finding Nemo",2); //CHILDRENS MOVIE
	Movie movie3 = new Movie("Fight Club",1); //NEW RELEASE
	int daysRented = 11; 
	String customerName = "Cole"; 
	Rental rental1 =  new Rental(movie1,daysRented); 

	 
	  public synchronized void addError(Test test, Throwable t) {
	      super.addError((junit.framework.Test) test, t);
	   }
	  public synchronized void addFailure(Test test, AssertionFailedError t) {
	      super.addFailure((junit.framework.Test) test, t);
	   }
	  @Test
	  public void testMovie() {
		  System.out.println("checking the functions of movie class");
		  assertEquals(title1,movie1.getTitle());
		 assertEquals(code1, movie1.getPriceCode());  
		 System.out.println();
	  }
	@Test
public void testRental(){
		  System.out.println("checking the functions of rental class");
		//creates and initializes a new Rental Object made from the first movie
		//tests the get functions of the rental class 
		assertEquals(movie1,rental1.getMovie());
		assertEquals(daysRented,rental1.getDaysRented()); 
		 System.out.println();
	}
	@Test
	public void testCustomer(){
		 System.out.println("Customer test with one movie rental");
		Customer customer1 = new Customer(customerName); 
		customer1.addRental(rental1);
		assertEquals(customerName,customer1.getName());
		System.out.println("Statement for regular movie"); 
		System.out.println(customer1.statement());  //15.5
		System.out.println();
	}
	
	@Test
	public void testMultipleStatements(){
		System.out.println("Customer test with multiple rentals");
		Customer customer2 = new Customer("Bob Jones");
		Rental rental2 =  new Rental(movie2,2); //1.5
		Rental rental3 =  new Rental(movie3,3); //9.0
		customer2.addRental(rental2);
		customer2.addRental(rental3);
		System.out.println(customer2.statement()); 
		System.out.println(); //3 frequent
	}
	
	
	
	



}
