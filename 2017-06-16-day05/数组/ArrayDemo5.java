import java.util.Scanner;
class ArrayDemo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要显示的杨辉三角的层数：");
		int cow = sc.nextInt();
		System.out.println("杨辉三角如下：");
		showYH(cow);
		System.out.println("100-1000的水仙花如下：");
		showFlower();
	}
	//二维数组遍历
	public static void showArray(int[][] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.println("数组第"+i+"行第"+j+"列的值为："+array[i][j]);
			}
		}
	}
	//杨辉三角
	public static void showYH(int cow){
		int[][] array=new int[cow][cow];
		array[0][0] =1;
		array[1][0] =1;array[1][1]=1;
		//[0][0]=1;[1][0]=1;[1][1]=1;[2][0]=1;
		for(int i=2;i<array.length;i++){
			array[i][0]=1;
			for(int j=1;j<i+1;j++){
					array[i][j]=array[i-1][j-1]+array[i-1][j];
			}
			array[i][i]=1;
		}
		//遍历杨辉三角数组
		for(int i=0;i<cow;i++){
			for(int j=0;j<=i;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	//打印出100-999所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身
	public static void showFlower(){
		int a=0,b=0,c=0;
		for(int i=100;i<1000;i++){
			a = i%10;//个位
			b = i/10%10;//十位
			c = i/100;//百位
			if(i==(a*a*a+b*b*b+c*c*c))
				System.out.print(i+"\t");
		}
	}
	
	
	
	
	
	


	
}