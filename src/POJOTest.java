import org.junit.Test;

public class POJOTest {
    
    @Test
    public void testStudent() {
        Student student = new Student();
        student.setName("Kiishi Ifebajo");

        assert
                student.getName().equals("Kiishi Ifebajo");
    }
}
