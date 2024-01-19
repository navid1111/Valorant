import java.util.Random;

public class BuckyShotGun extends Firearm implements IShoot,ISnipe{
    public BuckyShotGun(String name) {
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
