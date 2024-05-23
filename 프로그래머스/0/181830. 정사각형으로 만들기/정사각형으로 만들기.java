class Solution {
    public int[][] solution(int[][] arr) {
        
        int numberOfRow = arr.length;
        int numberOfCol = arr[0].length;
        
        if(numberOfRow > numberOfCol) {
            int[][] newArray = new int[numberOfRow][numberOfRow];
            for(int i = 0; i<numberOfRow; ++i){
                for(int j = 0; j<numberOfCol; ++j)
                    newArray[i][j] = arr[i][j];
                for(int j = numberOfCol; j<numberOfRow; ++j)
                    newArray[i][j] = 0;
            }
            return newArray;
        }
        
        if(numberOfRow < numberOfCol) {
            int[][] newArray = new int[numberOfCol][numberOfCol];
            for(int i = 0; i<numberOfRow; ++i){
                for(int j = 0; j<numberOfCol; ++j)
                    newArray[i][j] = arr[i][j];
            }
            for(int i = numberOfRow; i<numberOfCol; ++i){
                for(int j = 0; j<numberOfCol; ++j)
                    newArray[i][j] = 0;
            }
            return newArray;
        }
        
        return arr;
    }
}