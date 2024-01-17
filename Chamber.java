public class Chamber extends ValorantCharacter implements SpecialAbilityE,ISpecialAbilityC,IUltimate,IGetCharacterInfo{
    public Chamber(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("Trademark – Place a trap that scans for enemies." +
                " When a visible enemy comes in range, the trap counts down and then destabilizes the terrain around them," +
                " creating a lingering field that slows players caught inside of it.");

    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Headhunter – Activate to equip a heavy pistol." +
                " Alt fire with the pistol equipped to aim down sights. Holds eight bullets at max.");

    }

    @Override
    public void useUltimate() {
        System.out.println("Ultimate – Tour de Force – Activate to summon a powerful," +
                " custom sniper rifle that will kill an enemy with any direct hit to the upper body." +
                " Killing an enemy creates a lingering field that slows players caught inside of it.");

    }

    @Override
    public void getCharacterInfo() {


    }
}
