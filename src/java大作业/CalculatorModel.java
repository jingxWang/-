package java����ҵ;

import javax.swing.JFrame;

public class CalculatorModel extends JFrame{
	CalculatorController controller;
	 CalculatorWindow win;
	float A,B;
public void Jisuan(float X,float Y){
	A=X;
	B=Y;
}

    public float div() {
    	float Result=A/B; //����
       	  return Result;	  
      }
    public  float mul(){  
    	float Result=A*B;//�˷�
        return Result; 
      }
     public  float plus(){
    	 float Result=A+B;//�ӷ�
        return Result; 
         }
     public  float sub(){
    	 float Result=A-B;//����
       	  return Result;	  
         }
     public   double squ(float A){
       	  double result=Math.sqrt(A);   //������
			return result;
         }
	
}

