import java.util.*;

public class BlueCard extends Card {
    String type = "Blue";
    String career;
    int amount;
    String description;

    public BlueCard(String career) {
        super(career);
    }

    public void blueCardCondition(Player player, Player[] otherplayers, String career) {

        if (isMatchWithCareer(player)) {

            player.addCash(15000);
        }

        else {

            player.removeCash(15000);
            if (findPlayerCareer(otherplayers, career) != null)
                findPlayerCareer(otherplayers, career).addCash(15000);
        }
    }

    public void action(Player player) {

    }

    public boolean isMatchWithCareer(Player player) {
        if (this.career == player.getCareer())
            return true;
        else
            return false;
    }

    /**
     * This method runs in a loop to find the targeted player career.
     * 
     * @param otherplayers player list
     * @param career
     * @return the player if same career is found, otherwise null.
     */

    public Player findPlayerCareer(Player[] otherplayers, String career) {
        for (int i = 0; i < otherplayers.length; i++) {
            if (career == otherplayers[i].getCareer())
                return otherplayers[i];
        }
        return null;
    }

    public void addMoney(Player player, int amount) {
        player.addCash(amount);
    }

    public void removeMoney(Player player, int amount) {
        player.removeCash(amount);
    }

    /**
     * This method generates number that ranges from 1 to 49, then returns it.
     * 
     * @return random generated number
     */

    public int generateRandom(int lb, int ub) {

        return (int) Math.random() * (ub - lb + 1) + lb;
    }

    public void displayCard() {
        // System.out.println("Career: " + career + "\nType: " + )
    }

}