import org.code.neighborhood.*;

public class PainterPlus extends Painter {


  /*
  * Moves painter
  * to the right
  */
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();  
  }

  /*
  * For as long at the painter
  * is on a bucket, it will automatically take all the paint
  */
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  /*
  * Calling this action once will cause the painter
  * to continue moving for as long as it can move
  */
  public void moveFast() {
    while (canMove()){
      move();
    }
  }

  /*
  * The painter will paint and move for as long
  * as it has paint
  */
  public void paintToEmpty(String color) {
    while (hasPaint()){
      paint(color);
      move();
    }
  }  
    }
 