package javaSorting;

public class Binary_Serach {

	public static void main(String[] args) {
		int num[]={10,20,30,50,80};
		int l=0,r=num.length-1,m,x=50;
		while(l<=r){
			m=(l+r)/2;
			if(num[m]<x){
				l=m+1;
			}
			else if(num[m]==x){
				System.out.println("Found the Elemet Location : "+m);
				break;
			}else{
				r=m-1;
			}
		
		}
		if(l>r){
			System.out.println("Element is not Found");
		}
		
	}

}
