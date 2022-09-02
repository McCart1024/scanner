package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    public class Words {

        public String deleteEvenCharacters(String word) {

            String[] stringArray=word.split("");
            List<String> newString=new ArrayList<>();
            for (int i=1;i<stringArray.length;i=i+2){
                newString.add(stringArray[i]);
            }
            return String.join("",newString);//


//            String result="";
//            if (word==null){
//                return null;
//            }
////
////            for(int i=1;i<word.length();i=i+2){
////                String index=String.valueOf(word.charAt(i));
////                result=result.concat(index);
////            }
////            return result;

//            StringBuilder sb=new StringBuilder();
//            for (int i=1;i<word.length();i=i+2){
//                sb.append(word.charAt(i));
//            }
//            return sb.toString();

        }

        public static void main(String[] args) {

            Words words = new Words();
            System.out.println(words.deleteEvenCharacters("alma"));
            System.out.println(words.deleteEvenCharacters(""));
            System.out.println(words.deleteEvenCharacters("as"));
//            System.out.println(words.deleteEvenCharacters(null));

        }
}
