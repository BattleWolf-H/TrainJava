class DoWhileDemo{
	public static void main(String[] args
		/*
			��1-1000����������ż������
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
		System.out.println("1-1000��������Ϊ"+simpleCount+"����ż������Ϊ"+doubleCount+"��");
	}
}