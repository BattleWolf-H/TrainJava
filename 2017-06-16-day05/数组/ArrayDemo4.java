class ArrayDemo4{
	public static void main(String[] args){
		int[][] array = new int[2][];
		System.out.println(array);//[[I@1db9742
		System.out.println(array[0]);//[I@106d69c
		System.out.println(array[1]);//[I@52e922
		int[] array1=new int[2];
		int[] array2=new int[2];
		System.out.println(array1);
		System.out.println(array2);
		array[0]=array1;
		array[1]=array2;
		System.out.println(array[0]);//0
		System.out.println(array[1]);//0
	}
	
}