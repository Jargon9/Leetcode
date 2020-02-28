package 周赛;

import java.util.LinkedList;
import java.util.Queue;

public class N5170验证二叉树 {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Queue<Integer> store = new LinkedList<>();
        store.add(0);
        int[] mark = new int[n];
        while(store.size()!=0){
            int temp = store.poll();
            if(leftChild[temp]!=-1) store.add(leftChild[temp]);
            if(rightChild[temp]!=-1) store.add(rightChild[temp]);
            if(mark[temp]==0)mark[temp] = 1;
            else return false;
            n--;
        }
        if(n==0)return true;
        return false;
    }
}
