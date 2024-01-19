import java.util.Random;

public class VandalRiffle extends Firearm implements IShoot,ISnipe{
    public VandalRiffle(String name) {
        super(name);
    }
    Random random = new Random();

    @Override
    public void snipe() {

    }

    @Override
    public int shoot() {
        int damageDealt = random.nextInt(60);
        return damageDealt;



    }
}
