import org.code.neighborhood.*;

public class BunnyPainter extends MuralPainter {

  /*
  * Paints the bunny with the
  * given String colors for each trait.
  */
  public void paintBunny(String firstEarColor, String secondEarColor, String baseColor, String faceColor) {
    getToStartFirstEar();
    paintFirstEar(firstEarColor);

    resetPosition();

    getToStartSecondEar();
    paintSecondEar(secondEarColor);

    resetPosition();

    getToStartBase();
    paintBase(baseColor);

    resetPosition();

    getToStartFace();
    paintFace(faceColor);

    resetPosition();
  }
  
  /*
  * Moves painter to start painting
  * the first ear
  */
  public void getToStartFirstEar() {
    move();
    move();
    turnRight();
    move();
    move();
    turnLeft();
  }

  /*
  * Painter starts painting
  * the first ear
  */
  public void paintFirstEar(String firstEarColor) {
  // white part  
    paintLine("white", 3);
    turnToWest();
    move();
    paintLine("white", 3);
    turnToEast();
    move();
    paintLine("white", 3);
    turnToWest();
    move();
    paintLine("white", 3);
    turnToEast();
    move();
    paintLine("white", 3);
    turnToWest();
    move();

  // pink part
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    paintLine(firstEarColor, 1);
    turnToWest();
    move();
    paintLine(firstEarColor, 1);
    turnToEast();
    move();
    paintLine(firstEarColor, 1);
  }

  /*
  * Moves painter to start painting
  * the second ear
  */
  public void getToStartSecondEar() {
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    turnLeft();
  }

  /*
  * Painter starts painting
  * the second ear
  */
  public void paintSecondEar(String secondEarColor) {
    // white part  
    paintLine("white", 3);
    turnToWest();
    move();
    paintLine("white", 3);
    turnToEast();
    move();
    paintLine("white", 3);
    turnToWest();
    move();
    paintLine("white", 3);
    turnToEast();
    move();
    paintLine("white", 3);
    turnToWest();
    move();

  // pink part
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    paintLine(secondEarColor, 1);
    turnToWest();
    move();
    paintLine(secondEarColor, 1);
    turnToEast();
    move();
    paintLine(secondEarColor, 1);
  }

  /*
  * Moves painter to start painting
  * the base of the bunny
  */
  public void getToStartBase() {
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
  }

  /*
  * Painter starts painting
  * the bunny's face
  */
  public void paintBase(String baseColor){
    paintLine(baseColor, 8);
    turnToWest();
    move();
    paintLine(baseColor, 8);
    turnToEast();
    move();
    paintLine(baseColor, 8);
    turnToWest();
    move();
    paintLine(baseColor, 8);
    turnToEast();
    move();
    paintLine(baseColor, 8);
    turnToWest();
    move();
    paintLine(baseColor, 8);
    turnRight();
    turnRight();
  }

  /*
  * Moves painter to start painting
  * the facial features
  */
  public void getToStartFace() {
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
  }

  /*
  * Painter starts painting
  * the facial features
  */
  public void paintFace(String faceColor) {
    paintLine(faceColor, 1);
    move();
    move();
    move();
    move();
    paintLine(faceColor, 1);
    turnRight();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    paintLine(faceColor, 2);
    turnAround();
  }
}