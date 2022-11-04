public class catExemple {
    public static void main(String[] args) {
        Cat catOne = new Cat();
        System.out.println(catOne.getAge());
        catOne.setAge(4);
        catOne.setName("Balao Suspeito");
        catOne.info();
        
        Cat catTwo = new Cat();
        catTwo.setAge(3);
        catTwo.setName("Paulo Latejando");
        catTwo.info();
        catTwo.sound();
    }
    
}