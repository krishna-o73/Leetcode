//https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/description/
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String st="";
        for(int i=0;i<words.length;i++){
            if(s.indexOf(words[i])==-1){
                return false;
            }
            st+=words[i];
            if(s.equals(st)){
                return true;
            }
        }
        return false;
    }
}
