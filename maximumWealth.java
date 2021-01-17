class maximumWealth {
    public int maximumWealth(int[][] accounts) {
        int max =0;
        for (int[] arr : accounts){
            int sum = 0;
            for (int n : arr){
                sum+=n;
            }
            if (max<sum) max=sum;
        }
        return max;
    }
}
