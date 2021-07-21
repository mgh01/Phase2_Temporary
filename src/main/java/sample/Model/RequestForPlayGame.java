package sample.Model;


public class RequestForPlayGame {
    String userWantPlayGame;
    String wantedOpponentName;

    public RequestForPlayGame(String userWantPlayGame, String wantedOpponentName) {
        this.userWantPlayGame = userWantPlayGame;
        this.wantedOpponentName = wantedOpponentName;
    }

    public String getUserWantPlayGame() {
        return userWantPlayGame;
    }

    public String getWantedOpponentName() {
        return wantedOpponentName;
    }
}