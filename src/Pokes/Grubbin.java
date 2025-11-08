package Pokes;
import ru.ifmo.se.pokemon.*;
public class Grubbin extends Pokemon{
    public Grubbin(String name, int level){
        super(name, level);
        setType(Type.BUG);
        setStats(47, 62, 45, 55, 45, 46);
        setMove(new Attacks.StringShot(),
                new Attacks.Bite());
    }
}
