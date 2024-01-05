public class LogicalPrograms {
    public static void main(String[] args) {
        //== equals()
        int a=10;
        int b=20;
        if(a==b){

        }
        Person person1=new Person(123,"Ramesh");
        Person person2=new Person(123,"Ramesh");
        if(person1==person2) System.out.println("both objects are equals");
        if(person1.equals(person2)) System.out.println("equals method");
    }
}
