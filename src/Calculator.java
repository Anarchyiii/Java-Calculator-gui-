import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame
{
	private JTextField textfield;
	
	public Calculator()
	{
		setLayout(null);
		
		textfield=new JTextField();
		textfield.setEditable(false);
		textfield.setBackground(Color.WHITE);
		textfield.setBounds(10,10,270,70);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,4,5,5));
		panel.setBounds(8,90,270,235);
		
		String CalcButton[]= {"C","/","*","=","7","8","9","+","4","5","6","-","1","2","3","0"};
		JButton button[]=new JButton[CalcButton.length];
		
		for(int i=0;i<CalcButton.length;i++)
		{
			button[i]=new JButton(CalcButton[i]);
			panel.add(button[i]);
		}
		
		add(textfield);
		add(panel);
		
		setSize(300,400);
		setLocation(700,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("°è»ê±â");
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Calculator();
	}

}
