package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame implements ActionListener {
	
	Container container = getContentPane();
	JTextField displayNumber = new JTextField();
	JButton one = new JButton("1");
	JButton two = new JButton("1");
	JButton three = new JButton("1");
	JButton four = new JButton("1");
	JButton five = new JButton("1");
	JButton six = new JButton("1");
	JButton seven = new JButton("1");
	JButton eight = new JButton("1");
	JButton nine = new JButton("1");
	JButton zero = new JButton("1");
	JButton dot = new JButton(".");
	JButton blank = new JButton("");
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton times = new JButton("*");
	JButton divide = new JButton("/");
	JButton equals = new JButton("=");
	
	public CalculatorGUI() {
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		addActionEvent();
	}
	
	public void setLayoutManager() {
		container.setLayout(null);
	}
	
	public void setLocationAndSize() {
//		displayNumber.setBounds(50, 150, 150, 80);
//		one.setBounds();
//		two.setBounds();
//		three.setBounds();
//		four.setBounds();
//		five.setBounds();
//		six.setBounds();
//		seven.setBounds();
//		eight.setBounds();
//		nine.setBounds();
//		zero.setBounds();
//		dot.setBounds();
//		blank.setBounds();
//		plus.setBounds();
//		minus.setBounds();
//		times.setBounds();
//		divide.setBounds();
//		equals.setBounds();
	}
	
	public void addComponentsToContainer() {
		
	}
	
	public void addActionEvent() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
