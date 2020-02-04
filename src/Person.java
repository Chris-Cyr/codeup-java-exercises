public class Person {
    private String name;
    private int age;

    public static void main(String[] args) {
        Person chris = new Person("Chris");
        chris.age = 32;
        chris.sayHello();
        Person will = new Person("Will");
        will.sayHello();

    }

    public Person (String nameInput){
        this.name = nameInput;
    }
    public String getName (){
        return this.name;
    }

    public void setName(String inputName){
        this.name = inputName;
    }
    public void sayHello(){
        System.out.println("Hello, " + this.name + ". " + this.age + " is soooo old :(");
    }
}
