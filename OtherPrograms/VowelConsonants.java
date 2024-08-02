public class VowelConsonants {    
    public static void main(String[] args) {      
        int vCount = 0, cCount = 0;    
        String str = "Lagaan!";    
        str = str.toLowerCase();
        if (containsSpecialCharacter(str)) {
            System.out.println("The string contains special characters.");
            return;
        }
        
        StringBuilder consonants = new StringBuilder();
            
        for (int i = 0; i < str.length(); i++) {       
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {      
                vCount++;
            }     
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {        
                cCount++;    
                consonants.append(str.charAt(i));
            }    
        }    
        System.out.println("Number of vowels: " + vCount);   
        System.out.println("Consonants: " + consonants);
        System.out.println("Number of consonants: " + cCount);    
    }    

    public static boolean containsSpecialCharacter(String s) {
        return s.matches(".*[^a-zA-Z0-9 ].*");
    }
}
