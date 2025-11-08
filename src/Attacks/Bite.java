package Attacks;
import ru.ifmo.se.pokemon.*;
public final class Bite extends PhysicalMove{
    public Bite() {
        super(Type.DARK, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect effect = new Effect();
        effect.chance(30);
        if (effect.success()){
            Effect.flinch(opp);
        }
    }
    @Override
    protected String describe(){
        return "кусает цель";
    }
}
