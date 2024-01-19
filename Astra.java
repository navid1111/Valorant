public class Astra extends ValorantCharacter {
    public Astra(String name) {
        super(name);
    }

    @Override
    public void useSpecialAbilityE() {

        System.out.println("Gravity Well – Activate a Star to form a Gravity Well. " +
                "Players in the area are pulled toward the center before it explodes," +
                " making all players still trapped inside fragile Vulnerable for 2.75 secvonds.");


    }

    @Override
    public void  useSpecialAbilityC() {
        System.out.println("Nova Pulse – Activate a Star to detonate a Nova Pulse." +
                " The Nova Pulse charges briefly then strikes, concussing all players in its area for 1.25 seconds");

    }

    @Override
    public  void useUltimate() {
        System.out.println("Ultimate: Astral Form / Cosmic Divide – " +
                "Activate to enter Astral Form where you can place Stars with primary fire. Stars can be reactivated later, transforming them into a Nova Pulse, Nebula, or Gravity Well. When Cosmic Divide is charged, use secondary fire in Astral Form to begin aiming it, then primary fire to select two locations. An infinite Cosmic Divide connects the two points you select." +
                " Cosmic Divide blocks bullets and heavily dampens audio.");


    }

    @Override
    public void getCharacterInfo() {
        System.out.println("Ultimate: Astral Form / Cosmic Divide – " +
                "Activate to enter Astral Form where you can place Stars with primary fire. Stars can be reactivated later, transforming them into a Nova Pulse, Nebula, or Gravity Well. When Cosmic Divide is charged, use secondary fire in Astral Form to begin aiming it, then primary fire to select two locations. An infinite Cosmic Divide connects the two points you select." +
                " Cosmic Divide blocks bullets and heavily dampens audio.");

        System.out.println("SpecialAbilityC : Nova Pulse – Activate a Star to detonate a Nova Pulse." +
                " The Nova Pulse charges briefly then strikes, concussing all players in its area for 1.25 seconds");

        System.out.println("SpecialAbilityE : Gravity Well – Activate a Star to form a Gravity Well. " +
                "Players in the area are pulled toward the center before it explodes," +
                " making all players still trapped inside fragile Vulnerable for 2.75 secvonds.");


    }


}
