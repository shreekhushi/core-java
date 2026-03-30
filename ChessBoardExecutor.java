class ChessBoardExecutor{

    public static void main(String[] args){
	
	ChessBoard cb1 = new ChessBoard();
    ChessBoard cb2 = new ChessBoard("Wood");
    ChessBoard cb3 = new ChessBoard("Plastic", 15);
    ChessBoard cb4 = new ChessBoard("Wood", 18, "Brown");
    ChessBoard cb5 = new ChessBoard("Glass", 20, "Black", "Magnetic");
    ChessBoard cb6 = new ChessBoard("Wood", 22, "Classic", "Foldable", 1500);

    cb1.display();
	cb2.display();
	cb3.display();
    cb4.display();
	cb5.display();
	cb6.display();
	
	}
}