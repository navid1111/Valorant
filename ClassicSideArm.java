import java.util.Random;

public class ClassicSideArm extends Firearm implements IShoot{
    Random random = new Random();

    public ClassicSideArm(String name) {
        super(name);
    }

    @Override
    public int shoot() {

        int damageDealt = random.nextInt(20);
        return damageDealt;

    }
}
