import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//CRUD
		//Create, Read, Update, Delete
		int a = 10;
		//zoznam statov EU
		ArrayList<String> statyEu = new ArrayList<>();
		
		statyEu.add("Slovensko");
		statyEu.add("Polsko");
		
		System.out.println("Prvy stat v zozname je " + statyEu.get(0));
		
		statyEu.add(1, "Cesko");
		System.out.println("Pocet statov v zozname: " + statyEu.size());
		
		statyEu.remove(0);
		statyEu.remove("Polsko");
		System.out.println("Prvy stat v zozname je " + statyEu.get(0));
		
		statyEu.set(0, "Ceska republika");
		
		statyEu.add("Madarsko");
		statyEu.add("Nemecko");
		
		System.out.println("Madarsko sa " + (statyEu.contains("Madarsko")? "nachadza v zozname" : "nenachadza v zozname"));
		
		
		System.out.println("Zoznam statov EU:");
		for(String stat: statyEu) {
			System.out.println(stat);
		}
		

	}

}
