package homework.com.present;

import java.util.List;
import homework.com.candy.Candy;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * NewYearPresent interface
 */
public interface NewYearPresent {
    /**
     * Return list of candies in present
     * @return list of candies
     */
    List<Candy> getCandies();
    
    /**
     * Return weight of present
     * @return weight
     */
    int getWeight();
    
    /**
     * Sort candy list by sugar
     */
    void sortBySugar();
    
    /**
     * Sort candy list by name
     */
    void sortByName();
    
    /**
     * Return list of candies which satisfying parameters 
     * @param from sugar level
     * @param to sugar level
     * @return list of candies
     */
    List<Candy> getCandiesInArray(double from, double to);
    
    
    /**
     * Put candy to present
     * @param candy
     */
    void putCandy(Candy candy);
}
