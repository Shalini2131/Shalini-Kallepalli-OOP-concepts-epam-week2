package com.epam.maven;

/**
 * Hello world!
 *
 */
public class Candy extends Sweets implements NewYearGifts
{
	public Candy(String name,int quantity,int weight)
	{
		super(name,quantity,weight);
	}
	public String getName()
	{
		return name;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public int getWeight()
	{
		return weight;
	}
}