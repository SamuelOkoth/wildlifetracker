//
//import org.junit.Rule;
//import org.junit.Test;
//import static junit.framework.TestCase.assertEquals;
//import static junit.framework.TestCase.assertTrue;
//
//import static org.junit.Assert.*;
//
//public class AnimalTest {
//
//
//    @Rule
//    public DatabaseRule database=new DatabaseRule();
//
//    @Test
//    public void animal_instantiatesCorrectly_true(){
//        Animal testAnimal=new Animal("lion");
//        assertEquals(true,testAnimal instanceof Animal);
//    }
//    @Test
//    public void getName_animalInstantiatesWithName_lion(){
//        Animal testAnimal=new Animal("lion");
//        assertEquals("lion",testAnimal.getName());
//    }
//    @Test
//    public void equals_returnsTrueIfNameMatchesAnother_true(){
//        Animal firstAnimal=new Animal("lion");
//        Animal secondAnimal=new Animal("lion");
//        assertTrue(firstAnimal.equals(secondAnimal));
//    }
//    @Test
//    public void save_insertsAnimalObjectsToDatabase(){
//        Animal testAnimal=new Animal("lion");
//        testAnimal.saveAnimal();
//        assertTrue(Animal.allAnimals().get(0).equals(testAnimal));
//    }
//    @Test
//    public void allAnimals_returnsAllInstancesOfAnimal_true(){
//        Animal firstAnimal=new Animal("lion");
//        firstAnimal.saveAnimal();
//        Animal secondAnimal=new Animal("wildebeest");
//        secondAnimal.saveAnimal();
//        assertEquals(true,Animal.allAnimals().get(0).equals(firstAnimal));
//        assertEquals(true,Animal.allAnimals().get(1).equals(secondAnimal));
//    }
//    @Test
//    public void saveAnimal_assignsIDtoObject(){
//        Animal testAnimal=new Animal("lion");
//        testAnimal.saveAnimal();
//        Animal savedAnimal=Animal.allAnimals().get(0);
//        assertEquals(testAnimal.getId(),savedAnimal.getId());
//    }
//    @Test
//    public void find_returnsAnimalWithSameId_secondAnimal(){
//        Animal firstAnimal=new Animal("lion");
//        firstAnimal.saveAnimal();
//        Animal secondanimal=new Animal("wildebeest");
//        secondanimal.saveAnimal();
//        assertEquals(Animal.find(secondanimal.getId()),secondanimal);
//    }
//
//}
//
