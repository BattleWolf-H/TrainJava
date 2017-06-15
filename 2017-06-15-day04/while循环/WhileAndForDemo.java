class WhileAndForDemo{
	public static void main(String[] args){
		/*教室高度：48m，我现在有一张足够大的纸张，厚度为：0.12m。请问，我折叠多少次，就可以保证厚度不低于教室的高度?
		*/
		int i=0;
		float sum=0.12F;
		while(sum<=48){
			System.out.println(sum);
			sum*=2;
			i++;
		}
		System.out.println("经过"+i+"次折叠后，高度为"+sum);
	}
}