class Demo1{
	public static void main(String[] args
		/*��while��do-while��ӡ��99�˷���*/
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