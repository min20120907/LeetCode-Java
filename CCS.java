class CCS {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String s : words){
            boolean contain = true;
            for (char c : s.toCharArray()) {
                contain &= (allowed.indexOf(c)!=-1);
            }
            if(contain) count++;
        }
        return count;
    }
}
