package day01_algorithm_samples;

public class FindData {

    public static void main(String[] args) {
        
        String[] array = {"Apple", "Banana"};
        String word = "Grape";
        boolean contained = isContained(array, word);
        System.out.println("contained = " + contained);
    }
    
    public static boolean isContained(String[] array, String word){
        
        boolean result = false;
        for (String each : array) {
            if(each.equals(word)){
                return true;
            }else{
                return false;
            }
        }
        return result;
    }
}
