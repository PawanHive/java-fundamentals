
public class OOPS {
  public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();
  }
}

// INTERFACE 
interface ChessPlayer {
  void moves();
}

// REMEMBER: to inherit from interface we use 'implements' keywords
class Queen implements ChessPlayer {
  public void moves(){
    System.out.println("up, down, left, right, diagonal (in all 4 direction)");
  }
}

class Rook implements ChessPlayer {
  public void moves(){
    System.out.println("up, down, left, right");
  }
}

class King implements ChessPlayer {
  public void moves(){
    System.out.println("up, down, left, right, diagoanl by - (1 step)");
  }
}
