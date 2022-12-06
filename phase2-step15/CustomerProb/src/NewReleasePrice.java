
public class NewReleasePrice extends Price {
	public double getCharge(int daysRented){
		 return daysRented * 3;
	}
	public int getPriceCode(){
		return Movie.NEW_RELEASE;
	}
	 public int getFrequentRenterPoints(int daysRented){
		 if(daysRented > 1){
			 return 2;
		 }else {
			 return 1;
		 }
	 }

}
