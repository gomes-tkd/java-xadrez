package chess;

import bordgame.Position;

public class ChessPosition {
    private int row;
    private int column;

    public ChessPosition(int row, int column) {
        if (column < 'a' || column > 'h' || row < 0 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
        }
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    protected Position toPosition() {
        return new Position((8 - row), (column - 'a'));
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((8 - position.getRow()), (char) ('a' + position.getColumn()));
    }

    @Override
    public String toString() {
        return "ChessPosition [ column = " + column + ", row = " + row + "]";
    }
}
