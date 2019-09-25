package mannokage;//输入三个数，输出最大&最小值
import java.util.*;
public class max_mix {
	public static void main(String[]args) {
		System.out.println("请输入三个数以进行比较：");
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		sc.close();
		System.out.println("MAX is:"+"\t"+(a1>a2?(a1>a3?a1:a3):(a2>a3?a2:a3)));//最大值输出
		System.out.print("MiX is:"+"\t"+(a1<a2?(a1<a3?a1:a3):(a2<a3?a2:a3)));//最小大值输出
	}
}
