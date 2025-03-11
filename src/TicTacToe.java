public class TicTacToe
{
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private static String board [][] = new String[ROWS][COLS];

    public static void main(String[] args)
    {
        display();
        
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
        }
    }
    
}
