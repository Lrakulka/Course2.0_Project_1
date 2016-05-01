package homework.com.present;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import homework.com.candy.Candy;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * Class implementation of NewYearPresentImp interface
 */

public class NewYearPresentImp implements NewYearPresent {
    private List<Candy> candies;
    
    public NewYearPresentImp() {
	candies = new ArrayList<>();
    }
    
    /* (non-Javadoc)
     * @see homework.com.present.NewYearPresent#getCandies()
     */
    @Override
    public List<Candy> getCandies() {
	return new ArrayList<>(candies);
    }

    /* (non-Javadoc)
     * @see homework.com.present.NewYearPresent#getWeight()
     */
    @Override
    public int getWeight() {
	int weight = 0;
	Candy candy;
	for (Iterator<Candy> iterator = candies.iterator(); iterator.hasNext();) {
	    candy = iterator.next();
	    weight += candy.getWeight();
	 }
	return weight;
    }

    /* (non-Javadoc)
     * @see homework.com.present.NewYearPresent#sortBySugar()
     */
    @Override
    public void sortBySugar() {
	candies.sort((Candy o1, Candy o2) -> 
		Integer.compare(o1.getWeight(), o2.getWeight()));
    }

    /* (non-Javadoc)
     * @see homework.com.present.NewYearPresent#sortByName()
     */
    @Override
    public void sortByName() {
	candies.sort((Candy o1, Candy o2) -> {
		return o1.getName().compareTo(o2.getName());
	});
    }

    /* (non-Javadoc)
     * @see homework.com.present.NewYearPresent#getCandiesInArray(double, double)
     */
    @Override
    public List<Candy> getCandiesInArray(double from, double to) {
	List<Candy> candies = new ArrayList<>();
	Candy candy;
	for (Iterator<Candy> iterator = this.candies.iterator(); iterator.hasNext();) {
	    candy = iterator.next();
	    if ((candy.getWeight() >= from) && (candy.getWeight() <= to)) {
		candies.add(candy);
	    }
	 }
	return candies;
    }

    /* (non-Javadoc)
     * @see homework.com.present.NewYearPresent#putCandy(homework.com.candy.Candy)
     */
    @Override
    public void putCandy(Candy candy) {
	candies.add(candy);
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder("Present contains:" + System.lineSeparator());
	Candy candy;
	for (Iterator<Candy> iterator = candies.iterator(); iterator.hasNext();) {
	    candy = iterator.next();
	    builder.append(candy.toString() + System.lineSeparator());
	 }
        return builder.toString();
    }
    
    /**
     * Set candies to candy list.
     * Method added for Spring bean
     * @param candies list
     */
    public void setCandies(List<Candy> candies) {
	this.candies.addAll(candies);
    }
}
