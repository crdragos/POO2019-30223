import java.io.IOException;

public class IncompleteDataException extends IOException{

	private static final long serialVersionUID = 1L;
	
	public IncompleteDataException(String message) {
		super(message);
	}
	
}
