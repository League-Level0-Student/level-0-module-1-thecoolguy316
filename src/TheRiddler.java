import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
String A="fire";
		// 1. Make a variable to hold the score
int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String firstriddle =JOptionPane.showInputDialog("Feed me and I live, yet give me a drink and I die. ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (firstriddle.equals(A)){
	JOptionPane.showMessageDialog(null, "You AAAAAARRRRRRRRREEEEE CCOOOOOOOOOOOOOORREEEEEEEECCCCCCCCTTTTTTTTTT");
score = score +1;
JOptionPane.showMessageDialog(null, "Good job get ready for the next round! Switching sides!");
}
else {
	JOptionPane.showMessageDialog(null, "You are the smartest person in the world. Aprils foooollllsss! but it is not APRIL! WHOOOO CCCCAAAAAAAARREEEEESSSSHISSHISSHISSHISSHISS!!!!!!");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

