package com.corejava;

public class Person {
    private  String username;
    private String password;

    private String firstName;

    public Person(String username, String password, String firstName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
    }
    Person(MB member){}


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Member m=new Member();
        Box b=new Box();
        CB cb=new CB();
        Person p=new Person(m);
        Person p2=new Person(b);
        Person p3=new Person(cb);
    }
}
