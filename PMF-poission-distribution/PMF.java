 class PMF
{   
    
   static void pmf()
    {
        System.out.println("********* PMF of Poissions distribution *********\n");
		
		System.out.println("formula : ");
		System.out.println("P(X=r)=(e^-𝛌)(𝛌^r)/r!\n");
		System.out.println("X--> Random Variable (number of events)");
		System.out.println("r--> specifies the number of occurnce(0,1,2,3...)");
		System.out.println("𝛌--> average number of events in the interval (mean)");
		System.out.println("e--> euler's number(~2.718)\n");
		
	    System.out.println("* 𝛌(lamda) --> must be >= 0");
	    System.out.println("* r -->must be >=0 and integer");
     	System.out.println("* output --> probability value (double)\n");
	
	    System.out.println("Edge Cases :");
	    System.out.println("    if 𝛌 < 0 --> Invalid input");
	    System.out.println("    if r < 0 --> Invalid input ");
    	System.out.println("    if r is not integer --> Invalid ");
	
        Scanner sc= new Scanner(System.in);
	
	   System.out.println("Enter the value of r:");
	        int  r= sc.nextInt();
	          
	   if(r<0)
	    { 
	           System.out.println("Invalid Input , try again ");
	           return ;
	    }
	    
	   System.out.println("Enter the value of lambda:");
	        double  lambda = sc.nextDouble();
	          
	   if(lambda<0)
	    {  
	           System.out.println("Invalid Input, try again");
	           return ;
	    }
	          
	  double numerator=exponentialFunction(lambda)*powerFunction(lambda,r);     
	  double denominator =factorial(r);
	 
	  double output =numerator/denominator;
	 
	  System.out.printf("PMF is : %.5f",output);
	    
    }
    

    
   static double factorial(int r)
    {
        double rFact=1.0;
    
        for(int i=1;i<=r;i++)
        {
            rFact*=i;
        }
        
        return rFact;
    }
    
    
   static double exponentialFunction(double lambda)
    {
        return Math.exp(-lambda);
    }
    
    static double powerFunction(double lambda ,int r)
     {
         return Math.pow(lambda,r);
     }   
     
}