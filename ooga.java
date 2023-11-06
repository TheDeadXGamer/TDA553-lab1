public class ooga{
    public static void main(String[] args){
        Volvo240 e = new Volvo240();
        e.startEngine();
        e.gas(2);
        System.out.println(e.nrDoors);
        System.out.println(e.getNrDoors());
        e.nrDoors = 0;
    }
}