package java大作业;

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
    	float Result=A/B; //除法
       	  return Result;	  
      }
    public  float mul(){  
    	float Result=A*B;//乘法
        return Result; 
      }
     public  float plus(){
    	 float Result=A+B;//加法
        return Result; 
         }
     public  float sub(){
    	 float Result=A-B;//减法
       	  return Result;	  
         }
     public   double squ(float A){
       	  double result=Math.sqrt(A);   //开根号
			return result;
         }
	
}

