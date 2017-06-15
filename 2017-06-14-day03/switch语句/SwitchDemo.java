import java.util.Scanner;
class SwitchDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		switch(year){
			
			case 12:  
			case 1:   
			case 2:	  System.out.println("当前年份是冬季！");
					break;
			case 3:
			case 4:   
			case 5:	  System.out.println("当前年份是春季！");
					break;
			case 6:  
			case 7:	  
			case 8:	  System.out.println("当前年份是夏季！");
					break;
			case 9:	  
			case 10:  
			case 11:  System.out.println("当前年份是秋季！");
					break;
			default : System.out.println("你的输入有误！");
					break;
		}
	}
}