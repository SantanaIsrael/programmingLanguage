public class Cat {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private boolean validAge(int age) {
        if (age > 0) {
            return true;
        } else
            return false;
    }

    public void setAge(int age) {
        if(validAge(age)){
            this.age = age;
        }else
        System.out.println("Age Invalid.");
    }

    public void setName (String name){
        this.name = name;
    }

    void info() {
        System.out.println("Hello, my name is " + name + " I am " + age + " years old.");
    }

    void sound() {
        System.out.println("Meow!!!");
    }
}