package exerciseGameStatusesEnum2;

public class GameStatusesExample {
    public static void main(String[] args) {
        for (GameStatus status: GameStatus.values()){
            System.out.println(status);
        }

        GameStatus gameStatus = GameStatus.PAUSED;
    }
}
