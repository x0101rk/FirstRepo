package linklistpkg;

public class SetZerosAlgo {

	public void setZeros(int matrix[][]){
		/*
		 * 
		 * Input array[], then initialize 2 arrays, row and column to keep track of the 0's. Iterate over the 2'd array, and mark their location in the row, column.
		 * later 0 out the rows and columns in the original array.  
		*/
		
		boolean row[] = new boolean[matrix.length];
		boolean column[] = new boolean[matrix[0].length];
		
		for(int i=0; i< matrix.length ; i++){
			for(int j = 0; j<matrix[0].length; i++){
				if(matrix[i][j] == 0){
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		//nullify this row
		for(int i = 0; i<row.length; i++){
			if(row[i]) nullfyRow(matrix, i);
		}
		for(int i = 0; i<column.length; i++){
			if(column[i]) nullfyColumn(matrix, i);
		}
		
		
	}

	private void nullfyColumn(int[][] matrix, int i) {
		for(int j = 0; j< matrix[0].length ; j++){
			
		}
	}

	private boolean nullfyRow(int[][] matrix, int i) {
		// TODO Auto-generated method stub
		return false;
	}
}
