package Pokes;
import ru.ifmo.se.pokemon.*;
public final class Cinccino extends Minccino{
    public Cinccino(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(75, 95, 60, 65, 60, 115);
        setMove(new Attacks.Thunderbolt(),
                new Attacks.WorkUp(),
                new Attacks.ConfideAttack(),
                new Attacks.FocusBlast());
    }
}
