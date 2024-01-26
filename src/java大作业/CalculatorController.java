package java����ҵ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Objects;

import javax.swing.JOptionPane;

public class CalculatorController implements ActionListener {
	 CalculatorWindow win;
	 CalculatorModel model=new CalculatorModel();
File file=new File("D:\\JAVA\\eclipse\\workspace\\java����ҵ");

public CalculatorController(CalculatorWindow w) {
	win=w;
	}


public void actionPerformed(ActionEvent e){//����ť��ʾ����ʾ����ȥ
	 String label=e.getActionCommand();//��ð�ť�����ֻ����ַ�
if(label.equals("1")||label.equals("0")||label.equals("2")||label.equals("3")||label.equals("4")||label.equals("5")||label.equals("6")||label.equals("7")||label.equals("8")||label.equals("9")||label.equals(".")) 
{
	if(win.textfield2.getText().length()==0) {
		win.textfield.setText(win.textfield.getText()+label);//��������������Ÿ�3�ſ�ֵ
	}
	else win.textfield3.setText(win.textfield3.getText()+label);
}
else if(label.equals("+")||label.equals("-")||label.equals("*")||label.equals("/")||label.equals("sqrt")) {
	win.textfield2.setText(label);
}

if(label.equals("=")) {
	 float x=Float.parseFloat(win.textfield.getText());//����һ��������ת��Ϊʵ������ֵ��x
	 float y=Float.parseFloat(win.textfield3.getText());
	 float d=0;
	model.Jisuan(x,y);//���ü��㺯��
	
	if(win.textfield2.getText().equals("+")) {
		d=model.plus();
		win.textfield4.setText("="+d);
		win.jtextarea1.setText(x+win.textfield2.getText()+y+win.textfield4.getText());
		}

	if(win.textfield2.getText().equals("-")) {
		d=model.sub();
		win.textfield4.setText("="+d);
		win.jtextarea1.setText(x+win.textfield2.getText()+y+win.textfield4.getText());
		}

	if(win.textfield2.getText().equals("*")) {
		d=model.mul();
		win.textfield4.setText("="+d);
		win.jtextarea1.setText(x+win.textfield2.getText()+y+win.textfield4.getText());
		}
		
	if(win.textfield2.getText().equals("/")) {
		d=model.div();
		win.textfield4.setText("="+d);
		win.jtextarea1.setText(x+win.textfield2.getText()+y+win.textfield4.getText());
		}

	}
else if(label.equals("c"))
{
		win.textfield.setText(null);
		win.textfield2.setText(null);
		win.textfield3.setText(null);
		win.textfield4.setText(null);
}

else if(label.equals("�˸�"))
{
	if(win.textfield2.getText().length()==0&&win.textfield3.getText().length()==0)
	{
		    int i=win.textfield.getText().length();
	        if(i>0)
	        win.textfield.setText(win.textfield.getText().substring(0,i-1)); //substring(0,i-1)ʵ���˸�
	} 
	if(win.textfield2.getText().length()!=0&&win.textfield3.getText().length()==0)
	{
			int j=win.textfield2.getText().length();
		        if(j>0)
	        win.textfield2.setText(win.textfield2.getText().substring(0,j-1));
	}
	if(win.textfield3.getText().length()!=0)
	{				
		       int k=win.textfield3.getText().length();
	       if(k>0)
	       win.textfield3.setText(win.textfield3.getText().substring(0,k-1));
	}
}
else if(label.equals("sqrt"))
{
	 float x=Float.parseFloat(win.textfield.getText());
	 double q=model.squ(x);
	 win.textfield4.setText("="+q);
	 win.jtextarea1.setText("sqrt"+"("+x+")"+win.textfield4.getText());
}

else if(label.equals("+/-"))
{
	 if(win.textfield2.getText().length()==0&&win.textfield3.getText().length()==0)
	 {float d=0;
	 float x=Float.parseFloat(win.textfield.getText()); //��һ�������ֵ 
	 float h=-(x);
	 String q=String.valueOf(h); //��floatת��Ϊstring
	 win.textfield.setText(q);
	 }
	
	 if(win.textfield2.getText().length()!=0&&win.textfield3.getText().length()!=0)
	 {
		float c=Float.parseFloat(win.textfield3.getText()); //�����������ֵ 
		 float cc=-(c);
		 String ccc=String.valueOf(cc); //��floatת��Ϊstring
		 win.textfield3.setText(ccc);
	 }
	
}
	
else if(label.equals("���")) {
	win.jtextarea1.setText(null);
}

else if(label.equals("����")) {
	String text=win.jtextarea1.getText();//ȡ���ı����ڵĶ���
	
	if(!file.exists())
		try {
			file.createNewFile();
			Reader reader=new FileReader(text);
			Writer writer=new FileWriter(file,true);
		//	while((text=reader.read()))
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	
}

else if(label.equals("�鿴"))
{ 
	 
	try
	{
		 FileReader fr=new  FileReader(file);
		 char[] data=new char[512];
		 int r=0;
		 while((r=fr.read(data))>0)
		 {
			 String str=new String(data,0,r);
			 win.jtextarea1.setText(str);
		 }
	}
    catch(IOException m)
	{
			m.printStackTrace();
	}
}	 

}
}



