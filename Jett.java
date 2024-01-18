public class Jett extends ValorantCharacter implements SpecialAbilityE,ISpecialAbilityC,IUltimate,IGetCharacterInfo{
    public Jett(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("Cloudburst – Throw out a cloud of fog that obscures vision on impact." +
                " Hold down the ability button to bend the cloud’s in-flight trajectory.");


    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Updraft – After a brief wind-up, propel yourself upward.");

    }

    @Override
    public void useUltimate() {
        System.out.println("Ultimate: Blade Storm – Arm yourself with several deadly throwing knives that deal moderate damage and kill on headshots. " +
                "Scoring a kill restores all daggers. Left-click throws a single dagger. Right-click throws all remaining daggers in a short-ranged burst, but right-click kills do not restore daggers.");


    }

    @Override
    public void getCharacterInfo() {

    }
}
