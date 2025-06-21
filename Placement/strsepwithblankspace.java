public class strsepwithblankspace {
    public static void main(String[] args) {
        String s = "hel thiis is are ";
        int start = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                String word = s.substring(start, i);
                boolean repeating = false;
                
                for (int j = 0; j < word.length(); j++) {
                    for (int k = j + 1; k < word.length(); k++) {
                        if (word.charAt(j) == word.charAt(k)) {
                            repeating = true;
                            break;
                        }
                    }
                    if (repeating) {
                        break;
                    }
                }
                
                if (repeating) {
                    System.out.println(word);
                    break;
                }
                start = i + 1;
            }
        }
    }
}