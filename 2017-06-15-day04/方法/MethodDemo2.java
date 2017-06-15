import java.util.Scanner;
class MethodDemo2{
	public static void main(String[] args){
		System.out.println("请输入你要显示的星星图案的行和列：");
		int row = getNum();
		int column = getNum();
		showPicture(row,column);
		System.out.println("请输入你要显示乘法表的数：");
		int n = getNum();
		showTable(n);
	}
	//键盘输入数据
	public static int getNum(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}
	//键盘录入行数和列数，输出对应的星形
	public static void showPicture(int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
	public static void showTable(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}