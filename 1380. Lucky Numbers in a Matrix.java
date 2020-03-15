class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> returnList = new ArrayList<>();
		int rowCount = matrix.length;
		int columnCount = matrix[0].length;
		int[][] matrixTranspose = new int[columnCount][rowCount];
		
		for (int i = 0; i < rowCount; i++) {
			
			for (int j = 0; j < columnCount; j++) {
				matrixTranspose[j][i] = matrix[i][j];
				
			}
			
		}
		
		for (int i = 0; i < rowCount; i++) {
			
			List<Integer> rowList = Arrays.stream(matrix[i]).boxed().collect(Collectors.toList());
			Collections.sort(rowList);
			int index = Arrays.stream(matrix[i]).boxed().collect(Collectors.toList()).indexOf(rowList.get(0));
			
			List<Integer> colList = Arrays.stream(matrixTranspose[index]).boxed().collect(Collectors.toList());
			Collections.sort(colList);
			
			if ( (int)rowList.get(0) == (int)colList.get(colList.size()-1)) {
				returnList.add(rowList.get(0));
			}
			
		}
        return returnList;
        
    }
}