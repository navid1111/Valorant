public class Fade extends ValorantCharacter implements SpecialAbilityE,ISpecialAbilityC,IUltimate,IGetCharacterInfo{
    public Fade(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("Seize – Throw a Seize orb which will plummet to the ground after a set amount of time." +
                " Upon hitting the ground, the orb will expand and tether opponents who are caught in it," +
                " while also deafening and decaying the,.");


    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Prowler – Equip a Prowler. Fire will send the Prowler out, causing it to travel in a straight line." +
                " The Prowler will lock onto any enemies or trails in their frontal vision cone and chase them, nearsighting them if it reaches them." +
                "Hold the fire button to steer the Prowler in the direction of your crosshair.");


    }

    @Override
    public void useUltimate() {
        System.out.println("Haunt – Equip a nightmarish entity." +
                " Fire to throw the orb which will plummet to the ground after a set amount of time. Upon hitting the ground, the orb will turn into a nightmarish entity that will reveal the location of enemies caught in its line of sight." +
                " Enemies can destroy this entity. Re-use the ability to drop the projectile early in-flight.");


    }

    @Override
    public void getCharacterInfo() {

    }
}
