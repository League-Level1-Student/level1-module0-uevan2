import javax.swing.JOptionPane;

public class Methods2 {

	static String whichPresent(String friendName) {

	       if(friendName.equalsIgnoreCase("Evan")) {
	    	   return "money";
	       }
	       else {
	    	   return "gift cards";
	       }
	}
	
	static boolean doPigsEat(String food) {

	       if(food.equalsIgnoreCase("roots")) {

	              return true;

	       //
	}
	              else {return false;}

	}
	
	static int getMyLuckyNumber() {
			return 7;
	}
	
	
    static int eggsMomWants() {

          return 5;

    }



    static int eggsDadWants() {

         return 2;

    }
	
	public static void main(String[] args) {
		String present = whichPresent("evan");
		JOptionPane.showMessageDialog(null, present);
		if(doPigsEat("Bananas")==true) {
			JOptionPane.showMessageDialog(null, "pigs eat bananas");
		}
		else {
			JOptionPane.showMessageDialog(null, "pigs dont eat bananas");
		}
		JOptionPane.showMessageDialog(null, getMyLuckyNumber());
		JOptionPane.showMessageDialog(null, "Your Family wants "+(eggsMomWants()+eggsDadWants())+" eggs");
	}

}