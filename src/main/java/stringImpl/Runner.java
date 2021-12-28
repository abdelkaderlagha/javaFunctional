package stringImpl;

public class Runner {
    public static void main(String[] args) {

        int result = decode("2465");
        System.out.println(result);
    }
    static int decode(String input){
        int sumOdd=0;
        int sumEven=0;
        int finalRes=0;
        int sub =0;
        for(int i=0;i<input.length();i++){
            if(i%2==0)
                sumOdd=sumOdd+Character.getNumericValue(input.charAt(i));
        }

        for(int i=0;i<input.length();i++){
            if(i%2!=0)
                sumEven=sumEven+Character.getNumericValue(input.charAt(i));
        }
        sub = sumOdd*3+sumEven;
        char lastNum = Integer.toString(sub).charAt(Integer.toString(sub).length()-1);
        if(Character.getNumericValue(lastNum)!=0){
            finalRes = 10 - Character.getNumericValue(lastNum);
        }else{
            finalRes=0;
        }

        return finalRes;
    }
}
