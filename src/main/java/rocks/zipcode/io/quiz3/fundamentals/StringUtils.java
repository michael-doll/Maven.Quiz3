package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String returnString = "";
        for (int i = 0; i < str.length() ; i++) {
            if(i == indexToCapitalize){
                returnString = returnString.concat(String.valueOf(str.charAt(i)).toUpperCase());
            }else{
                returnString = returnString.concat(String.valueOf(str.charAt(i)));
            }
        }
        return returnString;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return(String.valueOf(baseString.charAt(indexOfString)).equals(String.valueOf(characterToCheckFor)));
    }

    public static String[] getAllSubStrings(String string) {
        int size = getNumberOfSubStrings(string);
        int count =0;
        String[] returnArr = new String[size+1];
        for (int i = 0; i <string.length() ; i++) {
            for (int j = i+1; j <= string.length() ; j++) {
                returnArr[count] = string.substring(i,j);
                count++;
            }
        }
        return returnArr;
    }

    public static Integer getNumberOfSubStrings(String input){
        int count = 0;
        for (int i = 0; i <input.length()-1 ; i++) {
            for (int j = i; j < input.length(); j++) {
                count++;
            }
        }
        return count;
    }
}
