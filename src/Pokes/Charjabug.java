package Pokes;
import ru.ifmo.se.pokemon.*;
public class Charjabug extends Grubbin{
    public Charjabug(String name, int level){
        super(name, level);
        setType(Type.BUG);
        setStats(57, 82, 95, 55, 75, 36);
        addMove(new Attacks.Crunch());
    }
}
