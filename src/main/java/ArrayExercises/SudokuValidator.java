package ArrayExercises;

public class SudokuValidator {
    public static boolean validateSudoku(char[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j< grid.length; j++){
                if((i == 1 || i == 4|| i == 7) && (j == 1 || j == 4 || j == 7)){
                    if(isDuplicate(grid,i,j)) return false;
                }
                if(Math.abs(Character.compare(grid[i][j], '.'))>0){
                    if(findColumnDuplicates(grid,i,j)) return false;
                    if(findRowDuplicates(grid,i,j)) return false;
                }
            }
        }
        return true;
    }

    static boolean findRowDuplicates(char[][] a, int x, int y){
        char val = a[x][y];

        for(int i = x+1; i<a.length-1; i++){
            if(!(Math.abs(Character.compare(a[i][y], '.'))==0)){
                if(Character.compare(val,a[i][y])==0) return true;
            }
        }
        return false;
    }

    static boolean findColumnDuplicates(char[][] a, int x, int y){
        char val = a[x][y];

        for(int i = y+1; i<a.length-1; i++){
            if(!(Math.abs(Character.compare(a[x][i], '.'))==0)){
                if(Character.compare(val,a[x][i])==0) return true;
            }
        }
        return false;
    }


    static boolean isDuplicate(char[][] a,int x,int y) {
        boolean[] counts = new boolean[a.length+1];

        for(int i = x-1;i < x+2;i++){
            for(int j = y-1; j < y+2; j++){
                if(Math.abs(Character.compare(a[i][j], '.'))>0){
                    int intValue = Integer.parseInt(String.valueOf(a[i][j]));
                    if(counts[intValue]){
                        return true;
                    }else{
                        counts[intValue] = true;
                    }
                }
            }
        }
        return false;
    }
}
