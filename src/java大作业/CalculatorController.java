package java大作业;

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
File file=new File("D:\\JAVA\\eclipse\\workspace\\java大作业");

public CalculatorController(CalculatorWindow w) {
	win=w;
	}


public void actionPerformed(ActionEvent e){//将按钮显示到显示器里去
	 String label=e.getActionCommand();//获得按钮的数字或者字符
if(label.equals("1")||label.equals("0")||label.equals("2")||label.equals("3")||label.equals("4")||label.equals("5")||label.equals("6")||label.equals("7")||label.equals("8")||label.equals("9")||label.equals(".")) 
{
	if(win.textfield2.getText().length()==0) {
		win.textfield.setText(win.textfield.getText()+label);//除非有运算符，才给3号框赋值
	}
	else win.textfield3.setText(win.textfield3.getText()+label);
}
else if(label.equals("+")||label.equals("-")||label.equals("*")||label.equals("/")||label.equals("sqrt")) {
	win.textfield2.setText(label);
}

if(label.equals("=")) {
	 float x=Float.parseFloat(win.textfield.getText());//将第一个框内容转化为实数并赋值给x
	 float y=Float.parseFloat(win.textfield3.getText());
	 float d=0;
	model.Jisuan(x,y);//调用计算函数
	
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

else if(label.equals("退格"))
{
	if(win.textfield2.getText().length()==0&&win.textfield3.getText().length()==0)
	{
		    int i=win.textfield.getText().length();
	        if(i>0)
	        win.textfield.setText(win.textfield.getText().substring(0,i-1)); //substring(0,i-1)实现退格
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
	 float x=Float.parseFloat(win.textfield.getText()); //第一个空里的值 
	 float h=-(x);
	 String q=String.valueOf(h); //将float转换为string
	 win.textfield.setText(q);
	 }
	
	 if(win.textfield2.getText().length()!=0&&win.textfield3.getText().length()!=0)
	 {
		float c=Float.parseFloat(win.textfield3.getText()); //第三个空里的值 
		 float cc=-(c);
		 String ccc=String.valueOf(cc); //将float转换为string
		 win.textfield3.setText(ccc);
	 }
	
}
	
else if(label.equals("清除")) {
	win.jtextarea1.setText(null);
}

else if(label.equals("保存")) {
	String text=win.jtextarea1.getText();//取出文本域内的东西
	
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

else if(label.equals("查看"))
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



