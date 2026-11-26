package collections;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class FavouriteMovieCollection {
	private Scanner scan=new Scanner(System.in);
	private Set<String>moviescollection=new HashSet<>();
	Iterator<String> i;
	public String addMovie() {
		System.out.println("Enter movie name");
		String movie=scan.nextLine().toUpperCase();
		if(moviescollection.contains(movie)) {
			return movie+" Already added to Movies Collection";
		}
		else {
			moviescollection.add(movie);
			return movie+" Added to Movies Collection";
		}
	}
	public void displayMoviesCollection() {
		if(!(moviescollection.isEmpty())){
			i=moviescollection.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
		else {
			System.out.println("No data added to Favourite Movie Collections yet");
		}
	}
	public String searchForMovie() {
		System.out.println("Enter movie name");
		String movie=scan.nextLine();
		i=moviescollection.iterator();
		while(i.hasNext()) {
			if(movie.equalsIgnoreCase(i.next())) {
				return movie+" found in Favourite Movie Collections";
			}
		}
		return movie+" Not found in Favourite Movie Collections";
	}
	public String removeMovie() {
		System.out.println("Enter movie name");
		String movie=scan.nextLine();
		i=moviescollection.iterator();
		while(i.hasNext()) {
			if(movie.equalsIgnoreCase(i.next())) {
				i.remove();
				return movie+" removed from Favourite Movie Collections";
			}
		}
		return movie+" Not found in Favourite Movie Collections";
	}
	public int count() {
		if(!(moviescollection.isEmpty())){
			return moviescollection.size();
		}
		return 0;
	}
	public static void main(String[] args) {
		FavouriteMovieCollection c=new FavouriteMovieCollection();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Favourites Movies Collection");
		System.out.println("----------------------------------------------------------------------");
		while(true) {
			System.out.println("1.Adding Movie\n2.Display Movies Names\n3.Search for Movie\n4.Remove Movie\n5.Count Movies\n6.Exit ");
			System.out.println("Enter your choice ");
			int choice=c.scan.nextInt();
			c.scan.nextLine();
			switch(choice) {
			case 1:
				System.out.println(c.addMovie());
				break;
			case 2:
				c.displayMoviesCollection();
				break;
			case 3:
				System.out.println(c.searchForMovie());	
				break;
			case 4:
				System.out.println(c.removeMovie());
				break;
			case 5:
				System.out.println(c.count());
				break;
			case 6:
				c.scan.close();
				System.exit(0);
				break;
			default:
				System.err.println("Check and re-enter the choice number correctly ");
			}
		}
		
		
	}
	
}
