class StringToInt {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        
        int i = 0;
        boolean positive = true;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            positive = s.charAt(i) == '-' ? false : true;
            i++;
        }
        
        if (i == s.length() || !Character.isDigit(s.charAt(i))) return 0;
        
        long num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + s.charAt(i) - '0';
            i++;
            
            if (num > Integer.MAX_VALUE) {
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        
       return positive ? (int)num : -(int)num;
    }
}
