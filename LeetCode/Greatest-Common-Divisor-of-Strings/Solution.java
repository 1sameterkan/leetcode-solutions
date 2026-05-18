    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()) return gcdOfStrings(str2, str1);
        for (int i = str2.length(); i > 0; i--) {
            int prefixLen = i - 0;
            if (str2.length() % prefixLen != 0) continue;
            String prefix = str2.substring(0, i);
            if (dividesString(str1, prefix) && dividesString(str2, prefix))
                return prefix;
        }
        
        return "";
    }
    
    private boolean dividesString(String str, String prefix) {
        if (str.length() % prefix.length() != 0) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i % prefix.length()))
                return false;
        }
                
        return true;
    }