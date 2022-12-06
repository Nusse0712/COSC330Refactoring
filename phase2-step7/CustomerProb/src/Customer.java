import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
       
        

        String result = "Rental record for " + getName() + "\n";
        for (Rental rental : rentals) {
       
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n"; 
        }

        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";

        return result;
    }
    public double getRentalAmount(Rental rental){
    	return  rental.getCharge();
    }
    
    public double getTotalCharge(){
    	double result = 0;
    	 for (Rental rental : rentals) {
    		 result+=rental.getCharge(); 
    	 }
    	 return result;
    }
    public int getTotalFrequentRenterPoints(){
    	int result =0; 
    	for (Rental rental : rentals) {
   		 result+=rental.getFrequentRenterPoints();
   	 }
    	return result;
    }
}
    
	
	
