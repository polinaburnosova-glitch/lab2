package Pokes;
import ru.ifmo.se.pokemon.*;
public class Minccino extends Pokemon{
    public Minccino (String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(55, 50, 40, 40, 40, 75);
        setMove(new Attacks.Thunderbolt(),
                new Attacks.WorkUp(),
                new Attacks.ConfideAttack());
    }
}

