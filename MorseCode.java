class MorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String morse_codes[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> output = new HashSet<String>();
        for (String s : words) {
            String n = "";
            for(char c : s.toCharArray()) {
                n+=morse_codes[c-97];
            }
            output.add(n);
        }
        return output.size();
    }
}
