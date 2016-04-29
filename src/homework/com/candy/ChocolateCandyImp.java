package homework.com.candy;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * ChocolateCandy class
 */
class ChocolateCandyImp implements Candy, Chocolate {
    private double 	sugar;
    private int		weight;
    private String	name;
    private short	perc;	// Chocolate percent
    
    ChocolateCandyImp(short perc, double sugar, int weight, String name) {
	this.sugar = sugar;
	this.weight = weight;
	this.name = name;
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
     * @see homework.com.candy.Candy#getSugar()
     */
    @Override
    public double getSugar() {
	return sugar;
    }

    /* (non-Javadoc)
     * @see homework.com.candy.Candy#getWeight()
     */
    @Override
    public int getWeight() {
	return weight;
    }

    /* (non-Javadoc)
     * @see homework.com.candy.Candy#getName()
     */
    @Override
    public String getName() {
	return name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Candy name " + name + " Candy weight " + 
        	weight + " Candy sugar " + sugar + 
        	" Candu percent of chocolote " + perc + "%";
    }
}
