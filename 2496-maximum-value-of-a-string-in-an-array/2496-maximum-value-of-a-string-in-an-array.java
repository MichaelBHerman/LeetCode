class Solution {
    public int maximumValue(String[] strs) {
        int res=0;
        int max=0;
        for(int i=0;i<strs.length;i++){
            try{
                res=Integer.parseInt(strs[i]);
            }catch(Exception e){
                res=strs[i].length();
            }
            max=Math.max(res,max);
        }
        return max;
    }
}