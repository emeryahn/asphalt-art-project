import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

// Creates a MuralPainter object
    MuralPainter backgroundPainter = new MuralPainter();

// Creates a BunnyPainter object
    BunnyPainter bunnyPainter = new BunnyPainter();

// Paints a background for the mural    
    backgroundPainter.paintBackground("LightBlue", 12);
    
// Paints a bunny
    bunnyPainter.paintBunny("pink", "pink", "white", "black");
    
  }
}