public class Deadlock extends ValorantCharacter implements IGetCharacterInfo{
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
        System.out.println("Ultimate : From the Shadows – Select anywhere on the map to teleport and reform." +
                " When arriving, appear as a Shade, that will go back to your original location if killed. Once the teleport is complete," +
                " become Incorporeal for a short time.");
        System.out.println("SpecialAbilityC : Sonic Sensor – Deploys a sensor on a wall that monitors for enemy sounds." +
                " Activates if it detects footsteps, weapon fire, or significant noise, concussing everyone in the blast radius.");
        System.out.println("SpecialAbilityE : GravNet – Throw or lob a grenade that detonates on landing, forcing enemies caught in it to crouch and move slowly. " +
                "Enemy players can remove the net.");




    }
}
