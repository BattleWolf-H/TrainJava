class DoWhileDemo{
	public static void main(String[] args
		/*
			求1-1000奇数个数和偶数个数
		*/
		int simpleCount=0,doubleCount=0,i=0;
		do{
			if(i%2==0){
				doubleCount++;
			}else{
				simpleCount++;
			}
			i++;
		}while(i<1000);
		System.out.println("1-1000奇数个数为"+simpleCount+"个，偶数个数为"+doubleCount+"个");
	}
}