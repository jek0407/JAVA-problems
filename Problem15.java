import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Item {
	private String name;
	private int cnt;
	
	public Item(String string, int i) {
		this.name = string;
		this.cnt = i;
	}
	
	public String getItemName() {
		return name;
	}
	public void setItemName(String string) {
		name = string;
	}
	public int getItemCount() {
		return cnt;
	}
	public void setItemCount(int i) {
		cnt = i;
	}
	
	public String toString() {
		return name + " " + cnt;
	}
}

class MyFileReader {
    public static boolean readDataFromFile(String filename, ArrayList<Item> list) {
        
    	File file;
    	FileReader fr;
    	BufferedReader br = null;
    	String line = null;
    	String fileLower;
    	String[] wordArray;
    	StringBuilder sb;
    	
    	try {
            file = new File(filename); 
            fr = new FileReader(file); 
            br = new BufferedReader(fr);
    	} catch(FileNotFoundException e) {
    		return false;
    	}
            sb = new StringBuilder();
      
            while (true) {
            	try {
            		line = br.readLine();
            		sb.append(line+" ");
            	} catch (IOException e) {
            		e.printStackTrace();
            	}
            	if(line == null) break;
            }
           
            fileLower = sb.toString().toLowerCase();
            wordArray = fileLower.split(" ");

            for (int i=0;i<wordArray.length-1;i++) {
                int check = 0;
                for(Item item:list) {
                    if(item.getItemName().equals(wordArray[i])) {
                        item.setItemCount(item.getItemCount()+1); 
                        check++; 
                    }
                }

                if(check == 0) {
                    Item newItem = new Item(wordArray[i],1);
                    list.add(newItem);
                }
            }
    	
    	try {
			br.close();
		} catch (IOException e) {
			System.out.println("File close error.");
			e.printStackTrace();
		}
	
        return true;
    }

}
public class Problem15 {

    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();

        boolean rv  = MyFileReader.readDataFromFile("input_prob15.txt",list);

        if(rv == false) {
            System.out.println("Input file not found.");
            return;
        }
        for (Item it:list) System.out.println(it);
    }
}