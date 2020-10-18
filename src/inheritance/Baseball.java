package inheritance;
public class Baseball extends SportsTeam
{
    // instance variables

    private double homeRunsPerGame;
    private double RBIsPerGame;
    private double errorsPerGame;
   
    // default constructor
    public Baseball(String name)
    {
        super(name);
    }
   
    // second constructor
    public Baseball(String name, int gamesPlayed, int gamesWon, int gamesLost, int h, int r, int e)
    {
        super(name,gamesPlayed,gamesWon,gamesLost);
        homeRunsPerGame = h;
        RBIsPerGame = r;
        errorsPerGame = e;
    }
   
    // accessor method - getHomeRunsPerGame
    // calculates and returns the homeruns per game by
    // dividing number of homeruns by games played
    public double getHomeRunsPerGame()
    {
        return homeRunsPerGame/getGamesPlayed();
    }
   
    // accessor method - getRBIsPerGame
    // calculates and returns the RBIs per game by
    // dividing the number of RBIs by games played
    public double getRBIsPerGame()
    {
        return RBIsPerGame/getGamesPlayed();
    }
   
    // accessor method - getErrorsPerGame
    // calculates and returns the errors per game by
    // dividing the number of errors by games played
    public double getErrorsPerGame()
    {
        return errorsPerGame/getGamesPlayed();
    }
   
    // toString method
    public String toString()
    {
        return super.toString() + "\nNumber of Homeruns      = " + (int)homeRunsPerGame
                                + "\nNumber of RBI's         = " + (int)RBIsPerGame
                                + "\nNumber of Errors        = " + (int)errorsPerGame
                                + "\nHomeruns per Game       = " + getHomeRunsPerGame()
                                + "\nRBIs per Game           = " + getRBIsPerGame()
                                + "\nErrors per Game         = " + getErrorsPerGame();
    }
}