import ru.ifmo.se.pokemon.*;
import Pokes.*;
public class Lab2 {
    public static void main(String arg [] ){
        Battle b = new Battle();
        Pokemon[] allies = { new Carbink("Bloom", 19), new Charjabug("Stella", 20), new Cinccino("Flora", 15) };
        Pokemon[] foes = { new Grubbin("Icy", 17), new Minccino("Darcy", 19), new Vikavolt("Stromy", 20) };
        for (Pokemon p : allies)
            b.addAlly(p);
        for (Pokemon f : foes)
            b.addFoe(f);
        b.go();
    }
}
