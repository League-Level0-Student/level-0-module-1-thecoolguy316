//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Diego = "SUPER SUPER SUPER Good Luck";
String Kevin = "invisible";
String Yen = "Levatation";
String Daniel = "SUPER SUPER SUPER Strong";
String Tra = "The Brains";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Enter a name that is in my table please i beg you to please this is my everything please.");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals("Diego")){
	JOptionPane.showMessageDialog(null, Diego);
}
	



if (name.equals("Kevin")) {
	JOptionPane.showMessageDialog(null, Kevin);
}
	if (name.equals("Yen")) {
	JOptionPane.showMessageDialog(null, Yen);
}

 if (name.equals("Daniel")) {
 JOptionPane.showMessageDialog(null, Daniel);
}
if (name.equals("Tra")) {
JOptionPane.showMessageDialog(null, Tra);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
	
