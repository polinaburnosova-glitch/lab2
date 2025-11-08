package Attacks;
import ru.ifmo.se.pokemon.*;
public final class Crunch extends PhysicalMove{
    public Crunch() {
        super(Type.DARK, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect effect = new Effect();
        effect.chance(20);
        if (effect.success()){
            opp.setMod(Stat.DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "использует хруст";
    }
}
