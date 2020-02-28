package offer;

import com.sun.javaws.IconUtil;

import java.util.Arrays;

public class N12矩阵中的路径 {
    public static boolean exist(char[][] board, String word) {
        int BoardHei = board.length, BoardWid = board[0].length;
        boolean[][] mark = new boolean[BoardHei][BoardWid];
        boolean res = false;
        for (int i = 0; i < BoardHei; i++) {
            for (int j = 0; j < BoardWid; j++) {
                if (board[i][j] == word.charAt(0)) {
                    mark[i][j] = true;
                    res = Judge(board, mark, word, 1, i, j);
                    if (res == true) return res;
                    for (int k = 0; k < BoardHei; k++) {
                        for (int m = 0; m < BoardWid; m++) {
                            mark[i][j] = false;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static boolean Judge(char[][] board, boolean[][] mark, String word, int index, int x, int y){
        if(index>=word.length()) return true;
        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        boolean res = false;
        for(int[] temp : dir){
            if(x+temp[0]>=board.length||y+temp[1]>=board[0].length||x+temp[0]<0||y+temp[1]<0) continue;
            if(mark[x+temp[0]][y+temp[1]] == false&&word.charAt(index)==board[x+temp[0]][y+temp[1]]){
                mark[x+temp[0]][y+temp[1]] = true;
                res = Judge(board, mark, word, index+1, x+temp[0], y+temp[1]);
                if(res == true) return true;
                mark[x+temp[0]][y+temp[1]] = false;
            }
        }
        return false;
    }
    public static void main(String[] args){
        char[][] s = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(s, "ABCB"));
    }
}
