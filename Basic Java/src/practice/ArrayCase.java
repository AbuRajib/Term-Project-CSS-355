package practice;

public class ArrayCase {

	public static void main(String[] args) {
		
		//Declaration int[] a   or int a[]
		
/*		int[] num=new int[]{1,2,3,4,5};  //or Declaration:  int[] num={1,2,3,4,5}
		String name[]={"john","David","red","blue"};
		
		System.out.println(num[2]);
		for(int i=0;i<=4;i++){
			System.out.println(num[i]);
		}
*/	
//		name[2]="green";
//		System.out.println(name[2]);
		
		//Array Length
//		System.out.println(num.length);
/*		int j=0;
		while(j<name.length){
			System.out.println(name[j]);
			j++;
		}
*/		
/*		int[][] x={{1,2,3,4},
 * 					{5,6,7}};
		System.out.println(x[1][2]);
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.println(x[i][j]);
			}
			
		}
*/		
		int[] smallPrimes = {2, 3, 5, 7, 11, 13};
		int[] luckyNumbers = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
		System.arraycopy(smallPrimes, 2, luckyNumbers, 3, 3);//System.arraycopy(from, fromIndex, to, toIndex, count);
		for (int i = 0; i < luckyNumbers.length; i++)
		System.out.println(i + ": " + luckyNumbers[i]);
		
		
		
	}

}
