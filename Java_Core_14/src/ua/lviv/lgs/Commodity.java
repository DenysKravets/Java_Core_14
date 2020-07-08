package ua.lviv.lgs;

import java.util.*;

public class Commodity 
{
	private ArrayList<Goods> goods = new ArrayList<Goods>();
	Scanner scan = new Scanner(System.in);
	
	Commodity()
	{
		
	}
	
	public ArrayList<Goods> getGoods()
	{
		return goods;
	}
	
	public void addProduct()
	{
		System.out.println("Adding a product");
		
		String name = scan.next();
		int length = scan.nextInt();
		int width = scan.nextInt();
		int weigth = scan.nextInt();
		
		goods.add(new Goods(name, length, width, weigth));
	}
	
	public void removeProduct()
	{
		System.out.println("Adding a product");
		
		String name = scan.next();
		int length = scan.nextInt();
		int width = scan.nextInt();
		int weigth = scan.nextInt();
		
		Iterator<Goods> iterator = goods.iterator();
		
		while(iterator.hasNext())
		{
			Goods product = iterator.next();
			
			if(product.equals(new Goods(name, length, width, weigth)))
			{
				iterator.remove();
			}
		}
	}
	
	public void replaceProduct()
	{
		System.out.println("Replacing a product");
		
		String name = scan.next();
		int length = scan.nextInt();
		int width = scan.nextInt();
		int weigth = scan.nextInt();
		
		Iterator<Goods> iterator = goods.iterator();
		int index = 0;
		int counter = 0;
		
		while(iterator.hasNext())
		{
			Goods product = iterator.next();
			
			if(product.equals(new Goods(name, length, width, weigth)))
			{
				index = counter;
				iterator.remove();
			}
			counter++;
		}
		
		System.out.println("With a product");
		
		name = scan.next();
		length = scan.nextInt();
		width = scan.nextInt();
		weigth = scan.nextInt();
		
		goods.add(index, new Goods(name, length, width, weigth));
	}
	
	public void sortByName()
	{
		Collections.sort(goods, new GoodsNameComparator());
	}
	
	public void sortByLength()
	{
		Collections.sort(goods, new GoodsLengthComparator());
	}
	
	public void sortByWeigth()
	{
		Collections.sort(goods, new GoodsWeightComparator());
	}
	
	public void sortBywidth()
	{
		Collections.sort(goods, new GoodsWidthComparator());
	}
	
	public void showElement(int index)
	{
		System.out.println(goods.get(index));
	}

	
}
