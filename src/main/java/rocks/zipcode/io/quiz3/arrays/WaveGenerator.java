package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
//What are you doing?
public class WaveGenerator {
    public static String[] wave(String str) {
        String [] wave = new String[str.length()];
        String current = "";
        int nonAlphCount = 0;

        for(int i = 0 ; i < str.length();i++){
            if (!Character.isAlphabetic(str.charAt(i))){
                nonAlphCount++;
            }
        }
        int len = str.length() - nonAlphCount;
        for(int i =0;i < str.length();i++){
            current = "";
            for(int j = 0 ;j < str.length();j++) {
                if (Character.isAlphabetic(str.charAt(j))) {
                    if (j == i) {
                        current = current.concat(String.valueOf(str.charAt(j)).toUpperCase());
                    } else {
                        current = current.concat(String.valueOf(str.charAt(j)).toLowerCase());
                    }
                }else{
                    current = current.concat(String.valueOf(str.charAt(j)));
                }
            }
            wave[i] = current;
        }
        String [] newArr = new String[len];
        for (int i = 0; i <newArr.length; i++) {
            newArr[i] = wave[i];
        }
//        return newArr;
        return wave;
    }
}
