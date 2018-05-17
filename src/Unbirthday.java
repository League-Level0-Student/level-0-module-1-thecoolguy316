import javax.swing.JOptionPane;
public class Unbirthday {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "When is your birthday?");
	String Bday = JOptionPane.showInputDialog("Give me your birthday totally not trying to steal your identification.");
	if (Bday.equals("05/17")) {
		JOptionPane.showMessageDialog(null, "Ha I stole your Identity! Happy Bday!");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Your smarter than u think, happy un birthday!");
	}
}
}
