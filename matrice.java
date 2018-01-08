package Edunova;

public class matrice {
	
	public static void main(String[] args) {
		
		int a[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};  
		int b[][]={{9,8,7,6},{8,7,6,5},{7,6,5,4},{6,5,4,3}};  
		   
		int c[][]=new int[4][4];  
		   
		for(int i=0; i < 4;i++){  
		  for(int j=0; j < 4;j++){  
		    c[i][j]=a[i][j]+b[i][j];  
		    System.out.print(c[i][j]+" ");  
		  }  
		  System.out.println(); //novi red  
		 }  
		
	}

}
