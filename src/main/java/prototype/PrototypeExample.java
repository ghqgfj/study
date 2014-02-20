package prototype;

public class PrototypeExample {
    public static void main(String[] args){
        AnimalCache.loadCache();
        Animal clonedAnimal=(Animal)AnimalCache.getAnimal("1");
        System.out.println("Animal:"+clonedAnimal.getType());
        clonedAnimal.name();
        clonedAnimal=(Animal)AnimalCache.getAnimal("2");
        System.out.println("Animal:"+clonedAnimal.getType());
        clonedAnimal.name();
    }
}
