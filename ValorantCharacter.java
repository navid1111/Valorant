
import java.util.Random;

public abstract class ValorantCharacter  {

    private String name;
    IShoot weapon;
    Random random = new Random();

    private int health;
    private int armor;
    private int bulletsInMagazine;


    // Constructor
    public ValorantCharacter(String name) {
        this.name = name;

        this.health = 100;
        this.armor = 0;
        this.bulletsInMagazine = 25;
        this.weapon=new ClassicSideArm("classic");

    }

    // Getter methods
    public String getName() {
        return name;
    }



    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getBulletsInMagazine() {
        return bulletsInMagazine;
    }
    public boolean isAlive() {
        return health > 0;
    }



    // Method to simulate shooting
    public int shoot() {
        System.out.println();
      return weapon.shoot();
    }

    // Method to simulate taking damage
    public abstract void getCharacterInfo();
    public abstract void useSpecialAbilityC();
    public abstract void useSpecialAbilityE();
    public abstract  void useUltimate();




    public void buyArmor(int amount) {
        if (isAlive()) {
            armor += amount;
            System.out.println(name + " bought armor for " + amount + ". Current Armor: " + armor);
        } else {
            System.out.println(name + " can't buy armor. They are eliminated!");
        }
    }
    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }
    // Method to reload the weapon
    public void reload() {
        if (isAlive()) {
            bulletsInMagazine = 25; // Assuming a standard magazine size
            System.out.println(name + " reloaded. Bullets in Magazine: " + bulletsInMagazine);
        } else {
            System.out.println(name + " can't reload. They are eliminated!");
        }
    }


}