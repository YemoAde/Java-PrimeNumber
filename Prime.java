import java.io.*;
import java.lang.*;
import java.util.*;

public class Prime{
	public static void main(String[] args){
		int n = new Scanner(System.in).nextInt();
		int[] baseArray = {2,3,5,7};
		boolean value = false;
		for(int i = 0;i<baseArray.length;i++){
			if((n % baseArray[i]) == 0 && n != baseArray[i]){
				value = true;
				System.out.println(" Not Prime");
			}
		}
		if(!value){
			System.out.println("Prime");
		}
	}
}