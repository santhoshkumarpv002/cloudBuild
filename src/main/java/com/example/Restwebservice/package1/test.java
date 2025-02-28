package com.example.Restwebservice.package1;

class Test{
    public static void main(String[] args) {
        System.out.println("Testing");

        
        int[] a= {-19,-2,-10,-5,-6};
        
         
        
        int high1=Integer.MIN_VALUE;; int high2=Integer.MIN_VALUE;
        
      
     for(int i:a)
     {
    	 if(high1<i) {
    		 high2=high1;
    		high1=i;continue;
    		}
    	 if(high2<i) {high2=i;}
    
     }
        
     System.out.println( "first high:"+high1);  
     System.out.println( "second high:"+high2);  
        
    }
}