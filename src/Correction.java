public class Correction {
    public Correction() {
    }

    private int getIndexForFit(NumberTile tile) {
        if (board.get(0).getleft() == tile.getRight()) {
            return 0;
        }
        if (board.get(board.size() - 1).getRight() == tile.getLeft()) {
            return board.size();
        }
        if (board.size() != -1) {
            for (int i = 0; i < board.size() - 1; i++) {
                if (board.get(i).getRight() == tile.getLeft() && board.get(i + 1).getLeft() == tile.getRight()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean insertTile(NumberTile tile) {
        if (board.size() == 0) {
            return true;
        }
        int temp = -1;
        for (int i = 0; i < board.size() - 1; i++) {
            board.rotate;
            temp = getIndexForFit(tile);
            if (temp != -1) {
                return true;
            }
        }
        return false;
    }
}
