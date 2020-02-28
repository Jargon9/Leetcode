import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class N130被环绕的区域 {
    public static void solve(char[][] board) {
        int len = board.length;
        if(len>2){
            int wid = board[0].length;
            boolean[][] flag = new boolean[len][wid];
            for(int i=1;i<len-1;i++){
                for(int j=1;j<wid-1;j++){
                    if(board[i][j]=='O'&&flag[i][j]==false){
                        board = solvetool(board,flag,i,j);
                    }
                }
            }
        }
    }
    public static char[][] solvetool(char[][] board, boolean[][] flag, int i,int j){
        flag[i][j] = true;
        int len = board.length, wid = board[0].length;
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        Queue<Pair<Integer, Integer>> change = new LinkedList<>();
        queue.add(new Pair<>(i,j));
        while(queue.size()!=0){
            Pair<Integer,Integer> exp = queue.peek();
            int x = queue.peek().getKey(), y = queue.poll().getValue();
            change.add(exp);
            flag[x][y] = true;
            if(!(x>0&&x<len-1&&y>0&&y<wid-1)) return board;
            for(int[] temp:dir){
                if(flag[x+temp[0]][y+temp[1]]==false&&board[x+temp[0]][y+temp[1]]=='O'){
                    queue.add(new Pair<>(x+temp[0],y+temp[1]));
                }
            }
        }
        for(Pair temp:change){
            board[(int) temp.getKey()][(int) temp.getValue()] = 'X';
        }
        return board;
    }
    public static void main(String[] args){
        char[][] s = {{'O','O','O'},
                {'O','X','O'},
                {'O','O','O'}};
        solve(s);
    }
}
