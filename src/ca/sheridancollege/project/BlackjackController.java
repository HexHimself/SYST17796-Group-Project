import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        System.out.println("Please Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player player = new Player(name);
        Dealer dealer = new Dealer();
        BlackjackGame newGame = new BlackjackGame(player, dealer);
        newGame.play();
        player.hand.drawCards(2);
        dealer.hand.drawCards(2);
        player.hand.showHandCards();
        dealer.hand.showIndexCards(2);
        int drawCardOrder = 2;
        while (drawACardOrNot() == true) {
            player.hand.drawCards(1);
            dealer.hand.drawCards(1);
            drawCardOrder++;
            player.hand.showHandCards();
            dealer.hand.showIndexCards(drawCardOrder);
            if (player.hand.exceeded21()) {
                newGame.declareWinner(dealer);
                return;
            }
        }
        if (dealer.isOverSixteen()==false) {
            dealer.hand.drawCards(1);
            drawCardOrder++;
            dealer.hand.showIndexCards(drawCardOrder);
        }
        if (dealer.hand.exceeded21()) {
            newGame.declareWinner(player);
        } else {
            compareValue(player, dealer, newGame);
        }
    }

    public static boolean drawACardOrNot() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to draw one more card?(Y/N)");
            String drawcard = sc.next();
            if (drawcard.equalsIgnoreCase("Y")) {
                return true;
            } else if (drawcard.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("Please enter valid answer!");
            }
        }
    }

    private static void compareValue(Player player, Dealer dealer, BlackjackGame newGame) {
        if (player.hand.getValue() > dealer.hand.getValue()) {
            newGame.declareWinner(player);
        } else if (player.hand.getValue() == dealer.hand.getValue()) {
            newGame.declareWinner(null);
        } else {
            newGame.declareWinner(dealer);
        }
    }

}
