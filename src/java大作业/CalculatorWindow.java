package java����ҵ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorWindow extends JFrame{
	@SuppressWarnings("static-access")
	CalculatorController ctroller;
		JTextField textfield = new JTextField();//���������ı���
		JTextField textfield2 = new JTextField();
		JTextField textfield3 = new JTextField();
		JTextField textfield4 = new JTextField();//���������ı���
		JTextField jtextarea1 = new JTextField();//�����ı���
		final JScrollPane atextarea1= new JScrollPane();//���ı���һ���������
		
	public CalculatorWindow() {
		
		ctroller=new CalculatorController (this);//����ʹ�ø����еı���
		setLayout(new GridLayout(1,2,10,10));
		final JPanel viewbuttons= new JPanel();
		final JPanel vaj = new JPanel();//�������vaj���Ҳ�ȫ�����װ��ȥ
		add(viewbuttons,BorderLayout.WEST);
		add(vaj,BorderLayout.EAST);//ͨ���������������봰��
		
	
		textfield.setColumns(13);//�����ı��򴰳���
		textfield2.setColumns(5);
		textfield3.setColumns(13);
		
		final JPanel viewpanel= new JPanel();//��������ʾ�����
		final JPanel viewpanel1= new JPanel();
		final JPanel viewpanel2= new JPanel();
		final JPanel viewpanel3= new JPanel();
		
		viewpanel.add(viewpanel1,BorderLayout.WEST);//С��ʾ������ս������
		viewpanel.add(viewpanel2,BorderLayout.CENTER);
		viewpanel.add(viewpanel3,BorderLayout.EAST);
		
		viewpanel1.add(textfield);//���ı��������壬��Ϊ����������ʾ��
		viewpanel2.add(textfield2);
		viewpanel3.add(textfield3);
		
		final JPanel buttonPanel = new JPanel();//������ť���
	
		final GridLayout gridlayout =new GridLayout(4,5,5,5);//�������񲼾�����4��5�У����ݾ�5
		buttonPanel.setLayout(gridlayout);//��ť��尲�����񲼾�
		
		String[][] name= {{"1","2","3","/","c"},{"4","5","6","*","�˸�"},{"7","8","9","-","sqrt"},{"0","+/-",".","+","="}};
		JButton[][] buttons=new JButton[4][5];//����һ��4x5�İ�ť
		for(int i=0;i<name.length;i++)
		{
			for(int t=0;t<=name.length;t++) {
				buttons[i][t]=new JButton(name[i][t]);//��name�����е�ֵ��ֵ����ť
				buttonPanel.add(buttons[i][t]);//����ť�������
				buttons[i][t].addActionListener(ctroller);//����������
			}
		}
		final BorderLayout borderlayout = new BorderLayout();//����ʹ���˱߽粼����
		viewbuttons.setLayout(borderlayout);//����ʹ�õĲ�����
		viewbuttons.add(viewpanel,borderlayout.NORTH);
		viewbuttons.add(buttonPanel,borderlayout.SOUTH);
		
		
		textfield4.setColumns(37);
		final JPanel viewpanel4= new JPanel();//�����ı�������
		viewpanel4.add(textfield4);//�ı���Ž������
		
		
		
		atextarea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//���ô�ֱ������һֱ��ʾ
		jtextarea1.setColumns(1);//ʵ�ִ����ı����С
		atextarea1.setViewportView(jtextarea1);//�ı���Ž������
		
		final JButton jbuttons1=new JButton();//������ť
		jbuttons1.setText("����");
		jbuttons1.addActionListener(ctroller);//����������
		final JButton jbuttons2=new JButton();//������ť
		jbuttons2.setText("�鿴");
		jbuttons2.addActionListener(ctroller);//����������
		final JButton jbuttons3=new JButton();//������ť
		jbuttons3.setText("���");
		jbuttons3.addActionListener(ctroller);//����������
		final JPanel jbuttonspanel = new JPanel();//������ť���

		jbuttonspanel.add(jbuttons1,BorderLayout.WEST);
		jbuttonspanel.add(jbuttons2,BorderLayout.CENTER);
		jbuttonspanel.add(jbuttons3,BorderLayout.EAST);
		
		final BorderLayout borderlayout2 = new BorderLayout();//�����µı߽粼�����������Ҳ�������װ
		vaj.setLayout(borderlayout2);//����ʹ�õĲ�����
		
		vaj.add(viewpanel4,borderlayout.NORTH);
		vaj.add(atextarea1,borderlayout.CENTER);
		vaj.add(jbuttonspanel,borderlayout.SOUTH);

		 
		
		
		
		
	}
}
		