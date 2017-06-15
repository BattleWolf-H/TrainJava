import java.util.Scanner;
class Demo2{
	public static void main(String[] args){
		int num1,num2,sum;//定义2个int型数值和1个int型和
		long l1,l2,maxL;//定义2个long型数值和1个long型最大值
		float f1,f2,f3,maxF;//定义3个float型数值和1个float型最大值
		byte b1,b2;//定义2个byte型数值
		Scanner sc=new Scanner(System.in);//创建Scanner对象sc
		//输入2个int型数据，并对数据进行求和
		System.out.println("请输入里2个int型数据：");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum = num1+num2;
		System.out.println("两个int数据的和为"+sum);
		//输入2个long型数据，并对数据进行比较
		System.out.println("请输入两个long型数据：");
		l1=sc.nextLong();l2=sc.nextLong();
		maxL = l1>l2?l1:l2;
		System.out.println("两个long型数据最大值为："+maxL);
		//输入3个float型数据，并求3个float数据中最大值
		System.out.println("请输入3个float型数据");
		f1=sc.nextFloat();f2=sc.nextFloat();f3=sc.nextFloat();
		maxF = (f1>f2?f1:f2)>f3?(f1>f2?f1:f2):f3;
		System.out.println("3个float型数据最大为："+maxF);
		//输入2个byte型数据，并对两个byte型数据进行判断是否相等
		System.out.println("请输入2个byte型数据");
		b1=sc.nextByte();b2=sc.nextByte();
		System.out.println("2个byte型数据是否相等："+(b1==b2));
	}
}