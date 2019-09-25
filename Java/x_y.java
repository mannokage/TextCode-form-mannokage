package mannokage;//根据输入x的值，输出入相应计算后的y值
import javax.swing.*;
public class x_y {
	public static void main(String[]args) {
		String sc=JOptionPane.showInputDialog("请输入X的值");
		int a = Integer.parseInt(sc);
		x_y.xy(a);
		
	}
    public static void xy(int x) {
    	System.out.println("输入值为："+x);
		int y = 0;
		if (x<0)
			y=x*x-1;
		else if(x==0)
			y=0;
		else if(x>0)
			y=x+3;
		System.out.print("输出值为："+y);		
	}
}
