package homework.com.candy;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * Chocolate interface
 */
public interface Chocolate {
    /**
     * Return value from 0 to 100 - percent of chocolate
     * @return percent of chocolate
     */
    short getChocolate();
    
    /**
     * Return weight of candy
     * @return weight of candy
     */
    int getWeight();
    
    /**
     * Return name of candy
     * @return name of candy
     */    
    String getName();
}
