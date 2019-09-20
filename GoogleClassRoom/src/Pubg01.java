import java.util.Scanner;

public class Pubg01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine().trim();
        if (num < 0) {
            System.out.println("Invalid Number Entered ");
        } else {

            Player[] playerArray = new Player[num];
            for (int i = 1; i <= num; i++) {
                String playername = scan.nextLine().trim();
                String username = scan.nextLine().trim();
                String level = scan.nextLine().trim();
                int score = scan.nextInt();
                scan.nextLine().trim();

                playerArray[i] = new Player(playername, username, level, score);
            }
            System.out.println("PLAYERNAME \t USERNAME \t LEVEL \t SCORE ");
            for (Player player : playerArray) {
                System.out.println(player);
            }
        }
    }
}

class Player {
    private String playername;
    private String username;
    private String level;
    private int score;

    Player(String playername, String username, String lavel, int score) {
        this.playername = playername;
        this.username = username;
        this.level = level;
        this.score = score;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%10s\t%10s\t%10s\t%10", getPlayername(), getUsername(), getLevel(), getScore());
    }
}

