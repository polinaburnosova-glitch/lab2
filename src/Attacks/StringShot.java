package Attacks;
import ru.ifmo.se.pokemon.*;
public final class StringShot extends StatusMove{
    public StringShot() {
        super(Type.BUG, 0, 95);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        opp.setMod(Stat.SPEED, -2);

    }
    @Override
    protected String describe(){
        return "использует выстрел";
    }
}
