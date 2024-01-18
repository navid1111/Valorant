public class Deadlock extends ValorantCharacter implements SpecialAbilityE,ISpecialAbilityC,IUltimate,IGetCharacterInfo{
    public Deadlock(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("GravNet – Throw or lob a grenade that detonates on landing, forcing enemies caught in it to crouch and move slowly. " +
                "Enemy players can remove the net.");


    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Sonic Sensor – Deploys a sensor on a wall that monitors for enemy sounds." +
                " Activates if it detects footsteps, weapon fire, or significant noise, concussing everyone in the blast radius.");


    }

    @Override
    public void useUltimate() {
        System.out.println("Ultimate: Annihilation – Fires a pulse of nanowires that captures the first enemy contacted and cocoons them. " +
                "Cocooned enemy is pulled towards the end of the path and dies if they reach the end. " +
                "Enemy players can shoot the cocoon to free their teammate.");


    }

    @Override
    public void getCharacterInfo() {

    }
}
