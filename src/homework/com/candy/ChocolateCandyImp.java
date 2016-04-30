package homework.com.candy;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * ChocolateCandy class
 */
abstract class ChocolateCandyImp extends CandyImp implements Chocolate {
    private short	perc;	// Chocolate percent
    
    ChocolateCandyImp(short perc, double sugar, int weight, String name) {
	super(sugar, weight, name);
	this.perc = perc;
    }
    
    /* (non-Javadoc)
     * @see homework.com.candy.Chocolate#getChocolate()
     */
    @Override
    public short getChocolate() {
	return perc;
    } 

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Candy name " + getName() + " Candy weight " + 
        	getWeight() + " Candy sugar " + getSugar() + 
        	" Candu percent of chocolote " + getChocolate() + 
        	"% Candy price " + getPrice();
    }
}
