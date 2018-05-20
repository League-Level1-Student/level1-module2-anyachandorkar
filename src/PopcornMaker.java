import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	String time = JOptionPane.showInputDialog("How much time do you want to cook your popcorn?");
	int newtime = Integer.parseInt(time);
	Microwave box = new Microwave();
	Popcorn bag = new Popcorn(flavor);
	bag.applyHeat();
	box.putInMicrowave(bag);
	box.setTime(newtime);
	box.startMicrowave();
}
}
