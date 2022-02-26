package Session11;


    public enum Piece {

        WHITE("W"),
        BLACK("B");

        String symbol;

        Piece(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

    }

