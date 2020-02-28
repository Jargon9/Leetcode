package offer;

public class N33二叉搜索树的后序遍历序列 {
    public static boolean verifyPostorder(int[] postorder) {
        int len = postorder.length;
        if(len<=2) return true;
        return verifyPostorderTool1(postorder, 0, len-1);
    }
    public static boolean verifyPostorderTool1(int[] postorder, int l, int r){
        int len = r-l;
        if(len<=1) return true;
        int LastNum = postorder[r];
        for(;l<r;l++){
            if(postorder[l]>LastNum) break;
        }
        int rs = l;
        for(;rs<r;rs++){
            if(postorder[rs]<LastNum) return false;
        }
        return verifyPostorderTool1(postorder, 0, l-1)&&verifyPostorderTool1(postorder, l, r-1);
    }
}
