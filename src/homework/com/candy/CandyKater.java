package homework.com.candy;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * Class CandyKater
 */
public class CandyKater extends CandyImp {
    private static final String NAME = "Kater";
    private static final int WEIGHT = 10;
    private static final double SUGAR = 6;
    private int price;
    
    /**
     * Sugar = 6 gram Weight = 10 gram Name = Kater
     */
    public CandyKater(int price) {
	super(SUGAR, WEIGHT, NAME);
	this.price = price;
    }

    /* (non-Javadoc)
     * @see homework.com.candy.CandyImp#price()
     */
    @Override
    int getPrice() {
	return price;
    }
}
