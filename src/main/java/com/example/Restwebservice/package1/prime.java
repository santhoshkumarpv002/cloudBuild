package com.example.Restwebservice.package1;

import io.micrometer.core.instrument.distribution.CountAtBucket;

public class prime {
public static void main(String[] args) {
	
	
	int num=1;
	int Count=0;
	for(int i=1; i<=num; i++) {
		
		if(num%i==0)
			{Count+=1;
	
			}
		
		
	}

	if(Count==2)
		System.out.println("given is prime");
	else {
		System.out.println("give is not prime");
	}
	
	
}
}
