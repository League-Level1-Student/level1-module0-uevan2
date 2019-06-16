import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Methods3 {

	static void eat (String food) {
		JOptionPane.showMessageDialog(null, "you ate "+food+"!");
	}
	
	static double getDinnerTime(){
		return 10;
	}
	
	static String getFavoriteFood(String personsName){
		if(personsName.equalsIgnoreCase("John")) {
			return "apples";
		}
		else if(personsName.equalsIgnoreCase("James")) { 
			return "oranges";
		}
		else {
			return "pears";
		}
	}
	
	static void chomp(String food2){
		JOptionPane.showMessageDialog(null, "you chomped "+food2+"!");
	}
	
	static boolean isTasty(String food3){
		if(food3.equalsIgnoreCase("cake")) {
			return true;
		}
		else if(food3.equalsIgnoreCase("fish")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static JFrame getWindow() {
		return new JFrame();
	}
	
	private static int getNumberOfPizzaSlicesLeft() {
		return 0;
	}
	
	static String getFavoriteVegetable(String person) {
		if(person.equalsIgnoreCase("mom")) {
			return "broccoli";
		}
		else {
			return "carrots";
		}
	}
	
	static void peel(String food4) {
		JOptionPane.showMessageDialog(null, "you peeled "+food4+"!");
	}
	
	static boolean isHealthy(String food5) {
		if(food5.equalsIgnoreCase("Avocado")){
			return true;
		}
		else {
			return false;
		}
	}
	
	static void simmer(String food6) {
		JOptionPane.showMessageDialog(null, "The "+food6+" is simmering!");
	}
	
	public static void main(String[] args) {
		eat("cake");
		JOptionPane.showMessageDialog(null, "dinner is in "+getDinnerTime()+" minutes");
		JOptionPane.showMessageDialog(null, "Johns favorite food is "+getFavoriteFood("John")+"!" );
		chomp("fish");
		if(isTasty("car")==false)
			JOptionPane.showMessageDialog(null, "a car does not taste good");
		else {
			JOptionPane.showMessageDialog(null, "a car tastes good");
		}
		JFrame window = getWindow();
		int slices = getNumberOfPizzaSlicesLeft();
		String faveVeggie = getFavoriteVegetable("Mom");
		peel("potato");
		boolean healthyOrNot = isHealthy("avocado");
		simmer("soup"); 
	}
}
