import java.util.Scanner;
class ArrayDemo3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] array=new int[]{1,2,3,143,99,-1,7,2,9};
		//1.遍历数组
		showArray(array);
		//2.获取数组最大值，最小值
		int[] arr=getMaxMin(array);
		System.out.println("数组中最大值为："+arr[0]+",最小值为："+arr[1]);
		//数组元素逆序 (就是把元素对调)
		array=ConArray(array);
		showArray(array);
	}
		//1.数组遍历
		public static void showArray(int[] array){
			for(int i=0;i<array.length;i++){
				System.out.println("数组中第"+(i+1)+"个值为："+array[i]);
			}
		}
		//2.数组获取最值(获取数组中的最大值最小值)
		public static int[] getMaxMin(int[] array){
			int max=array[0],min=array[0];
			for(int i=0;i<array.length;i++){
				if(max<array[i]){
					max=array[i];
				}
			}
			for(int i=0;i<array.length;i++){
				if(min>array[i]){
					min=array[i];
				}
			}
			int[] arrM = new int[2];
			//arrM[最大值，最小值]
			arrM[0]=max;
			arrM[1]=min;
			return arrM;
		}
		
		//3.数组元素逆序 (就是把元素对调)
		public static int[] ConArray(int[] array){
			int[] array2 = new int[array.length];
			for(int i=0;i<array2.length;i++){
				array2[i]=array[array.length-1-i];
			}
			return array2;
		}
		//4.数组查表法(根据键盘录入索引,查找对应)
		public static void getWeek(int week){
			String[] weekend=new String[]{"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
			if(week<1 || week>7){
				System.out.println("你的输入有误！");
			}else{
				System.out.println("数组中第"+week+"个数为："+weekend[week-1]);
			}
	}	
		public static void getIndex(int[] array,int Num){
		//5.数组元素查找(查找指定元素第一次在数组中出现的索引
			for(int i=0;i<array.length;i++){
				if(array[i]==Num){
					System.out.println("数组中第一次出现"+Num+"在第"+(i+1)+"个位置");
					break;
				}
			}
		}
	
	
		
}