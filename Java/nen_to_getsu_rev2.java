package mannokage;//根据输入年月判断天数REV2版，简化代码，为最终版
import javax.swing.*;
import java.util.regex.*;
public class nen_to_getsu_rev2 {
	public static void main(String[]args) {
		int n,g,day=0;
		String n_regex="(\\d{4}|\\d{2})";//正则规范化年份范围及格式
		String g_regex="(0?([1-9]))|(1[1|2])";//正则规范月份范围及格式
		String nen=JOptionPane.showInputDialog("请输入正确且为超限的年份数字：");
		for(;;) {
			if(Pattern.matches(n_regex, nen)) {
				n=Integer.parseInt(nen);break;
				}else nen=JOptionPane.showInputDialog("输入的数值为不正确或超限的年份，请重新输入正确的年份：");
			}
		String getsu=JOptionPane.showInputDialog("请输入正确的月份数字：");
		for(;;) {
			if(Pattern.matches(g_regex,getsu)) {
				g=Integer.parseInt(getsu);break;
				}else getsu=JOptionPane.showInputDialog("所输入的数值为不正确或超限的月份，请重新输入正确的月份：");
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
			JOptionPane.showMessageDialog(null, n+"年为：闰年"+"\n"+g+"月天数为："+day+"天"); 
		else
			JOptionPane.showMessageDialog(null, n+"年为：平年"+"\n"+g+"月天数为："+day+"天");
	}
}
