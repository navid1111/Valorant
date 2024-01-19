import java.util.Random;
import java.util.Scanner;

class DeathMatch {
    private static final int MIN_DAMAGE = 0;
    private static final int MAX_DAMAGE = 60;

    private static int getRandomDamage() {
        return new Random().nextInt(MAX_DAMAGE - MIN_DAMAGE + 1) + MIN_DAMAGE;
    }

    public static void printAvailableCharacters() {
        System.out.println("Available Valorant Characters:");
        System.out.println("1. Astra");
        System.out.println("2. Brimstone");
        System.out.println("3. Cypher");
        System.out.println("4. Jett");
        System.out.println("5. Omen");
        System.out.println("6. Chamber");
        System.out.println("7. Deadlock");
        System.out.println("8. Fade");
        System.out.println("9. Gekko");
        System.out.println("10. Harbor");
    }
    public  static void showAvailableWeapon(){
        System.out.println("Available weapon:");
        System.out.println("1.vandal");
        System.out.println("2.bucky");
        System.out.println("3.skip");

    }

    public static void printCharacterOptions() {
        System.out.println("Character Options:");
        System.out.println("S. Shoot");
        System.out.println("E. Special Ability");
        System.out.println("X. Ultimate");
        System.out.println("C. Special Ability");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Valorant Death Match!");
        System.out.print("Player 1, enter your name: ");
        String name1 = scanner.next();
        printAvailableCharacters();
        System.out.print("Player 1, choose your character: ");
        String character1 = scanner.next();

        ValorantCharacter playerOne;
        switch (character1.toLowerCase()) {
            case "astra":
                playerOne = new Astra(name1);
                break;
            case "brimstone":
                playerOne = new Brimstone(name1);
                break;
            case "cypher":
                playerOne = new Cypher(name1);
                break;
            case "jett":
                playerOne = new Jett(name1);
                break;
            case "omen":
                playerOne = new Omen(name1);
                break;
            case "chamber":
                playerOne = new Chamber(name1);
                break;
            case "deadlock":
                playerOne = new Deadlock(name1);
                break;
            case "fade":
                playerOne = new Fade(name1);
                break;
            case "gekko":
                playerOne = new Gekko(name1);
                break;
            case "harbor":
                playerOne = new Harbor(name1);
                break;
            default:
                throw new IllegalStateException("Invalid character choice: " + character1);
        }


        System.out.println("Player 1,Buy Weapon your weapon");
        showAvailableWeapon();
        String gun= scanner.next();
        switch (gun){
            case "vandal":
                playerOne.weapon=new VandalRiffle(gun);
                break;
            case "bucky":
                playerOne.weapon=new BuckyShotGun(gun);
                break;
            case "skip":
                System.out.println("you have classic side arm to shoot");


        }



        System.out.print("\nPlayer 2, enter your name: ");
        String name2 = scanner.next();
        printAvailableCharacters();
        System.out.print("Player 2, choose your character: ");
        String character2 = scanner.next();

        ValorantCharacter playerTwo;
        switch (character2.toLowerCase()) {
            case "astra":
                playerTwo = new Astra(name2);
                break;
            case "brimstone":
                playerTwo = new Brimstone(name2);
                break;
            case "cypher":
                playerTwo = new Cypher(name2);
                break;
            case "jett":
                playerTwo = new Jett(name2);
                break;
            case "omen":
                playerTwo = new Omen(name2);
                break;
            case "chamber":
                playerTwo = new Chamber(name2);
                break;
            case "deadlock":
                playerTwo = new Deadlock(name2);
                break;
            case "fade":
                playerTwo = new Fade(name2);
                break;
            case "gekko":
                playerTwo = new Gekko(name2);
                break;
            case "harbor":
                playerTwo = new Harbor(name2);
                break;
            default:
                throw new IllegalStateException("Invalid character choice: " + character2);
        }
        System.out.println("Player 2,Buy Weapon your weapon");
        showAvailableWeapon();
        String gun1= scanner.next();
        switch (gun1){
            case "vandal":
                playerTwo.weapon=new VandalRiffle(gun1);
                break;
            case "bucky":
                playerTwo.weapon=new BuckyShotGun(gun1);
                break;
            case "skip":
                System.out.println("you have classic side arm to shoot");


        }


        ValorantCharacter currentPlayer = playerOne;

        while (playerOne.isAlive() && playerTwo.isAlive()) {
            // Display player information
            System.out.println("\n" + playerOne.getName() + "'s Health: " + playerOne.getHealth());
            System.out.println(playerTwo.getName() + "'s Health: " + playerTwo.getHealth());

            // Player's turn
            System.out.println("\n" + currentPlayer.getName() + "'s turn:");
            System.out.println("Options:");
            System.out.println("S. Shoot | E. Special Ability | X. Ultimate | C. Special Ability | I. Character Info");
            System.out.print("Choose your move: ");
            String move = scanner.next();

            // Deal random damage based on the chosen move
            int damage = getRandomDamage();

            switch (move.toUpperCase()) {
                case "S":
                    damage= currentPlayer.weapon.shoot();
                    System.out.println("Hit! " + currentPlayer.getName() + " dealt " + damage + " damage!");

                    break;
                case "C":
                    currentPlayer.useSpecialAbilityC();
                    System.out.println(currentPlayer.getName() + " used a special ability!");
                    break;
                case "X":
                    currentPlayer.useUltimate();
                    System.out.println(currentPlayer.getName() + " used the ultimate ability!");
                    break;
                case "E":
                    currentPlayer.useSpecialAbilityE();
                    System.out.println(currentPlayer.getName() + " used a special ability!");
                    break;
                case "I":
                    currentPlayer.getCharacterInfo();
                    continue;
                default:
                    System.out.println("Invalid move. Try again.");
                    continue;
            }

            ValorantCharacter opponent = (currentPlayer == playerOne) ? playerTwo : playerOne;
            opponent.takeDamage(damage);

            currentPlayer = (currentPlayer == playerTwo) ? playerOne : playerTwo;
        }

        ValorantCharacter winner = (playerOne.isAlive()) ? playerOne : playerTwo;
        System.out.println("\n" + winner.getName() + " wins the game!");
    }
}
