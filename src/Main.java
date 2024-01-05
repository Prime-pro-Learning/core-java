import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    double getValue(){
        return 123.45;
    }
    boolean test(int n){
        return n%2==0;
    }

    int func(int n, int d){
        int result=1;
        for(int i=1; i<=n;i++)
            result=i*result;
        return result;
    }
    String func(String n){
        String result="";
        int i;
        for(i=n.length()-1;i>=0;i--)
            result=result+n.charAt(i);
        return result;
    }

    public static void main(String[] args) {
       /*MyNumber num;
       num=()-> 123.45;
        System.out.println(num.getValue());
        *//*Value value=new Value();
        System.out.println(value.getValue());*//*
        num=()->Math.random()*100;
        System.out.println(num.getValue());*/
        //num=()->"123.45";
       /* NumericTest numericTest;
        numericTest =(n)->(n%2==0);
        if(numericTest.test(10)) System.out.println(" 10 is even");
        if(numericTest.test(13)) {
            System.out.println("13 is even number");
            System.out.println("13 is even number");
        }*/
        /*NumericTest numericTest;
        numericTest =(int n)->n>=0;
        System.out.println(!numericTest.test(45));*/
        /*NumericTest2 numericTest2;
        numericTest2=(n,d)->n%d==0;
        System.out.println(numericTest2.test(10,3));*/
        /*NumericFunc numericFunc;
        numericFunc=(n)->{
            int result=1;
            for(int i=1; i<=n;i++)
                result=i*result;
            return result;
        };
        System.out.println(numericFunc.func((5)));*/
        /*StringFunc reverse=(n)->{
            String result="";
            int i;
            for(i=n.length()-1;i>=0;i--)
                result=result+n.charAt(i);
            return result;
        };
        System.out.println(reverse.func("Lambda"));
        //int arr[]=new int[6];
        //arr[0]='a';*/
        /*Main main=new Main();
        System.out.println(main.func("Ramesh"));*/
        List<Integer> list = Arrays.asList(10, 45, 63, 25, 78, 12);
        String s = list.stream().map((n) -> n.toString()).findFirst().get();
        list.stream().filter((n)->n%2==0).forEach((v)-> System.out.println(v));
        for(Integer value:list){
            if(value%2==0) System.out.println(value);
            else System.out.println(value + "it is not a even number" );
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0) System.out.println(list.get(i));
        }
    }
}