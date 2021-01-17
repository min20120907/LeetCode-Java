class shuffleString {
    public String restoreString(String s, int[] indices) {
        char arr[] = s.toCharArray();
        char tmp[] = new char[s.length()];
        for(int i = 0;i<indices.length;i++) {
            tmp[indices[i]] = arr[i];
        }
        return new String(tmp);
    }
}
