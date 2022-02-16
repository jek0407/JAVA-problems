import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Fruit {
	private String name;
	private double price;
	
	public Fruit(String name, double d) {
		this.name = name;
		this.price = d;
	}
	public Fruit(Fruit fruit) {
		this.name = fruit.getName();
		this.price = fruit.getPrice();
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {  //override toString
		return this.name + " " + String.valueOf(price);
	}
}

class FruitBox<T extends Fruit> {
	private List<T> fruits;
	T maxFruit, minFruit;
	
	public FruitBox() {
		fruits = new ArrayList<T>();
	}

	public int getNumItems() {
		return fruits.size();
	}

	public String getMaxItem() {
		return maxFruit.getName();
	}

	public double getMaxPrice() {
		return maxFruit.getPrice();
	}

	public String getMinItem() {
		return minFruit.getName();
	}

	public double getMinPrice() {
		return minFruit.getPrice();
	}

	public Object getAvgPrice() {
		double avg = 0.0, sum = 0.0;
		
		for(T item: fruits) {
			sum += item.getPrice();
		}
		
		avg = sum / getNumItems();
		
		return avg;
	}

	public void add(T newFruit) {
		fruits.add(newFruit);
		System.out.println(newFruit);
		if(fruits.size() == 1) {
			maxFruit = newFruit;
			minFruit = newFruit;
		}
		else {
			if(newFruit.getPrice() > maxFruit.getPrice())
				maxFruit = newFruit;
			if(newFruit.getPrice() < minFruit.getPrice())
				minFruit = newFruit;
		}
	}
}


class ItemReader{
	public static boolean fileToBox(String string, FruitBox<Fruit> box) {
		File file = null;
		Scanner input = null;
		try {
			file = new File(string);
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found.");
			//e.printStackTrace();
			return false;
		}
		
		while(input.hasNext()) {
			try {
				String[] words = input.nextLine().split(" ");
				Fruit fruit = new Fruit(words[0], Double.parseDouble(words[1]));
				box.add(fruit);
			} catch (Exception e) {
				System.out.println("Exception Occured!");
				e.printStackTrace();
			}
		}
		
		try {
			input.close();
		} catch(Exception e) {
			System.out.println("Exception Occured!");
			e.printStackTrace();
		}
		return true;
	}
}


public class Problem14 {
	public static void main(String[] args) {
		FruitBox<Fruit> box = new FruitBox<>();
		boolean rv = ItemReader.fileToBox("input_prob14.txt", box);
		if(rv == false) return;
		box.add(new Fruit("orange", 9.99)); 
		System.out.println("----------------");
		System.out.println("    Summary"); 
		System.out.println("----------------");
		System.out.println("number of items: " + box.getNumItems()); 
		System.out.println("most expensive item: " + box.getMaxItem() + " (" + box.getMaxPrice() + ")");
		System.out.println("cheapest item: " + box.getMinItem() + " (" + box.getMinPrice() + ")");
		System.out.printf("average price of items: %.2f", box.getAvgPrice());
	}
}