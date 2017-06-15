/*
输出1-10之间的数
*/
class ForDemo{
	public static void main(String[] args){
		int sum1=0,sum2=0;
		//输出1-10之间的数
		for(int i=1;i<=10;i++){
			sum1+=i;
			if(i==10){
			System.out.print(i);
			}else{
			System.out.print(i+",");
			}
		}
		System.out.print("\n");
		//输出10-1之间的数
		for(int i=10;i>0;i--){
			if(i==1){
				System.out.print(i);
			}else{
				System.out.print(i+",");
			}
			
		}
		System.out.print("\n");
		//输出1-100之间偶数的和
		for(int i=1;i<=100;i++){
			if(i%2==0){
				//System.out.println(i);
				sum2+=i;
			}
		}
		System.out.println("1-100之间的偶数和为："+sum2);
		//输出1-100之间的奇数的和
		for(int i=1;i<=100;i++){
			if(i%2==1){
				sum2+=i;
			}
		}
		System.out.println("1-100之间的奇数和为："+sum2);
		int count3=0,count5=0,count7=0;
		for(int i=1;i<1000;i++){
			if(i%3==2)
				count3++;
			if(i%5==3)
				count5++;
			if(i%7==2)
				count7++;
		}
		System.out.println("1-1000整除3余2的个数为："+count3+",1-1000整除5余3的个数为："+count5+"，1-1000整除7余2的个数为："+count7);
	}
}