package homework.com.init;

import homework.com.candy.CandyKater;
import homework.com.candy.CandyRomashka;
import homework.com.candy.ChocolateCandyBarabas;
import homework.com.present.NewYearPresent;
import homework.com.present.NewYearPresentImp;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * Init class
 */
public class Init {
    private static final Init SINGLTON = new Init();
    private Init() {}
    /**
     * Return singleton of Init class
     * @return singleton
     */
    public static Init getInit() {
	return SINGLTON;
    }
    
    /**
     * Create and return present with candies
     * @return present with candies
     */
    public NewYearPresent getPresent() {
	NewYearPresentImp present =  new NewYearPresentImp();
	present.putCandy(new CandyKater());
	present.putCandy(new CandyKater());
	present.putCandy(new CandyRomashka());
	present.putCandy(new ChocolateCandyBarabas());
	present.putCandy(new ChocolateCandyBarabas());
	present.putCandy(new ChocolateCandyBarabas());
	return present;
    }
}
