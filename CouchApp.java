package labCollection;

import java.util.*;
import java.awt.Color;

/**
 * Demonstrates the functionality of the interfaces List and Set.
 * 
 * @author Brittany Pruneau
 *
 */
public class CouchApp
{
	public static void main(String[] args)
	{
		Color[] colors = {Color.BLACK, Color.BLUE, Color.DARK_GRAY, Color.GRAY, 
				Color.GREEN, Color.LIGHT_GRAY, Color.RED, Color.WHITE}; 
		
		List<Couch> couches = new ArrayList<>();

		for(int j =0; j<colors.length; j++)
		{
			final int i =j;
			EnumSet.allOf(Material.class)
			.forEach(material -> couches.add(new Couch(colors[i],material)));
		}
		couches.forEach(n-> System.out.println(n));
		getSize(couches);
		isFavorite(couches);
		System.out.println();
		
		System.out.println("Removing Vinyl couches: \n");
		couches.removeIf(e-> (e.getMaterial() == (Material.VINYL)));
		couches.forEach(n-> System.out.println(n));
		isFavorite(couches);
		getSize(couches);
		
		List<Couch> favoriteCouches = getFavorites(); 
		couches.addAll(favoriteCouches);
		System.out.println("Adding all favorites to the list couches: ");
		couches.forEach(n-> System.out.println(n));
		getSize(couches);
		isFavorite(couches);
		
		Set<Couch> uniqueCouches = new HashSet<Couch>();
		uniqueCouches.addAll(couches);
		System.out.println("Printing as set: ");
		
		uniqueCouches.forEach(n-> System.out.println(n));
		System.out.println(uniqueCouches.size());
		if(uniqueCouches.containsAll(favoriteCouches))
		{
			System.out.println("All favorites are in the set. ");
		}

	}

	/*
	 * Returns an list of favorite couches. 
	 */
	public static List<Couch> getFavorites()
	{
		Color[] favoriteColors = {Color.RED, Color.BLACK, Color.WHITE};
		List<Couch> favoriteCouches = new ArrayList<>();
		favoriteCouches.add(new Couch(Color.RED, Material.FABRIC)); 
		favoriteCouches.add(new Couch(Color.BLACK, Material.LEATHER)); 
		favoriteCouches.add(new Couch(Color.WHITE, Material.VINYL));
		return favoriteCouches;
	}

	/*
	 * Returns the number of couches in the list. 
	 */
	public static void getSize(List<Couch> couches)
	{
		System.out.println("Number of elements in list: " + couches.size());
	}

	/*
	 * Prints a statement letting the user know the list contains the users favorite couches. 
	 */
	public static void isFavorite(List<Couch> couches)
	{
		Color[] favoriteColors = {Color.RED, Color.BLACK, Color.WHITE};
		List<Couch> favoriteCouches = new ArrayList<>();
		favoriteCouches.add(new Couch(Color.RED, Material.FABRIC)); 
		favoriteCouches.add(new Couch(Color.BLACK, Material.LEATHER)); 
		favoriteCouches.add(new Couch(Color.WHITE, Material.VINYL)); 

		//System.out.println("Favorite couches: ");
		//favoriteCouches.forEach(n-> System.out.println(n));	
		for(int n = 0; n<couches.size(); n++)
		{
			for(int o = 0; o<favoriteCouches.size(); o++)
			if(couches.get(n).equals(favoriteCouches.get(o)))
			{
				n = couches.size()-1; 
				o = favoriteCouches.size()-1;
				System.out.println("All favorites are in the list.");
			}
		}
	}

}
