//import org.junit.Rule;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class EndangeredTest {
//    @Rule
//    public DatabaseRule database=new DatabaseRule();
//
//
//    @Test
//    public void getLocation() {
//        Endangered endangered=setupEndangered();
//        assertEquals("zone1",endangered.getLocation());
//    }
//
//    @Test
//    public void getAge() {
//        Endangered endangered=setupEndangered();
//        assertEquals("adult",endangered.getAge());
//    }
//
//    @Test
//    public void getRangerName() {
//        Endangered endangered=setupEndangered();
//        assertEquals("steve",endangered.getRangerName());
//    }
//
//    @Test
//    public void getHealthStatus() {
//        Endangered endangered=setupEndangered();
//        assertEquals("okay",endangered.getHealthStatus());
//    }
//    public Endangered setupEndangered(){
//        Endangered endangered=new Endangered("lion","zone1", "adult","steve","okay");
//        return endangered;
//    }
//    @Test
//    public void equals_returnsTrueIfNamesAreSimilar_true(){
//        Endangered animalOne=setupEndangered();
//        Endangered animalTwo=setupEndangered();
//        assertTrue(animalOne.equals(animalTwo));
//    }
//    @Test
//    public void save_returnsTrueIfArgumentsmatch(){
//        Endangered newEnddangered=setupEndangered();
//        newEnddangered.saveEndangered();
//        assertTrue(Endangered.allEndangered().get(0).equals(newEnddangered));
//    }
//    @Test
//    public void allEndangered_returnsAllInstancesOfEndangered_true(){
//        Endangered newEndangered=setupEndangered();
//        newEndangered.saveEndangered();
//        Endangered secondEndangered=setupEndangered();
//        secondEndangered.saveEndangered();
//        assertEquals(true,Endangered.allEndangered().get(0).equals(newEndangered));
//        assertEquals(true,Endangered.allEndangered().get(1).equals(secondEndangered));
//
//    }
//
//}