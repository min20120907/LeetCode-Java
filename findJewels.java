class findJewels {
    public int numJewelsInStones(String jewels, String stones) {
        int sum =0;
        for (char a : stones.toCharArray()){
            if(jewels.indexOf(a)!=-1)
                sum++;
        }
        return sum;
    }
}
