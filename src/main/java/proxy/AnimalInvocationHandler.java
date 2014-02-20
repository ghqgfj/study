package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler{
    private Object realObject=null;
    public AnimalInvocationHandler(Object realSubject){
        this.realObject=realSubject;
    }
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        Object result=null;
        try{
            System.out.println("Do whatever you want");
            result=m.invoke(realObject, args);
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
