package code_challenge;
import java.io.*;
import java.util.*;

public class negative_integer_placing_beginning {

	public static void rearrangeArray(int arr[],int n) {
		int j=0;
		int temp=0;
		for(int i=0;i<n;i++) {
		if(arr[i]<0) {
			if(i!=j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
			j++;
		}
		}
	}
	
	public static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {-12,11,-13,-5,6,-7,5,-3,-6};
		int n=arr.length;
		rearrangeArray(arr,9);
		printArray(arr,9);

	}

}
