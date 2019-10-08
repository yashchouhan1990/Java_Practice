package number;

public class Number_Permutations {
	
	
    public static void main(String args[]) {
        permutation("123");

}

    public static void permutation(String input){
    	permutation("", input);
    }

    
    
    private static void permutation(String perm, String word) {
    	if(word.isEmpty()) {
    		System.out.println(perm + word);
    	} else {
    		for (int i=0; i<word.length(); i++) {
    			permutation( perm + word.charAt(i), word.substring(0,i) + word.substring(i+1, word.length()) );
    		}
    	}
    }
}

/*

Output-

123
132
213
231
312
321

*/