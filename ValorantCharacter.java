
import java.util.Random;

public class ValorantCharacter {
    private String name;

    private int health;
    private int armor;
    private int bulletsInMagazine;
    private boolean isAlive;

    // Constructor
    public ValorantCharacter(String name) {
        this.name = name;

        this.health = 100;
        this.armor = 0;
        this.bulletsInMagazine = 25;
        this.isAlive = true;
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
        return isAlive;
    }

    // Method to simulate shooting
    public void shoot() {
        if (bulletsInMagazine > 0) {
            System.out.println(name + " is shooting!");
            bulletsInMagazine--;
        } else {
            System.out.println(name + " is out of bullets!");
        }
    }

    // Method to simulate taking damage
    public void takeDamage(int damage) {
        if (armor > 0) {
            armor -= damage;
            if (armor < 0) {
                health += armor;  // Excess damage reduces health
                armor = 0;
            }
        } else {
            health -= damage;
        }

        if (health <= 0) {
            isAlive = false;
            System.out.println(name + " has been eliminated!");
        } else {
            System.out.println(name + " took " + damage + " damage. Health: " + health + ", Armor: " + armor);
        }
    }


    public void buyArmor(int amount) {
        if (isAlive) {
            armor += amount;
            System.out.println(name + " bought armor for " + amount + ". Current Armor: " + armor);
        } else {
            System.out.println(name + " can't buy armor. They are eliminated!");
        }
    }

    // Method to reload the weapon
    public void reload() {
        if (isAlive) {
            bulletsInMagazine = 25; // Assuming a standard magazine size
            System.out.println(name + " reloaded. Bullets in Magazine: " + bulletsInMagazine);
        } else {
            System.out.println(name + " can't reload. They are eliminated!");
        }
    }

}