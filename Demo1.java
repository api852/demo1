public class Program1 {
	public static void main(String[] args) {
		 try
		 {int r1=3 , c1 = 3,i,j,k;
		
	        int r2 = 3, c2 = 3;
	        int[][] A = {{1,2,3},{1,2,3},{1,2,3}};
	        int[][] B = {{1,2,3},{1,2,3},{1,2,3}};
	        int[][] c = new int[r1][c2];
            int a=3;
            switch(a)
            {
                case 1:System.out.println("Addition of 2 matrices");
                     for(i=0;i<r1;i++)
     	             {
     	    	       for(j=0;j<c2;j++)
     	    	       {
     	    			   c[i][j]=A[i][j]+B[i][j];
     	    	       
     	    		   System.out.print(c[i][j]+" ");
     	             }
     	    	      System.out.println(" ");
     	             }
     	    	
     	    	   break;
     	    	  
                case 2:System.out.println("Subtraction of 2 matrices");
                for(i=0;i<r1;i++)
	             {
	    	       for(j=0;j<c2;j++)
	    	       {
	    			   c[i][j]=A[i][j]-B[i][j];
	    	       
	    		   System.out.print(c[i][j]+" ");
	             }
	    	      System.out.println(" ");
	             }
                break;
                case 3:System.out.println("Multiplication of 2 matrices");
                for(i=0;i<r1;i++)
     	       {
     	    	   for(j=0;j<c2;j++)
     	    	   {
     	    		   c[i][j]=0;
     	    		   for(k=0;k<3;k++)
     	    		   {
     	    			   c[i][j]+=A[i][k]*B[k][j];
     	    		   }
     	    		   System.out.print(c[i][j]+" ");
     	    	   }
     	    	   System.out.println(" ");
     	       }
                break;
                case 4:System.out.println("Square of a matrix");
                for(i=0;i<r1;i++)
	             {
	    	       for(j=0;j<c2;j++)
	    	       {
	    			   c[i][j]=A[i][j]*A[i][j];
	    	       
	    		   System.out.print(c[i][j]+" ");
	             }
	    	      System.out.println(" ");
	             }
     	    	  
     	       break;
     		     default:System.out.println("Enter correct value");
            }
		 }
		 catch(Exception e) {
			 System.out.println("Error handled");
		 }
	}
}
