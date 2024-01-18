
import java.util.Random;

public class ValorantCharacter  {
    private String name;
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
        int damageDealt = random.nextInt(51);
        return damageDealt;
    }

    // Method to simulate taking damage




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