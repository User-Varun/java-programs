// matrix multiplication 


class MatrixMultiplication{
	
	public static void main(String args[]){
		
		int i , j , k , sum = 0;
		
	int a[][] = {{1 , 2, 3}, {4, 5 ,6} , {7 , 8 , 9}};
    int b[][] = { {10 , 11 , 12} , {13 , 14 , 15} , {16 , 17 , 18}};	
	int c[][] = new int[3][3];	
		
		
		
		
	for(i = 0; i<3; i++){
		
		for(j = 0; j <3; j++){
			for(k = 0; k < 3; k++){
				
			sum = sum+	a[i][k] * b[k][j];
			c[i][j] = sum;
			}
		}

	}
	
	System.out.println("ans= "+sum);
		
		
		
	}

}