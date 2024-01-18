import java.util.Random;
import java.util.Scanner;


class DeathMatch {
    private static final int MIN_DAMAGE = 0;
    private static final int MAX_DAMAGE = 20;

    private static int getRandomDamage() {
        return new Random().nextInt(MAX_DAMAGE - MIN_DAMAGE + 1) + MIN_DAMAGE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Fighting Game!");

    






        Astra playerOne=new Astra("navid");
        Breach playerTwo=new Breach("oni");
        ValorantCharacter currentPlayer=playerOne;

        // Player 1 starts

        while (playerOne.isAlive() && playerTwo.isAlive()) {
            // Display player information
            System.out.println("\n" + playerOne.getName() + " Health: " + playerOne.getHealth());
            System.out.println(playerTwo.getName() + " Health: " + playerTwo.getHealth());

            // Player's turn
            System.out.println("\n" +currentPlayer.getName() + "'s turn:");
            System.out.println("S. shoot\nE. Special abilty E\nX. Ultimate\nC. Special abilty C");
            System.out.print("Choose your move : ");
            String move = scanner.next();

            // Deal random damage based on the chosen move
            int damage = getRandomDamage();
            switch (move) {
                case "S":
                    if(currentPlayer==playerTwo) playerTwo.useSpecialAbilityE();
                    else playerOne.useSpecialAbilityE();

                    System.out.println(currentPlayer.getName() + " did " + damage + " damage!");
                    break;
                case "C":
                    if(currentPlayer==playerTwo) playerTwo.useSpecialAbilityC();
                    else playerOne.useSpecialAbilityC();
                    System.out.println(currentPlayer.getName() + " did " + damage + " damage!");
                    break;
                case "X":
                    if(currentPlayer==playerOne) playerOne.useUltimate();
                    else playerTwo.useUltimate();
                    System.out.println(currentPlayer.getName() + " did " + damage + " damage!");
                    break;
                case "E":
                    if(currentPlayer==playerOne) playerOne.useUltimate();
                    else playerTwo.useSpecialAbilityE();
                    System.out.println(currentPlayer.getName() + " did " + damage + " damage!");
                    break;
                default:
                    System.out.println("Invalid move. Try again.");
                    continue; // Skip the rest of the loop
            }

            // Inflict damage on the other player
            ValorantCharacter opponent = (currentPlayer == playerOne) ? playerTwo : playerOne;
            opponent.takeDamage(damage);

            // Switch players for the next turn
            currentPlayer = (currentPlayer == playerTwo) ? playerOne : playerTwo;
        }

        // Display the winner
        ValorantCharacter winner = (playerOne.isAlive()) ? playerOne: playerTwo;
        System.out.println("\n" + winner.getName() + " wins the game!");
    }
}
