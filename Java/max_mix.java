package mannokage;
import java.util.*;
public class max_mix {
	public static void main(String[]args) {
		System.out.println("�������������Խ��бȽϣ�");
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		sc.close();
		System.out.println("MAX is:"+"\t"+(a1>a2?(a1>a3?a1:a3):(a2>a3?a2:a3)));//���ֵ���
		System.out.print("MiX is:"+"\t"+(a1<a2?(a1<a3?a1:a3):(a2<a3?a2:a3)));//��С��ֵ���
	}
}
