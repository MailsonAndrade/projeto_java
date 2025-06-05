 package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	/**
	 * coloque um construtor que receba a mensagem
	 */
	public BoardException(String msg) {
		super(msg);
	}
	

}
