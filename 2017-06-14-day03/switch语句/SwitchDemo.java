import java.util.Scanner;
class SwitchDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		switch(year){
			
			case 12:  
			case 1:   
			case 2:	  System.out.println("��ǰ����Ƕ�����");
					break;
			case 3:
			case 4:   
			case 5:	  System.out.println("��ǰ����Ǵ�����");
					break;
			case 6:  
			case 7:	  
			case 8:	  System.out.println("��ǰ������ļ���");
					break;
			case 9:	  
			case 10:  
			case 11:  System.out.println("��ǰ������＾��");
					break;
			default : System.out.println("�����������");
					break;
		}
	}
}