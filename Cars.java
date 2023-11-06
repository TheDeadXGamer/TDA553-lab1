import java.awt.*;
import java.util.Map;
import java.util.HashMap;

public class Cars implements Movable{

    int nrDoors; // Number of doors on the car
    int enginePower; // Engine power of the car
    double currentSpeed; // The current speed of the car
    Color color; // Color of the car
    String modelName; // The car model name
    Map<String,Integer> dirMap = new HashMap<String,Integer>(){{
        put("EAST", 1);
        put("SOUTH", 2);
        put("WEST", 3);
        put("NORTH", 4);
    }};
    String facingDirection;

    Cars(){
        facingDirection = "EAST";
        stopEngine();
        
    }
    
    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    
    public double speedFactor(){
        return enginePower * 0.01;
    }

    private void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    public void turnLeft(){

    }

    public void turnRight(){

    }

    public void move(){

    }
}