package Attacks;
import ru.ifmo.se.pokemon.*;
public final class PsychicAttack extends SpecialMove{
    public PsychicAttack() {
        super(Type.PSYCHIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect effect = new Effect();
        effect.chance(0.1);
        if (effect.success()) {
            opp.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "использует экстросенсорные способности";
    }
}
