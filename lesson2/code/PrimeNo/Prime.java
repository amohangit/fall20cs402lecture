/* This code is written by Professor Mohan. */
public class Prime{
	private int compute(int start, int end){
		int num_of_primes = 0;
		for (int i = start; i <= end; i++) { 
  			if (i == 1 || i == 0) 
                continue; 
  			boolean is_prime = true; 
            for (int j = 2; j <= i / 2; j++){ 
                if (i % j == 0) { 
                    is_prime = false; // not a prime 
                    break; 
                } 
            } 
            if (is_prime == true){
                //System.out.println(i);
                num_of_primes++; // found a prime
            }
        } 
    	return num_of_primes;
	}
	public static void main(String[] args){
		int alpha = 200; // try with different nos here. 
        int beta = 5;
        Prime obj = new Prime();
		int no_of_primes = 0;
        for (int i =0; i < beta; i++){
            int start = i * (alpha/beta);
            int end = start + alpha/beta - 1;
            int myshare = obj.compute(start, end);
            no_of_primes += myshare;
            System.out.println("Range from " + start 
                +  " to " + end + " is: " + myshare);
        }            
     	System.out.println("Total no of primes: " + no_of_primes);
        
        /* A question here is, if beta represents the number of 
        workers and to solve the program in parallel, 
        how do we define the range for each worker? */
	}	
}