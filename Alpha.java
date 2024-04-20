class Alpha {
       public static void main(String[] args){
	   char firstch = 'A';
	   int rows = 6 ;
	     for (int i = 0 ; i < rows ; i++){
		 
		     for (int space = 0 ; space < rows -i-1 ; space ++)
			 {
			 System.out.print (" "); 
			 }
		 
		 for (int j = 0 ; j <= i ; j++){
		 System.out.print((char)(firstch + j) + " ");
		 
		 }
		 System.out.println();
		 
		 }
	   
	   }
}