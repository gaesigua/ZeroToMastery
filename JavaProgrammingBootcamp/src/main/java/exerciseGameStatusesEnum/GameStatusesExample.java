package exerciseGameStatusesEnum;

public class GameStatusesExample {
    public static void main(String[] args) {
        for (GameStatus gameStatus: GameStatus.values()){
            System.out.println("Game Status: " + gameStatus);
        }
        GameStatus gameStatus = GameStatus.PAUSED;

    }
}
