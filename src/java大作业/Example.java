package java大作业;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class Example extends JFrame{
	public static void main(String args[]) {
		CalculatorWindow Frame=new CalculatorWindow();
		Frame.setVisible(true);//使窗体可见

		Frame.setBounds(10,10,700,210);//x，y，width，height
	}
}
