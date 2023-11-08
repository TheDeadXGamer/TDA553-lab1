import java.awt.Color;

import org.junit.*;

public class CarsTest {

    @Test
    public void TestNrDoors() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();

        Assert.assertTrue((saab.getNrDoors() == 2) && (volvo.getNrDoors() == 4));
    }

    @Test
    public void TestEnginePower() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();

        Assert.assertTrue((saab.getEnginePower() == 125) && (volvo.getEnginePower() == 100));
    }

    @Test
    public void TestCurrentSpeed() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();

        Assert.assertTrue((saab.getCurrentSpeed() == 0) && (volvo.getCurrentSpeed() == 0));
    }

    @Test
    public void TestColor() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();

        Assert.assertTrue((saab.getColor() == Color.red) && (volvo.getColor() == Color.black));
    }

    @Test
    public void TestSetColor() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        volvo.setColor(Color.blue);
        saab.setColor(Color.blue);

        Assert.assertTrue((saab.getColor() == Color.blue) && (volvo.getColor() == Color.blue));
    }
    
    @Test
    public void TestStartEngine() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        saab.startEngine();

        Assert.assertTrue((saab.getCurrentSpeed() == 0.1f) && (volvo.getCurrentSpeed() == 0.1f));
    }
    
    @Test
    public void TestStopEngine() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        volvo.stopEngine();
        saab.stopEngine();

        Assert.assertTrue((saab.getCurrentSpeed() == 0f) && (volvo.getCurrentSpeed() == 0f));
    }

    @Test
    public void TestSpeedFactor() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        float saabSpeedFactor = saab.getEnginePower() * 0.01f * saab.turbo;
        float volvoSpeedFactor = volvo.getEnginePower() * 0.01f * volvo.trimFactor;

        Assert.assertTrue((saab.getSpeedFactor() == saabSpeedFactor) && (volvo.getSpeedFactor()) == volvoSpeedFactor);
    }

    @Test
    public void TestGasAndSaabTurbo() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        saab.startEngine();
        saab.setTurboOn();
        volvo.gas(2);
        saab.gas(2);
        
        

        Assert.assertTrue((saab.getCurrentSpeed() == 3.35f) && (volvo.getCurrentSpeed() == 2.6f));
    }

    public void TestBrake() {
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();
        volvo.setCurrentSpeed(15f);
        saab.setCurrentSpeed(15f);
        volvo.brake(2);
        saab.brake(2);
        
        

        Assert.assertTrue((saab.getCurrentSpeed() == 12.5f) && (volvo.getCurrentSpeed() == 12.5f));
    }
}
