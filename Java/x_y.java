package mannokage;//��������x��ֵ���������Ӧ������yֵ
import javax.swing.*;
public class x_y {
	public static void main(String[]args) {
		String sc=JOptionPane.showInputDialog("������X��ֵ");
		int a = Integer.parseInt(sc);
		x_y.xy(a);
		
	}
    public static void xy(int x) {
    	System.out.println("����ֵΪ��"+x);
		int y = 0;
		if (x<0)
			y=x*x-1;
		else if(x==0)
			y=0;
		else if(x>0)
			y=x+3;
		System.out.print("���ֵΪ��"+y);		
	}
}
