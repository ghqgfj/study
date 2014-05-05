package proxy;

import java.lang.reflect.Proxy;

public class ProxyExample {
    public static void main(String[] args){
        Animal realObject=new Lion();
        Animal proxy=(Animal)Proxy.newProxyInstance(realObject.getClass().getClassLoader(),
                realObject.getClass().getInterfaces(), new AnimalInvocationHandler(realObject));
        proxy.getSound();
        
        Image image=new ProxyImage("picture.png");
        image.display();
    }
}
