class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int left=0;
        int right=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(s.charAt(i),0)+1);

        }
        for(int i=0;i<right;i++)
        {
            char ch=t.charAt(i);
            
            if(map.get(ch)==null||map.get(ch)==0) return false;
            map.put(ch,map.get(ch)-1);
  
        }
        
        return true;

    }
}
