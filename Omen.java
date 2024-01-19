public class Omen extends ValorantCharacter implements IGetCharacterInfo{
    public Omen(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {
        System.out.println("Paranoia – Send out an Ethereal shadow in a straight line, Nearsighting anyone it touches");
        int randomNumberInclusive = random.nextInt(51);


    }

    @Override
    public void useSpecialAbilityC() {
        System.out.println("Shadow Walk – After a delay, dematerialize and teleport a short distance.");


    }

    @Override
    public void useUltimate() {
        System.out.println("Ultimate: From the Shadows – Select anywhere on the map to teleport and reform." +
                " When arriving, appear as a Shade, that will go back to your original location if killed. Once the teleport is complete," +
                " become Incorporeal for a short time.");


    }

    @Override
    public void getCharacterInfo() {
        System.out.println("Ultimate : From the Shadows – Select anywhere on the map to teleport and reform." +
                " When arriving, appear as a Shade, that will go back to your original location if killed. Once the teleport is complete," +
                " become Incorporeal for a short time.");
        System.out.println("SpecialAbilityC : Shadow Walk – After a delay, dematerialize and teleport a short distance.");

        System.out.println("SpecialAbilityE : Paranoia – Send out an Ethereal shadow in a straight line, Nearsighting anyone it touches");



    }
}
