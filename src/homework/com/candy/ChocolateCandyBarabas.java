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
    private int price;
    
    /**
     * Sugar = 40 gram Weight = 50 gram Chocolate percent = 50% Name = Barabas
     */
    public ChocolateCandyBarabas(int price) {
	super(PERC, SUGAR, WEIGHT, NAME);
	this.price = price;
    }

    /* (non-Javadoc)
     * @see homework.com.candy.CandyImp#price()
     */
    @Override
    int getPrice() {
	return (WEIGHT / PERC) * price;
    }
}
