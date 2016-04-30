package homework.com.terminal;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import homework.com.candy.*;
import homework.com.init.Init;
import homework.com.present.NewYearPresent;
import homework.com.present.NewYearPresentImp;

/**
 * @author asd
 * @date Apr 29, 2016
 * 
 * Terminal of project
 */

public class Terminal {

    /**
     * Main method 
     * @param args
     */
    public static void main(String[] args) {
	ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
	NewYearPresentImp present = (NewYearPresentImp) context.getBean("present");
	NewYearPresent newYearPresent = present;
	//NewYearPresent newYearPresent = Init.getInit().getPresent();
	int status = 0;
	double from = 0, to = 0;
	Scanner in = new Scanner(System.in);
	System.out.println("To call help print 0");
	while (status != 20) {
	    status = in.nextInt();
	    switch (status) {
	    case 0:
		System.out.println("1 - create new present, 2 - add to present candy Cater,\n"
			+ " 3 - add to present candy Romashka, 4 - add to present candy Barabas,\n"
			+ " 5 - show present candies,  6 - sort present candies by name,\n"
			+ " 7 - sort present candies by sugar, 8 - get Present weight,\n"
			+ " 9 - candies in array of sugar 20 - exit\n");	
		break;

	    case 1:
		newYearPresent = new NewYearPresentImp();
		System.out.println("New present created");
		break;
		
	    case 2:
		newYearPresent.putCandy(new CandyKater());
		System.out.println("Candy Kater added");
		break;
		
	    case 3:
		newYearPresent.putCandy(new CandyRomashka());
		System.out.println("Candy Romashka added");
		break;
	    
	    case 4:
		newYearPresent.putCandy(new ChocolateCandyBarabas());
		System.out.println("Candy Barabas added");
		break;
		
	    case 5:
		System.out.println(newYearPresent.toString());
		break;
		
	    case 6:
		newYearPresent.sortByName();
		System.out.println("Present candies sorted by Name");
		break;
		
	    case 7:
		newYearPresent.sortBySugar();
		System.out.println("Present candies sorted by Sugar");
		break;
		
	    case 8:
		System.out.println(newYearPresent.getWeight());
		break;
		
	    case 9:		
		System.out.println(" Print 'from' and 'to'");
		from = in.nextDouble();
		to = in.nextDouble();
		System.out.println(newYearPresent.getCandiesInArray(from, to).toString());
		break;
		
	    case 20:
		System.out.println("exit");
		break;
		
	    default:
		System.out.println("No such command");
		break;
	    }
	    try {
		Thread.sleep(500);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
	in.close();
    }

}
