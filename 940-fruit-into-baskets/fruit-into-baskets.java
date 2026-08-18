class Solution {
    public int totalFruit(int[] fruits) {
        int k=2;
        int low=0;
        int result=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int high=0;high<fruits.length;high++){
            int ch=fruits[high];
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()>k){
                int sh=fruits[low];
                map.put(sh,map.getOrDefault(sh,0)-1);
                if(map.get(sh)==0){
                    map.remove(sh);
                }
                low++;
            }

            if(map.size()<=k){
                int len=high-low+1;
                result=Math.max(result,len);

            }
        }

        return result;
    }
}