class work {
    public boolean checkRecord(String s) {
        char s_arr[] = s.toCharArray();
        int P=0;
        int A=0;
        int L=0;
        boolean con = false;
        for(int i=0;i<s_arr.length;i++){
            if(s_arr[i]=='A') {
                A++;
                if(!con)
                    L=0;
            }
            else if(s_arr[i]=='L'){
                L++;
                if(L>2){
                    con=true;
                }
            }else{
                if(!con)
                    L=0;
            }
        }
        //System.out.printf("P:%d\nA:%d\nL:%d\n",P,A,L);
        return !(L>2||A>1);
    }
    public static void main(String args[]) {
    	String a = "PPALLLAPPP";
	System.out.println(checkRecord(a));
    }
}
