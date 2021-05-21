import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class ControllerTest {
    

    Controller controller;


    @Test
	public void testGetRubricByName() {

		controller = new Controller();

		Rubric rubricByName = controller.createRubric("SQA", null, null);

		Rubric rubricByNameExists = controller.getRubricByName("SQA");

		assertEquals(rubricByName, rubricByNameExists);

		// returns null if rubric does not exist with given name
		Rubric rubricByNameDoesntExist = controller.getRubricByName("Statistics");

		assertEquals(null, rubricByNameDoesntExist);
	}

    @Test
	public void testCreateStudentGrade() {

		controller = new Controller();

		HashMap<String, Integer> grades = new HashMap<String, Integer>();

		grades.put("Design", 5);
		grades.put("Implementation", 4);
		grades.put("Testing", 3);
		grades.put("Documentation", 2);

		Grades studentGrade = controller.createStudentGrade("Mereidth Grey", grades);

		assertEquals("Meredith Grey", studentGrade.geStudentName());
		assertEquals(grades, studentGrade.getScore());


	}

    
}


