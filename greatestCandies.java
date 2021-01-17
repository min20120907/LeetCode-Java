class greatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max1 =0;
        int max =0;
        ArrayList<Boolean> ans = new ArrayList<>();
        for(int c : candies){
            if(c+extraCandies >= Arrays.stream(candies).max().getAsInt())
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
