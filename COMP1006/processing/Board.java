public class Board {
	private char board[];
	private char playing;
	private int size;
	private int dimension;
	public Board(int s){
		this.playing = 'X';
		this.size = s;
		this.dimension = s*s;
		this.board = new char[this.dimension];
		for (int i = 0; i < this.dimension; i++) {
			this.board[i] = ' ';
		}
	}

	public Board(){
		this(3);
	}

	public boolean isFree(int row, int col){
		return this.board[row * this.size + col] == ' '?true:false;
	}

	public boolean tryMove(int row, int col){
		if (this.isFree(row, col)){
			this.board[row * this.size + col] = this.playing;
			this.playing = this.playing == 'X'?'O':'X';
			return true;
		} else {
			return false;
		}
	}

	public char getCell(int row, int col){
		return this.board[row * this.size + col];
	}

	private boolean isWinner(char c){
		int win_diag_l = 0;
		int win_diag_r = 0;
		for (int i = 0; i < this.size; i++) {
			int winsr = 0;
			int winsc = 0;
			for (int j = 0; j < this.size; j++) {
				if(this.board[i * this.size + j] == c) winsr++;
				if(this.board[j * this.size + i] == c) winsc++;
			}
			if(this.board[i * this.size + i] == c) win_diag_l++;
			if(this.board[(i + 1) * (this.size - 1)] == c) win_diag_r++;
			if (winsr == this.size) return true;
			if (winsc == this.size) return true;
		}
		if (win_diag_l == this.size) return true;
		if (win_diag_r == this.size) return true;
		return false;
	}

	public String toString(){
		String r = "+" + new String(new char[this.size]).replace("\0", "---+") + "\n";
		for (int i = 0; i < this.size; i++) {
			r += "| ";
			for(int j = 0; j < this.size; j++){
				r += this.board[i * this.size + j];
				r += " | ";
			}
			r += "\n+" + new String(new char[this.size]).replace("\0", "---+") + "\n";
		}
		return r;
	}

	public static void main(String[] args) {
		Board b = new Board(5);
		System.out.println("Board of size " + b.size);
		b.tryMove(0,0);//X
		b.tryMove(0,4);//O
		b.tryMove(1,1);//X
		b.tryMove(1,3);//O
		b.tryMove(2,2);//X
		b.tryMove(3,1);//O
		b.tryMove(3,3);//X
		b.tryMove(4,0);//O
		b.tryMove(4,4);//X
		System.out.print(b);
		System.out.println("X is winner? " + b.isWinner('X'));
		System.out.println("O is winner? " + b.isWinner('O'));
	}
}