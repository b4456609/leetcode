package bernie.leetcode;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] maze = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        int i = new IslandPerimeter().islandPerimeter(maze);
        System.out.println(i);
    }

    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //up
                if (i == 0 && grid[i][j] == 1) {
                    result++;
                }
                //left
                if (j == 0 && grid[i][j] == 1) {
                    result++;
                }
                //right
                if (j == grid[0].length - 1 && grid[i][j] == 1) {
                    result++;
                }
                //bottom
                if (i == grid.length - 1 && grid[i][j] == 1) {
                    result++;
                }

                //not up
                if (i != 0 && grid[i][j] != grid[i - 1][j]) {
                    result++;
                }
                //not left
                if (j != 0 && grid[i][j] != grid[i][j - 1]) {
                    result++;
                }

            }
        }
        return result;
    }
}
