package ua.lviv.lgs;

import java.util.*;
import java.util.stream.Collectors;

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
		System.out.println("Removing a product");
		
		String name = scan.next();
		int length = scan.nextInt();
		int width = scan.nextInt();
		int weigth = scan.nextInt();
		
		goods = (ArrayList<Goods>) goods.stream().filter(b -> !b.equals(new Goods(name, length, width, weigth))).collect(Collectors.toList());
	}
	
	public void replaceProduct()
	{
		System.out.println("Replacing a product");
		
		String name = scan.next();
		int length = scan.nextInt();
		int width = scan.nextInt();
		int weigth = scan.nextInt();
		
		Goods productToReplace = new Goods(name, length, width, weigth);
		
		System.out.println("With a product");
		
		name = scan.next();
		length = scan.nextInt();
		width = scan.nextInt();
		weigth = scan.nextInt();
		
		Goods replacement = new Goods(name, length, width, weigth);
		
		goods = (ArrayList<Goods>) goods.stream().map(b -> {
			if(b.equals(productToReplace)) {
				return replacement;
			} else {
				return b;
			}
		}).collect(Collectors.toList());
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
