import javax.swing.JOptionPane;

public class IntroToMethods{

	static void weRock() {
			JOptionPane.showMessageDialog(null, "The League Rocks!");
	}
	
	static void rocker(String name) {
		JOptionPane.showMessageDialog(null, name+" rocks");
	}
	
	static void truth(String singer) {
		if(singer.equalsIgnoreCase("Stefán Karl Stefánsson")){
			JOptionPane.showMessageDialog(null, singer+" is awesome");
		}
		else if(singer.equalsIgnoreCase("Stefan Karl Stefansson")){
			JOptionPane.showMessageDialog(null, singer+" is awesome");
		}
		else {
			JOptionPane.showMessageDialog(null, singer+" is annoying");
		}
	}
	
	static void echo(String word) {
		JOptionPane.showMessageDialog(null, word+" "+word);
	}
	
	static void repeat(String phrase, int repition) {
		String sentence = "";
		for(int i=0; i<repition; i++) {
			sentence = sentence+phrase+" ";
		}
		JOptionPane.showMessageDialog(null, sentence);
	}
	
	static String getTheBestCoder() {
		return "Evan";
	}
	
	static int add (int number1, int number2) {
		return number1+number2;
	}
	
	public static void main(String[] args) {
		weRock();
		rocker("Bob");
		truth("Stefan Karl Stefansson");
		echo("hello");
		repeat("mayday", 4);
		String theBest = getTheBestCoder();
		System.out.println(theBest);
		int sum = add(2,15);
		System.out.println(sum); //prints 4
	}
	
}
