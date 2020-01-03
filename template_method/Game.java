public abstract class Game {
  public abstract void initializeGame();
  public abstract void startGame();
  public abstract void endGame(); 
  
  public final void play() {
      initializeGame();
      startGame();
      endGame();
  }
}