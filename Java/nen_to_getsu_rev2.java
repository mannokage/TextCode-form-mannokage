package mannokage;//�������������ж�����REV2�棬�򻯴��룬Ϊ���հ�
import javax.swing.*;
import java.util.regex.*;
public class nen_to_getsu_rev2 {
	public static void main(String[]args) {
		int n,g,day=0;
		String n_regex="(\\d{4}|\\d{2})";//����淶����ݷ�Χ����ʽ
		String g_regex="(0?([1-9]))|(1[1|2])";//����淶�·ݷ�Χ����ʽ
		String nen=JOptionPane.showInputDialog("��������ȷ��Ϊ���޵�������֣�");
		for(;;) {
			if(Pattern.matches(n_regex, nen)) {
				n=Integer.parseInt(nen);break;
				}else nen=JOptionPane.showInputDialog("�������ֵΪ����ȷ���޵���ݣ�������������ȷ����ݣ�");
			}
		String getsu=JOptionPane.showInputDialog("��������ȷ���·����֣�");
		for(;;) {
			if(Pattern.matches(g_regex,getsu)) {
				g=Integer.parseInt(getsu);break;
				}else getsu=JOptionPane.showInputDialog("���������ֵΪ����ȷ���޵��·ݣ�������������ȷ���·ݣ�");
			}
		switch(g) {
		case 1:day=31;break;
		case 2:
			if((n%4==0)&&(n%100!=0)||(n%400==0))
			day=29;else day=28;break;
		case 3:day=31;break;
		case 4:day=30;break;
		case 5:day=31;break;
		case 6:day=30;break;
		case 7:
		case 8:day=31;break;
		case 9:day=30;break;
		case 10:day=31;break;
		case 11:day=30;break;
		case 12:day=31;break;
		}
		if((n%4==0)&&(n%100!=0)||(n%400==0))
			JOptionPane.showMessageDialog(null, n+"��Ϊ������"+"\n"+g+"������Ϊ��"+day+"��"); 
		else
			JOptionPane.showMessageDialog(null, n+"��Ϊ��ƽ��"+"\n"+g+"������Ϊ��"+day+"��");
	}
}
