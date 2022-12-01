public class TimeClient{
    public static void main(String[] args) {
        //Construtor sem os acrescimos
        
        //Time tempo = new Time(19);
        //Time tempo = new Time(19,39);
        
        Time tempo = new Time(19,39,35);
        System.out.println(tempo);
        
        //Hora com os acrescimos
        tempo.addTime(12,20, 10);
        System.out.println(tempo);
        
        tempo.addTime(20, 10);
        System.out.println(tempo);
        
        tempo.addTime(10);
        System.out.println(tempo);
    }
}