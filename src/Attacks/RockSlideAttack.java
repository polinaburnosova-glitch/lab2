package Attacks;
import ru.ifmo.se.pokemon.*;
public final class RockSlideAttack extends PhysicalMove{
    public RockSlideAttack() {
        super(Type.ROCK, 75, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect effect = new Effect();
        effect.chance(0.3);
        if (effect.success()) {
            Effect.flinch(opp);
        }
    }
    @Override
    protected String describe(){
        return "использует камнепад";
    }
}
