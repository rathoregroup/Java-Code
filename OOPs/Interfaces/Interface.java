package OOPs.Interfaces;

public class Interface {
    public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();
    }
}
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down,legt, right, diagonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class king implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(by step 1)");
    }
}
