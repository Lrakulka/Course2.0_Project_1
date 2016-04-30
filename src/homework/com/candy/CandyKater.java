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
    private static final int PRICE = 60;
    
    /**
     * Sugar = 6 gram Weight = 10 gram Name = Kater
     */
    public CandyKater() {
	super(SUGAR, WEIGHT, NAME);
    }

    /* (non-Javadoc)
     * @see homework.com.candy.CandyImp#price()
     */
    @Override
    int getPrice() {
	return PRICE;
    }
}
