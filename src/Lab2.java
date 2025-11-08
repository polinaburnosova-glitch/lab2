import ru.ifmo.se.pokemon.*;
import Pokes.*;
public class Lab2 {
    public static void main(String arg [] ){
        Battle b = new Battle();
        Pokemon[] allies = { new Carbink("Блум", 19), new Charjabug("Стелла", 20), new Cinccino("Флора", 15) };
        Pokemon[] foes = { new Grubbin("Айси", 17), new Minccino("Дарси", 19), new Vikavolt("Трикси", 20) };
        for (Pokemon p : allies)
            b.addAlly(p);
        for (Pokemon f : foes)
            b.addFoe(f);
        b.go();
    }
}
