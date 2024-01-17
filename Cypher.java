public class Cypher extends ValorantCharacter implements SpecialAbilityE,ISpecialAbilityC,IUltimate,IGetCharacterInfo{
    public Cypher(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("Trapwire – Place a stealthed tripwire between two walls." +
                " Triggering enemies are restrained and revealed for a short time. If the trap isn’t destroyed, " +
                "it activates to daze the trapped victim. It can be picked up and redeployed.");

    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Cyber Cage – Toss out a remote activation trap. " +
                "Reactivate to create a cage that blocks vision and plays an audio cue when an enemy passes through." +
                ". Look at a trap and press “use” to detonate it.");

    }

    @Override
    public void useUltimate() {
        System.out.println("Ultimate: Neural Theft – Extract information from the corpse of an enemy, " +
                "revealing the location of their living allies.");

    }

    @Override
    public void getCharacterInfo() {

    }
}
