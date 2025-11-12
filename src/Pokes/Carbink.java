package Pokes;
import ru.ifmo.se.pokemon.*;
//import Attacks.*;
public final class Carbink extends Pokemon{
    public Carbink(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.FAIRY);
        setStats(50, 50, 150, 50, 150, 50);
        setMove(new Attacks.RockSlideAttack(),
                new Attacks.Swagger(),
                new Attacks.Tackle(),
                new Attacks.PsychicAttack());
    }
}
