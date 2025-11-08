package Attacks;
import ru.ifmo.se.pokemon.*;
public final class WorkUp extends StatusMove{
    public WorkUp() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon self){
        self.setMod(Stat.SPECIAL_ATTACK, 1);
        self.setMod(Stat.ATTACK, 1);
    }
    @Override
    protected String describe(){
        return "тренируется";
    }
}
