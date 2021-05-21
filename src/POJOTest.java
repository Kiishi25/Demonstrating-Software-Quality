//import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class POJOTest {
    
    @Test
    public void testStudent() {
        Student student = new Student();
        student.setName("Kiishi Ifebajo");

        assert
                student.getName().equals("Kiishi Ifebajo");
    }

        @Test
        public void testRubric() {
            Student student = new Student();
            student.setName("Kiishi Ifebajo");
    
            Criteria criteria = new Criteria(5, "Grammar");
            Criteria criteria2 = new Criteria(5, "Writing");
    
            ArrayList<Criteria> criterion = new ArrayList<>();
            criterion.add(criteria);
            criterion.add(criteria2);
    
            Rubric rubric = new Rubric(student.getName(), criterion);
    
            assert
                    rubric.getCriteria().get(0) == criteria;
    
        }

        @Test
    public void testCriteria() {
        Criteria criteria = new Criteria(5, "Grammar");

        assert
                criteria.getGrade() == 5;
    }

    @Test
    public void testTopic() {
        Student student = new Student();
        student.setName("Kiishi Ifebajo");
        
        Criteria criteria = new Criteria(5, "Grammar");
        Criteria criteria2 = new Criteria(5, "Writing");
       

        ArrayList<Criteria> criterion = new ArrayList<>();
        criterion.add(criteria);
        criterion.add(criteria2);
       
        Rubric rubric = new Rubric(student.getName(), criterion);
       

        ArrayList<Rubric> rubrics = new ArrayList<>();
        rubrics.add(rubric);
       

        Topic topic = new Topic("English", rubrics);

        assert
                topic.getRubrics().get(0).getStudentName().equals("Kiishi Ifebajo");
        
    }


}
