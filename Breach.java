public class Breach extends ValorantCharacter implements SpecialAbilityE,ISpecialAbilityC,IUltimate,IGetCharacterInfo{
    public Breach(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("Aftershock – Fire a three-pulse burst charge through a wall." +
                " Each burst deals 60 damage.");

    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Flashpoint – Equip a blinding charge. Fire the charge to set a fast-acting burst through a wall. " +
                "The charge detonates to blind all players looking at it." +
                " Players looking directly at the flash are fully blinded for two seconds.");


    }

    @Override
    public void useUltimate() {
        System.out.println("Ultimate: Rolling Thunder – Equip a seismic charge." +
                " Fire to send a cascading quake through all terrain in a large cone." +
                " The quake dazes and knocks up anyone caught in it. Players caught are dazed for six seconds.");


    }

    @Override
    public void getCharacterInfo() {

    }
}
