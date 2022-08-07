/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */




/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods
 * given.
 *
 * @author Huixia Li
 */
public class BlackjackGame {


    private Player player;// the player of the game
    private Dealer dealer;

    public BlackjackGame(Player player,Dealer dealer) {
        this.player=player;
        this.dealer=dealer;
    }

    /**
     * @return the name
     */


    /**
     * @return the players of this game
     */
    public Player getPlayers() {
        return player;
    }

    /**
     * @param players the players of this game
     */
    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
   /**
     * @return the players of this game
     */
    public Dealer getDealer() {
        return dealer;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(Player player) {
        this.player = player;
    }

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public void play() {

    };


    
    public void exit() {
        
    };


    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public void declareWinner() {

    };

    

}// end class
