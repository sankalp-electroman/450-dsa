package code_challenge;

public class Max_Min_ele_array {
      
	static class pair{
		int min;
		int max;
	}
	
	static pair getminmax(int arr[],int n) {
		pair minmax=new pair();
		
		if(n==1) {
			minmax.min=arr[0];
			minmax.max=arr[0];
			return minmax;
		}
		if(arr[0]>arr[1]) {
			minmax.min=arr[1];
			minmax.max=arr[0];
			
		}
			else {
				minmax.min=arr[0];
		        minmax.min=arr[1];
		        
			}
			for(int i=2;i<n;i++) 
			{
				
				if(arr[i]>minmax.max) {
					minmax.max=arr[i];
				}
				else if(arr[i]<minmax.min) {
					minmax.min=arr[i];
				}
			}
	return minmax;
	}
	



         public static void main(String[] args) {
			
			int arr[]= {4,5,6,7,8};
			int size=5;
			pair minmax=getminmax(arr,size);
	        System.out.println("min: "+minmax.min);
	        System.out.println("max: "+minmax.max);

	}

}
