public class areaOfLongestDiagonal {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0; 
        int maxArea = 0; 
         for (int[] rectangle : dimensions) {
                int length = rectangle[0];
                int width = rectangle[1];
                double diagonal = Math.sqrt(length * length + width * width);
                if (diagonal > maxDiagonal) {
                    maxDiagonal = diagonal;
                    maxArea = length * width; 
                } else if (diagonal == maxDiagonal) {
                    maxArea = Math.max(maxArea, length * width);
                }
         }
        return maxArea;
    }

    public static void main(String[] args) {
        int [][]twoDArray= {{2,3},{4,3}};
        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {
                System.out.print(twoDArray[row][col] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        int numberOfRows = areaOfMaxDiagonal(twoDArray);
        System.out.println(numberOfRows);
    }
    

}

