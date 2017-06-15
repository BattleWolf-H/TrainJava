import java.util.Scanner;
class IfDemo{
	public static void main(String[] args){
		int a,b;//定义两个int型的变量
		Scanner sc =new Scanner(System.in);//创建Scanner对象sc
		//判断输入的两个数是否相等
		System.out.println("请输入第一个int型数据：");
		a=sc.nextInt();
		System.out.println("请输入第二个int型数据：");
		b=sc.nextInt();
		if(a==b)//用if语句进行判断两个数据是否相等
			System.out.println("输入的两个数据相等");
		System.out.println("输入的两个数据不相等");
		//比较输入的两个数据的大小
		System.out.println("请输入第一个int型数据：");
		a=sc.nextInt();
		System.out.println("请输入第二个int型数据：");
		b=sc.nextInt();
		if(a>b)//用if语句判断数据的大小
			System.out.println("输入的第一个数据"+a+"比第二个数据"+b+"大");
		System.out.println("输入的第一个数据"+a+"比第二个数据"+b+"小");
		//判断数据奇数还是偶数
		System.out.println("请输入int型数据：");
		a=sc.nextInt();
		if(a%2==0)//利用if语句判断数据的奇偶性
			System.out.println("输入的数据是偶数");
		System.out.println("输入的数据是奇数");
		
	}
}