package code_challenge;
import java.io.*;
import java.util.*;
public class array_sorting_012_bufferedclass{
	
	
	public static void sort012(int arr[],int n) {
		Arrays.sort(arr);
	}
	
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	while(t-->0) {
		
		int n=Integer.parseInt(br.readLine().trim());
		int arr[]=new int[n];
		String inputLine[]=br.readLine().trim().split(" ");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(inputLine[i]);
		}
		sort012(arr,n);
		StringBuffer str=new StringBuffer();
		for(int i=0;i<n;i++) {
			str.append(arr[i]+" ");
		}
		System.out.println(str);
	}
		
		
	}
	
	

}
