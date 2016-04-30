package homework.com.candy;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * Class ChocolateCandyBarabas
 */
public class ChocolateCandyBarabas extends ChocolateCandyImp {
    private static final String NAME = "Barabas";
    private static final int WEIGHT = 50;
    private static final double SUGAR = 40;
    private static final short PERC = 50;
    private static final int PRICE = 40;
    
    /**
     * Sugar = 40 gram Weight = 50 gram Chocolate percent = 50% Name = Barabas
     */
    public ChocolateCandyBarabas() {
	super(PERC, SUGAR, WEIGHT, NAME);
    }

    /* (non-Javadoc)
     * @see homework.com.candy.CandyImp#price()
     */
    @Override
    int getPrice() {
	return (WEIGHT / PERC) * PRICE;
    }
}
