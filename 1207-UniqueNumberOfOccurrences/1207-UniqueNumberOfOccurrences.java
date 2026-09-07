// Last updated: 9/7/2026, 4:27:52 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int a : arr)
            map.put(a, map.getOrDefault(a,0) + 1); 

        HashSet<Integer> set = new HashSet<>();
        for(int a : map.values())
            if(!set.add(a)) return false;
        return true;
    }
}