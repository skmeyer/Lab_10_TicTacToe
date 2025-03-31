import java.util.Scanner;

public class TicTacToe
{
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private static String board [][] = new String[ROWS][COLS];

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        display();
        int rowMove = SafeInput.getRangedInt(in, "Enter the row you want to place an X in",1,3);
        rowMove = in.nextInt();
        rowMove = rowMove - 1;
        int colMove = SafeInput.getRangedInt(in, "Enter the column you want to place an X in",1,3);
        colMove = in.nextInt();
        colMove = colMove - 1;
    }
    private static void clearBoard()
    {
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                board[row][col] = " ";
            }
        }
        System.out.println();
    }
    private static void display()
    {
        for(int row = 0; row < ROWS; row++)
        {
            System.out.print(" | ");
            for(int col = 0; col < COLS; col++)
            {
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
    private static boolean isWin(String player)
    {
        if(isColWin(player) || isRowWin(player) || isDiagonalWin(player))
        {
            return true;
        }
        return false;
    }
    private static boolean isRowWin(String player)
    {
        for(int row=0; row < ROWS; row++)
        {
            if(board[row][0].equals(player) && board[row][1].equals(player) &&
                    board[row][2].equals(player))
            {
                return true;
            }
        }
        return false;
    }
    private static boolean isColWin(String player)
    {
        for(int col=0; col < COLS; col++)
        {
            if(board[col][0].equals(player) && board[col][1].equals(player) &&
                    board[col][2].equals(player))
            {
                return true;
            }
        }
        return false;
    }
    private static boolean isDiagonalWin(String player)
    {
            if(board[0][0].equals(player) || board[1][1].equals(player) || board[2][2].equals(player))
            {
                return true;
            }
            else if(board[0][2].equals(player) || board[1][1].equals(player) || board[2][0].equals(player))
            {
                return true;
            }

        return false;
    }
    private static boolean isValidMove(int row, int col)
    {
        boolean retVal = false;
        if(board[row][col].equals(" "))
            retVal = true;
        return retVal;
    }
    



}
