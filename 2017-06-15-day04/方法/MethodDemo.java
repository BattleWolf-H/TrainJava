import java.util.Scanner;
class MethodDemo{
	public static void main(String[] args){
		int a,b,c;
		System.out.println("请输入两个数：");
		a = getNum();
		b = getNum();
		System.out.println("两个数中的最大值为："+getTwoNumMax(a,b));
		System.out.println("你输入的两个数是否相等"+isEqual(a,b));
		System.out.println("请输入三个数：");
		a = getNum();
		b = getNum();
		c = getNum();
		System.out.println("你输入的三个数中最大值为："+getThreeNumMax(a,b,c));
	}
	//从键盘录入数据
	public static int getNum(){
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		return a ;
	}
	//键盘录入两个数据，返回两个数中的较大值
	public static int getTwoNumMax(int a,int b){
		int max=a>b?a:b;
		return max;
	}
	//键盘录入两个数据，比较两个数是否相等
	public static boolean isEqual(int a,int b){
		boolean result = false;
		if(a==b){
			result =true;
			return result;
		}
		return result;
	}
	//键盘录入三个数据，返回三个数中的最大值
	public static int getThreeNumMax(int a,int b,int c){
		int max=(max=a>b?a:b)>c?max:c;
		return max;
	}

}