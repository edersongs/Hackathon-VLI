package abobora.hackathon.gervasio.exceptions;

/**
 * @author Eduardo Silva Rosa
 *		   edus.silva.rosa@gmail.com
 *		   linkedin.com/in/eduardo-rosa
 *	   	   https://github.com/edusr
 *	       + 55 (34) 9 9179-4411	
 *
 */
@SuppressWarnings("serial")
public class MovimentacaoExcpetion extends Exception {

	public MovimentacaoExcpetion() {
		super();
	}

	public MovimentacaoExcpetion(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MovimentacaoExcpetion(String message, Throwable cause) {
		super(message, cause);
	}

	public MovimentacaoExcpetion(String message) {
		super(message);
	}

	public MovimentacaoExcpetion(Throwable cause) {
		super(cause);
	}
	
	

}
