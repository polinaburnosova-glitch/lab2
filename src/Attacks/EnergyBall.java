package Attacks;
import ru.ifmo.se.pokemon.*;
public final class EnergyBall extends SpecialMove{
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect effect = new Effect();
        effect.chance(10);
        if (effect.success()){
            opp.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "использует энергетические шары";
    }
}
