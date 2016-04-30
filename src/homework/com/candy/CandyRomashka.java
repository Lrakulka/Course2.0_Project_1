package homework.com.candy;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * CandyRomashka class
 */
public class CandyRomashka extends CandyImp {
    private static final String NAME = "Romashka";
    private static final int WEIGHT = 20;
    private static final double SUGAR = 12;
    private static final int PRICE = 40;
    
    /**
     * Sugar = 13 gram Weight = 20 gram Name = Romashka
     */
    public CandyRomashka() {
	super(SUGAR, WEIGHT, NAME);
    }

    /* (non-Javadoc)
     * @see homework.com.candy.CandyImp#price()
     */
    @Override
    int getPrice() {
	return (int) ((SUGAR / WEIGHT) * PRICE);  // It's better to do constant
    }
}
