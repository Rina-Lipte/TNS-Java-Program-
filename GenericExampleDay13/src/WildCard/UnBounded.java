package WildCard;

import java.util.*;


public class UnBounded {
	
	//public void showData(List<?> al) {
		//for(Object o : al) {
			//System.out.println(o);
	
	public void showData(List<? extends Number> al) {
		long n=0;
		for(Number o : al) {
			int k = o.intValue();
			//System.out.println(k*k);
			n=n+k;
		}
			System.out.println(n);
			
			
		}

}