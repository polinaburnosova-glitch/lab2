package Attacks;
import ru.ifmo.se.pokemon.*;
public final class ConfideAttack extends StatusMove{
    public ConfideAttack() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon opp){
        opp.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "проявляет доверие";
    }
}
