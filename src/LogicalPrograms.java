public class LogicalPrograms {
    public static void main(String[] args) {
        //== equals()
        int a=10;
        int b=20;
        if(a==b){
            //Object
        }
        /*Person person1=new Person(123,"Ramesh");
        Person person2=new Person(123,"Ramesh");
        if(person1==person2) System.out.println("both objects are equals");
        if(person1.equals(person2)) System.out.println("equals method");
        if(person1.equals("Ramesh")) System.out.println("equals method");
        if(person1.equals(456.12)) System.out.println("equals method");
        if(person1.equals('A')) System.out.println("equals method");
        if(person1.equals(true)) System.out.println("equals method");
        if(person1.equals(456)) System.out.println("equals method");*/
        String s1="Test1";
        String s2= new String("Test1");
        boolean flag= s1.equals(s2);
        System.out.println(flag);
    }
}
