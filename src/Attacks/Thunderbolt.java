package Attacks;
import ru.ifmo.se.pokemon.*;
public final class Thunderbolt extends SpecialMove{
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect effect  = new Effect();
        effect.chance(10);
        if (effect.success()){
            Effect.paralyze(opp);
        }
    }
    @Override
    protected String describe(){
        return "использует громовую стрелу";
    }
}
