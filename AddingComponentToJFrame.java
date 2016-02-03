import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;


public class AddingComponentToJFrame{
	public static void main(String[] args){

	JFrame frame = new JFrame("Adding Component to JFrame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container contentPane = frame.getContentPane();
		
	JButton closeButton = new JButton("Close");
	contentPane.add(closeButton);
	frame.setBounds(50,50,300,300);
	frame.setVisible(true);
}
	}

