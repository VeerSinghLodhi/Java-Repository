class SubstringRemover {
    
    public static String removeSubstring(String input, String substring) {
        
        if (input == null || substring == null || substring.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder(); 
        int start = 0; 
        
        
        while (start < input.length()) {
            int index = input.indexOf(substring, start); 
            if (index == -1) {
                
                result.append(input.substring(start));
                break;
            }
            result.append(input.substring(start, index));
            start = index + substring.length();
        }

        return result.toString(); 
    }
    public static void main(String[] args) {
        String input = "This is a test string. Testing is fun.";
        String substring = "is";

        System.out.println("Original String: " + input);
        System.out.println("Substring to Remove: " + substring);

        String result = removeSubstring(input, substring);
        System.out.println("Modified String: " + result);
    }
}
