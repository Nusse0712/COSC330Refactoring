public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price moviePrice;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return moviePrice.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
       switch(priceCode){
       case CHILDREN: 
    	   moviePrice = new ChildrensPrice();
    	   break;
       case REGULAR: 
    	   moviePrice = new RegularPrice();
    	   break;
       case NEW_RELEASE:
    	   moviePrice = new NewReleasePrice();
    	   break;
    	default:
    	   moviePrice = new RegularPrice();
       }
    }

    public double getCharge(int daysRented) {
    	double rentalAmount = 0;
      	 switch (getPriceCode()) {
           case Movie.REGULAR:
          	 rentalAmount += 2;
               if (daysRented > 2)
              	 rentalAmount += (daysRented - 2) * 1.5;
               break;
           case Movie.NEW_RELEASE:
          	 rentalAmount += daysRented * 3;
               break;
           case Movie.CHILDREN:
          	 rentalAmount += 1.5;
               if (daysRented > 3)
              	 rentalAmount += (daysRented - 3) * 1.5;
               break;
       }
      	return rentalAmount; 
    }
    public int getFrequentRenterPoints(int daysRented) {
    	 if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
             return 2;
    	 }else {
    		 return 1;
    	 }
    }

}