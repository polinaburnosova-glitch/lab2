package Pokes;
import ru.ifmo.se.pokemon.*;
public final class Vikavolt extends Charjabug{
    public Vikavolt(String name, int level){
        super(name, level);
        setType(Type.BUG);
        setStats(77, 70, 90, 145, 75, 43);
        setMove(new Attacks.StringShot(),
                new Attacks.Bite(),
                new Attacks.Crunch(),
                new Attacks.EnergyBall());
    }
}
