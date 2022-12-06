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
    	return moviePrice.getCharge(daysRented);
    }
    public int getFrequentRenterPoints(int daysRented) {
    	return moviePrice.getFrequentRenterPoints(daysRented);
    }

}