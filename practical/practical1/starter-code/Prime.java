/* This code is written by Professor Mohan. */
public class Prime{
	public static int compute(int start, int end){
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
    public static void doWork(int alpha, int beta){
        int no_of_primes = 0;
        /* A question here is, if beta represents the number of 
        workers and to solve the program in parallel, 
        how do we define the range for each worker? 
        (partitioning process) */
        for (int wid =0; wid < beta; wid++){
            int start = wid * (alpha/beta);
            int end = start + alpha/beta - 1;
            int myshare = compute(start, end);
            no_of_primes += myshare;
            System.out.println("Range from " + start 
                +  " to " + end + " is: " + myshare);
        }            
        System.out.println("Total no of primes: " + no_of_primes);
        
    }
	public static void main(String[] args){
		//long start_time = System.nanoTime();
        int alpha = 200; // try with different nos here. 
        int beta = 5;
        doWork(alpha, beta);
        //long end_time = System.nanoTime();
        //long total_time = end_time - start_time;
        //System.out.println(total_time);
	}	
}