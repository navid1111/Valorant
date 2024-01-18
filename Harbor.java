public class Harbor extends ValorantCharacter implements SpecialAbilityE,ISpecialAbilityC,IUltimate,IGetCharacterInfo{
    public Harbor(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("High Tide – Equip a wall of water. Fire to send the water forward along the ground." +
                " Hold Fire to guide the water in the direction of your crosshair, passing through the world, spawning a wall along the water’s path." +
                " Alt-Fire while bending to stop the water early. Players hit are slowed.");


    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Cove – Equip a sphere of shielding water. " +
                "Fire to throw. Alt Fire to underhand throw. Upon impacting the ground, spawn a water shield that blocks bullets.");

    }

    @Override
    public void useUltimate() {
        System.out.println("Ultimate: Reckoning – Equip the full power of your Artifact. Fire to summon a geyser pool on the ground. Enemy players in the area are targeted by successive geyser strikes. " +
                "Players caught within a strike are Concussed.");

    }

    @Override
    public void getCharacterInfo() {
        System.out.println("E : High Tide – Equip a wall of water. Fire to send the water forward along the ground." +
                " Hold Fire to guide the water in the direction of your crosshair, passing through the world, spawning a wall along the water’s path." +
                " Alt-Fire while bending to stop the water early. Players hit are slowed.");
        System.out.println(" C: Cove – Equip a sphere of shielding water. " +
                "Fire to throw. Alt Fire to underhand throw. Upon impacting the ground, spawn a water shield that blocks bullets.");
        System.out.println("X:  Ultimate: Reckoning – Equip the full power of your Artifact. Fire to summon a geyser pool on the ground. Enemy players in the area are targeted by successive geyser strikes. " +
                "Players caught within a strike are Concussed.");






    }
}
