import java.util.Random;

public class Brimstone extends ValorantCharacter {
    Random random = new Random();
    public Brimstone(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("Incendiary – Launch an incendiary grenade that deploys a damaging field of fire. " +
                "Fire lasts for seven seconds and deals 60 points of damage per second.");


    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Stim Beacon – Drop a Stim Beacon on the ground, granting a Combat Stim and speed boost to players nearby." +
                " Players get improved weapon equip speed, fire rate, reload speed, recovery speed, and movement speed.");


    }

    @Override
    public void useUltimate() {
        System.out.println("Ultimate: Orbital Strike – Use your map to target a location, " +
                "launching a devastating orbital strike that pulses for high damage over several seconds." +
                " Deals 20 damage per tick, with 6.67 ticks per second across a three second duration.");


    }

    @Override
    public void getCharacterInfo() {
        System.out.println("Ultimate: Orbital Strike – Use your map to target a location, " +
                "launching a devastating orbital strike that pulses for high damage over several seconds." +
                " Deals 20 damage per tick, with 6.67 ticks per second across a three second duration.");

        System.out.println("SpecialAbilityC :Stim Beacon – Drop a Stim Beacon on the ground, granting a Combat Stim and speed boost to players nearby." +
                " Players get improved weapon equip speed, fire rate, reload speed, recovery speed, and movement speed.");

        System.out.println("SpecialAbilityE : Incendiary – Launch an incendiary grenade that deploys a damaging field of fire. " +
                "Fire lasts for seven seconds and deals 60 points of damage per second.");


    }
}
