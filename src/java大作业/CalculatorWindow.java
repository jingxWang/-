package java大作业;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorWindow extends JFrame{
	@SuppressWarnings("static-access")
	CalculatorController ctroller;
		JTextField textfield = new JTextField();//创建单行文本框
		JTextField textfield2 = new JTextField();
		JTextField textfield3 = new JTextField();
		JTextField textfield4 = new JTextField();//创建单行文本框
		JTextField jtextarea1 = new JTextField();//创建文本框
		final JScrollPane atextarea1= new JScrollPane();//给文本域一个滚动面板
		
	public CalculatorWindow() {
		
		ctroller=new CalculatorController (this);//便于使用该类中的变量
		setLayout(new GridLayout(1,2,10,10));
		final JPanel viewbuttons= new JPanel();
		final JPanel vaj = new JPanel();//创建面板vaj将右侧全部组件装进去
		add(viewbuttons,BorderLayout.WEST);
		add(vaj,BorderLayout.EAST);//通过布局器将面板放入窗口
		
	
		textfield.setColumns(13);//设置文本框窗长度
		textfield2.setColumns(5);
		textfield3.setColumns(13);
		
		final JPanel viewpanel= new JPanel();//创建了显示器面板
		final JPanel viewpanel1= new JPanel();
		final JPanel viewpanel2= new JPanel();
		final JPanel viewpanel3= new JPanel();
		
		viewpanel.add(viewpanel1,BorderLayout.WEST);//小显示器面板收进大的里
		viewpanel.add(viewpanel2,BorderLayout.CENTER);
		viewpanel.add(viewpanel3,BorderLayout.EAST);
		
		viewpanel1.add(textfield);//将文本框放入面板，作为计算器的显示器
		viewpanel2.add(textfield2);
		viewpanel3.add(textfield3);
		
		final JPanel buttonPanel = new JPanel();//创建按钮面板
	
		final GridLayout gridlayout =new GridLayout(4,5,5,5);//设置网格布局器，4行5列，横纵距5
		buttonPanel.setLayout(gridlayout);//按钮面板安上网格布局
		
		String[][] name= {{"1","2","3","/","c"},{"4","5","6","*","退格"},{"7","8","9","-","sqrt"},{"0","+/-",".","+","="}};
		JButton[][] buttons=new JButton[4][5];//创建一个4x5的按钮
		for(int i=0;i<name.length;i++)
		{
			for(int t=0;t<=name.length;t++) {
				buttons[i][t]=new JButton(name[i][t]);//将name数组中的值赋值给按钮
				buttonPanel.add(buttons[i][t]);//将按钮安进面板
				buttons[i][t].addActionListener(ctroller);//创建监听器
			}
		}
		final BorderLayout borderlayout = new BorderLayout();//这里使用了边界布局器
		viewbuttons.setLayout(borderlayout);//标明使用的布局器
		viewbuttons.add(viewpanel,borderlayout.NORTH);
		viewbuttons.add(buttonPanel,borderlayout.SOUTH);
		
		
		textfield4.setColumns(37);
		final JPanel viewpanel4= new JPanel();//创建文本框的面板
		viewpanel4.add(textfield4);//文本框放进面板里
		
		
		
		atextarea1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//设置垂直滚动条一直显示
		jtextarea1.setColumns(1);//实现创建文本域大小
		atextarea1.setViewportView(jtextarea1);//文本框放进面板里
		
		final JButton jbuttons1=new JButton();//创建按钮
		jbuttons1.setText("保存");
		jbuttons1.addActionListener(ctroller);//创建监听器
		final JButton jbuttons2=new JButton();//创建按钮
		jbuttons2.setText("查看");
		jbuttons2.addActionListener(ctroller);//创建监听器
		final JButton jbuttons3=new JButton();//创建按钮
		jbuttons3.setText("清除");
		jbuttons3.addActionListener(ctroller);//创建监听器
		final JPanel jbuttonspanel = new JPanel();//创建按钮面板

		jbuttonspanel.add(jbuttons1,BorderLayout.WEST);
		jbuttonspanel.add(jbuttons2,BorderLayout.CENTER);
		jbuttonspanel.add(jbuttons3,BorderLayout.EAST);
		
		final BorderLayout borderlayout2 = new BorderLayout();//创建新的边界布局器，用于右侧面板的组装
		vaj.setLayout(borderlayout2);//标明使用的布局器
		
		vaj.add(viewpanel4,borderlayout.NORTH);
		vaj.add(atextarea1,borderlayout.CENTER);
		vaj.add(jbuttonspanel,borderlayout.SOUTH);

		 
		
		
		
		
	}
}
		