package mannokage;
public class su_shu {
	public static void main(String[]aegs) {
		int i=0,j=0;
		System.out.println("1~1000素数为：\n");
		for(int a=1;a<=1000;a++) { 
			boolean flag=true;//默认flag值为真
			for(int b=2;b<a;b++) {//此处a值为1,2时跳出；1和此时a值（不含）区间内的数是否能被整除
				if(a%b==0) {
					flag=false;//结果为合数时，flag为假
				}
			}
			if(flag==true&&a!=1) {//攫取质数且剔除1
				i++;//依此统计质素数个数
				j+=a;
				System.out.print(a+"\t");
				if(i%7==0)
					System.out.println();//按特定素数个数进行分行
			}
		}
		System.out.print("\n素数个数为："+i+"\n");
		System.out.print("素数之和为："+j);
	}

}
