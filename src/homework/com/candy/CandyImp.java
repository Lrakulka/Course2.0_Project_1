package homework.com.candy;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * Candy implementation
 */
class CandyImp implements Candy {
    private double 	sugar;
    private int		weight;
    private String	name;
    
    /**
     * Constructor of CandyImp
     * @param sugar
     */
    CandyImp(double sugar, int weight, String name) {
	this.sugar = sugar;
	this.weight = weight;
	this.name = name;
    }
    
    /* (non-Javadoc)
     * @see homework.com.candy.Candy#getSugar()
     */
    @Override
    public double getSugar() {
	return sugar;
    }

    /* (non-Javadoc)
     * @see homework.com.candy.Candy#getSWeight()
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
        	weight + " Candy sugar " + sugar;
    }
}
