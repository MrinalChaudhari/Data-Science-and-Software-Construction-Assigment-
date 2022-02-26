package Session11;

public class Array {
    Piece piece;

    public Array(){
        piece=null;
    }

    public Array(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Array{" +
                "piece=" + piece +
                '}';
    }

    public void occupy(Piece piece)  throws ExceptionClass {
        if(piece!=null){
            throw new ExceptionClass("Square is occupied");
        }
        this.piece=piece;
    }

    public Boolean isOccupied() {
        return piece!=null;
    }
}
