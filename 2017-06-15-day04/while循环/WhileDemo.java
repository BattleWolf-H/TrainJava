class WhileDemo{
	public static void main(String[] args){
		//用while求1-10的和
		int i=1,sum=0;
		while(i<=10){
			sum+=i;
			i++;
		}
		System.out.println("1-10之间的和为："+sum);
	}
}