import java.util.ArrayList;

public class TileGame {
    private ArrayList<NumberTile> board;

    public TileGame()
    {
        board = new ArrayList<NumberTile>();
    }

    //Added this so we can have a new examples to check our work
    public TileGame(ArrayList<NumberTile> tileList)
    {
        board = tileList;
    }

    private int getIndexForFit(NumberTile tile)
    {
        if (board.get(0).getLeft() == tile.getRight()) {
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

    public boolean insertTile(NumberTile tile)
    {
        if (board.size() == 0) {
            return true;
        }
        int temp = -1;
        for (int i = 0; i < board.size() - 1; i++) {
            tile.rotate();
            temp = getIndexForFit(tile);
            if (temp != -1) {
                return true;
            }
        }
        return false;
    }
    public String toString()
    {
        String retStr = "";
        for (int i = 0; i < board.size(); i++)
        {
            retStr += " "+board.get(i).getTop()+"  ";
        }
        retStr += "\n";
        for (int i = 0; i < board.size(); i++)
        {
            retStr += board.get(i).getLeft()+" "+board.get(i).getRight()+" ";
        }
        retStr += "\n";
        for (int i = 0; i < board.size(); i++)
        {
            retStr += " "+board.get(i).getBottom()+"  ";
        }
        retStr += "\n";
        return retStr;
    }
}