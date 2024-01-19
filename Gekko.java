public class Gekko extends ValorantCharacter implements IGetCharacterInfo{
    public Gekko(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("Wingman – Gekko equips Wingman and fires it seeking enemies." +
                " Wingman unleashes a concussive blast toward the first enemy he sees. Gekko can use alternate fire to send Wingman out to either defuse the Spike or plant the Spike. Gekko must have the Spike in his inventory to use Wingman as the planter. " +
                "Gekko can retrieve Wingman after a short cooldown.");


    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Most Pit – Gekko equips Mosh Pit and can throw the projectile underhand with alternate fire or throw normally using regular fire." +
                " Mosh expands upon landing and explodes after a short delay across a wide area, most similar to a KAY/O grenade.");

    }

    @Override
    public void useUltimate() {
        System.out.println("Ultimate: Thrash – Gekko equips Thrash and steers her toward the enemies. Activate to lunge and explode, " +
                "which detains enemies. " +
                "After Thrash expires she can be picked up to gain another charge after a short cooldown to be used once more.");


    }

    @Override
    public void getCharacterInfo() {
        System.out.println("Ultimate: Thrash – Gekko equips Thrash and steers her toward the enemies. Activate to lunge and explode, " +
                "which detains enemies. " +
                "After Thrash expires she can be picked up to gain another charge after a short cooldown to be used once more.");
        System.out.println("Most Pit – Gekko equips Mosh Pit and can throw the projectile underhand with alternate fire or throw normally using regular fire." +
                " Mosh expands upon landing and explodes after a short delay across a wide area, most similar to a KAY/O grenade.");

        System.out.println("Wingman – Gekko equips Wingman and fires it seeking enemies." +
                " Wingman unleashes a concussive blast toward the first enemy he sees. Gekko can use alternate fire to send Wingman out to either defuse the Spike or plant the Spike. Gekko must have the Spike in his inventory to use Wingman as the planter. " +
                "Gekko can retrieve Wingman after a short cooldown.");


    }
}
