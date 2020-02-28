import java.util.ArrayList;
import java.util.List;

public class N127单词接龙 {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        boolean[] Used = new boolean[wordList.size()];
        int res= ladderLengthtool(beginWord,endWord,wordList,Used);
        if(res == Integer.MAX_VALUE) return 0;
        return res+1;
    }
    public static boolean Judge(String beginWord, String endWord){
        int step = 0,len = beginWord.length();
        for(int i=0;i<len;i++){
            if(beginWord.charAt(i)!=endWord.charAt(i)) step++;
            if(step>1) return false;
        }if(step<=1) return true;
        return false;
    }
    public static int ladderLengthtool(String beginWord, String endWord, List<String> wordList, boolean[] Used){
        if(beginWord.equals(endWord)) return 0;
        int step = Integer.MAX_VALUE;
        for(int i=0;i<wordList.size();i++){
            String midWord=wordList.get(i);
            if(Used[i]==false) {
                boolean judge = Judge(beginWord, midWord);
                if (judge == true) {
                    boolean[] NewUsed = Used.clone();
                    NewUsed[i] = true;
                    step = Math.min(step, ladderLengthtool(midWord, endWord, wordList, NewUsed));
                }
            }
        }
        if(step!=Integer.MAX_VALUE) return step+1;
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args){
        String[] wordList1 = {"hot","dot","dog","lot","log","cog"};
        List<String> wordList = new ArrayList<>();
        for(String temp:wordList1){
            wordList.add(temp);
        }
        String beginWord = "hit";
        String endWord = "cog";
        System.out.println(ladderLength(beginWord,endWord,wordList));
    }

}
