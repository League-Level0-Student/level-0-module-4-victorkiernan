import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String scores= 	JOptionPane.showInputDialog("What did you get on yor test?");
double score = Double.parseDouble(scores);
if(score<10&&score>0) {
	JOptionPane.showMessageDialog(null, "Did you even try???!!!");
}
else if(score<50&&score>10) {
	JOptionPane.showMessageDialog(null, "Big fat F!!!");}
 else if(score<70&&score>50) {
	 JOptionPane.showMessageDialog(null, "Wanna retry? If not its ok, but still nice!");}
 else if(score<100&&score>70) {
	 JOptionPane.showMessageDialog(null, "Good Job!)");
 }
}

}
