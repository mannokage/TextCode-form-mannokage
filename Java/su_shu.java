package mannokage;
public class su_shu {
	public static void main(String[]aegs) {
		int i=0,j=0;
		System.out.println("1~1000����Ϊ��\n");
		for(int a=1;a<=1000;a++) { 
			boolean flag=true;//Ĭ��flagֵΪ��
			for(int b=2;b<a;b++) {//�˴�aֵΪ1,2ʱ������1�ʹ�ʱaֵ�������������ڵ����Ƿ��ܱ�����
				if(a%b==0) {
					flag=false;//���Ϊ����ʱ��flagΪ��
				}
			}
			if(flag==true&&a!=1) {//��ȡ�������޳�1
				i++;//����ͳ������������
				j+=a;
				System.out.print(a+"\t");
				if(i%7==0)
					System.out.println();//���ض������������з���
			}
		}
		System.out.print("\n��������Ϊ��"+i+"\n");
		System.out.print("����֮��Ϊ��"+j);
	}

}
