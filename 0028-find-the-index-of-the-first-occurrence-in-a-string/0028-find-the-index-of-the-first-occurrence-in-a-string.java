class Solution {
    public int strStr(String haystack, String needle) {
       int h=haystack.length(),n=needle.length();
        for(int i=0;i<=h-n;i++){
            String str=haystack.substring(i,i+n);
            if(str.equals(needle)) return i;
        }
        return -1;
    }
}