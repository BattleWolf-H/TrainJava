class Demo{
	public static void main(String[] args){
		/*用while和do-while打印出4行列星星*/
		int H=0;
		while(H<4){
			int L=0;
			do{
				System.out.print("*");
				L++;
			}while(L<5);
			System.out.print("\n");
			H++;
		}
	}
}