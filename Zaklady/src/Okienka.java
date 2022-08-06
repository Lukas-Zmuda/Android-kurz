import javax.swing.JOptionPane;

public class Okienka {

	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog(null, "Toto je dolezita sprava");
		
		//JOptionPane.showMessageDialog(null, "Nastala nejaka chyba v programe", "Dolezite upozornenie", JOptionPane.PLAIN_MESSAGE);

		//String meno = JOptionPane.showInputDialog("Ako sa volas?");
		//System.out.println("Ahoj " + meno);
		
		//int rokNarodenia = Integer.parseInt(JOptionPane.showInputDialog("V ktorom roku si sa narodil?"));
		//System.out.println("Mas " + (2022 - rokNarodenia) + " rokov");
		
		//int volba = JOptionPane.showConfirmDialog(null, "Chces ukoncit aplikaciu?", "Koniec", JOptionPane.YES_NO_CANCEL_OPTION);
		
		
		Object[] moznosti = {"Ano, prosim", "Nie, dakujem", "Neviem"};
		
//		int volba = JOptionPane.showOptionDialog(null, "Chces sa naucit programovat?", "Klucova otazka", JOptionPane.YES_NO_CANCEL_OPTION, 
//				JOptionPane.QUESTION_MESSAGE, null, moznosti, moznosti[1]);
//		
		
		Object[] jedla = {"sunka", "vajicka", "parky", "zelenina"};
		String volba = (String)JOptionPane.showInputDialog(null, "Co si das na ranajky?", "Otazka", 
				JOptionPane.QUESTION_MESSAGE, null, jedla, jedla[2]);
		System.out.println(volba);
		
		
		
		//System.out.println("Program pokracuje dalej ...");
	}

}
