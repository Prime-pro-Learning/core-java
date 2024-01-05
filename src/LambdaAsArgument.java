import java.util.List;

public class LambdaAsArgument {
    public static String stringOP(StringFunc stringFunc, String s){
       return  stringFunc.func(s);
    }

    String func(String n){

        String result="";
        int i;
        for(i=n.length()-1;i>=0;i--)
            result=result+n.charAt(i);
        return result;
    }
    public static void main(String[] args) {

        /*String input="Lambda add power to java";
        LambdaAsArgument lambda=new LambdaAsArgument();
        String output=lambda.func(input);
        System.out.println(output);*/
        /*String input="Lambda add power to java";
        String output;
        output=stringOP((str)->{
            System.out.println(str);
            String result="";
            int i;
            for(i=str.length()-1;i>=0;i--)
                result=result+str.charAt(i);.fi
            return result;
        },input);
        System.out.println(output);*/

        List<Integer> integers = List.of(12);
        integers.stream().map(Integer::byteValue);
        integers.stream().map((n)->n.byteValue());
    }
}
