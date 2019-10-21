 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int result = 1;
          
            for(int x = number; x > 0; x--){
                result = result * x;
            }
            
          return result;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          char first = phrase.charAt(0);
          char current;
          String result = "" + first;
          int index;
          
          for(int x = 0; x < phrase.length(); x++){
              
              current = phrase.charAt(x);
              
              if(Character.isWhitespace(current)){
                  index = x+1;
                  result = result + phrase.charAt(index);
                }
            }
              
          
          return result.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String newMessage = ""; 
          char current;
          
          
          
          for (int i = 0; i < word.length(); i++){
              
              current = word.charAt(i);
              
              if(current >= 'x'){
                  
                  newMessage = newMessage + (char)((( word.charAt(i))+ 3) - 26);
                }else{  
                    
                    newMessage = newMessage + (char)(word.charAt(i) + 3);
            }
                
            }
            

          
          return newMessage;
      }
}













