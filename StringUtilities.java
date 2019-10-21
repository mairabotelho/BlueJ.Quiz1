
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input; 
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;    
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = "";
        
            for( int x = valueToBeReversed.length() - 1; x  >= 0; x--){
                reverse = reverse + valueToBeReversed.charAt(x);
            }
        
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int middle =  0; 
        
            if(word.length() % 2 == 0){
                
                middle = word.length() / 2 - 1;
            }else{
                middle = word.length() / 2;
            }
        
        return word.charAt(middle);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String newString = "";

        for(int x = 0; x < value.length(); x++){
            
            if(value.charAt(x) != charToRemove){
                newString = newString + value.charAt(x);
            }
        }
        
        return newString;
    }    

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String lastWord= "";
        
        lastWord = sentence.substring(sentence.lastIndexOf(" ") + 1);
        
        return lastWord;
    }
}
