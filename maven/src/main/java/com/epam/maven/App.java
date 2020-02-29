package com.epam.maven;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NewYearGifts[] obj=new NewYearGifts[10];
        obj[0]=new Chocolates("Dark Chocolate",5,1000);
        obj[1]=new Marshmallows("Chocolate coated",6,500);
        obj[2]=new Candy("Snickers",10,250);
        obj[3]=new Marshmallows("Marshmallow Fudge",4,250);
        obj[4]=new Chocolates("Milk Chocolate",20,500);
        obj[5]=new Chocolates("White Chocolate",50,300);
        obj[6]=new Candy("Caramel",15,200);
        obj[7]=new Chocolates("Swiss Bar",50,1000);
        obj[8]=new Chocolates("Alpino",70,500);
        obj[9]=new Candy("Gummies",55,100);
        System.out.println("----NewYearGifts contain----");
        for(NewYearGifts i:obj)
        	System.out.println(i.getName());
        System.out.println();
        List<Sweets> chocolates=new ArrayList<Sweets>();
        int total_weight=0;
        int candy_count=0;
		for(int i=0;i<10;i++)
        {
        	if(obj[i] instanceof Chocolates) {
        		Sweets s=(Sweets)obj[i];
        		chocolates.add(s);
        	}
        	if(obj[i] instanceof Candy)
        		candy_count+=obj[i].getQuantity();
        }
		Collections.sort(chocolates,new Comparator<Sweets>() {
			@Override
			public int compare(Sweets o1, Sweets o2) {
				return o1.quantity-o2.quantity;
			}	
		});
		System.out.println("After Sorting the Chococlates by quantity from the NewYearGifts:");
		for(Sweets i:chocolates)
		{
			System.out.println(i.name+" : "+i.quantity);
		}
        System.out.println();
		Collections.sort(chocolates,new Comparator<Sweets>() {
			@Override
			public int compare(Sweets o1, Sweets o2) {
				return o1.weight-o2.weight;
			}
		});
		System.out.println("After sorting the Chocolates by weight from the NewYearGifts:");
		for(Sweets i:chocolates)
		{
			System.out.println(i.name+" : "+i.weight);
		}
        System.out.println();
		for(NewYearGifts i:obj)
		{
			total_weight+=i.getWeight();
		}
		System.out.println("Total weight of children NewYearNewYearGifts is : "+total_weight);
		System.out.println("Total number of candies are : "+candy_count);
    }
}