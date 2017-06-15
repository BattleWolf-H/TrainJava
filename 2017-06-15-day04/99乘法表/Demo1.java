class Demo1{
	public static void main(String[] args
		/*用while和do-while打印出99乘法表*/
		int i=1;
		while(i<=9){
			int j=1;
			do{
				System.out.print(j+"*"+i+"="+j*i+"  ");
				j++;
			}while(j<=i);
			System.out.print("\n");
			i++;
		}
	}
}