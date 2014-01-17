package exception.handle;

public class ExceptionWrapper extends Exception{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public ExceptionWrapper(String s,Throwable t){
        super(s,t);
    }

}
