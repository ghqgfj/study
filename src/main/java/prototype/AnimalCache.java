package prototype;

import java.util.Hashtable;

public class AnimalCache {
    private static Hashtable<String,Animal> animalMap=new Hashtable<String,Animal>();
    public static Animal getAnimal(String id){
        Animal cachedAnimal=animalMap.get(id);
        return (Animal)cachedAnimal.clone();
    }
    public static void loadCache(){
        Chicken chicken=new Chicken();
        chicken.setId("1");
        animalMap.put(chicken.getId(), chicken);
        Fish fish=new Fish();
        fish.setId("2");
        animalMap.put(fish.getId(), fish);
    }    
}
