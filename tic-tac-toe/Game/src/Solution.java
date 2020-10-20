	import java.util.*;
	import java.util.Arrays;
	//System.out.println("this is a debug message");
	class Solution {
	    public static int solution(int[] A) {
	      Boolean Found = false;
	      int x =1;
	      int y=1;
	      Arrays.sort(A);
	      while(!Found){
	    	  if(A.length==y){
	    		  if(A[y-1]==x){
	    			  x++;
	    		  }
	        	 System.out.println("3");
	             Found = true;
	    	  }else if(x<=A[y-1] && A[y-1]>=0){
	        	  x++;
	        	  System.out.println(x);
	          }else if(A.length>y){
	        		 y++;
	        		 System.out.println(y);
	        	  }
	          
	        }
		return x;
	    }

	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2};
		System.out.println(solution(A));

	}

}
