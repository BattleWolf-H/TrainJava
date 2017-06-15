import java.util.Scanner;
class IFDemo2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入x的值：");
		int x = sc.nextInt();
		int y=0;
		if(x>=1){
			y=2*x+1;
		}else if(x<1 && x>=-1){
			y=2*x;
		}else{
			y=2*x-1;
		}
		System.out.println("y的值为："+y);
		System.out.println("请输入月份：");
		x=sc.nextInt();
		if(x<1 || x>12){
			System.out.println("输入的数据有误！");
		}else if(x>=3&&x<=5){
			System.out.println("该季节为春季");
		}else if(x>=6&&x<=8){
			System.out.println("该季节为夏季");
		}else if(x>=9&&x<=11){
			System.out.println("该季节为秋季");
		}else{
			System.out.println("该季节为冬季");
		}
		System.out.println("请输入第一个数据：");
		x=sc.nextInt();
		System.out.println("请输入第二个数据：");
		y=sc.nextInt();
		System.out.println("请输入第三个数据：");
		int z=sc.nextInt();
		if(x>=y&&x>=z){
			System.out.println("你输入的数据最大为："+x);
		}else if(y>=x&&y>=z){
			System.out.println("你输入的数据最大为："+y);
		}else if(z>=x&&z>=y){
			System.out.println("你输入的数据最大为："+z);
		}
		System.out.println("Hello");
	}
}