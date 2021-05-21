import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ControllerTest {
    

    Controller controller = controller = new Controller();


    @Test
	public void testGetRubricByName() {

		
		Rubric rubricByName = controller.createRubric("SIS", null, null);
		Rubric rubricByNameExists = controller.getRubricByName("SIS");

		assertEquals(rubricByName, rubricByNameExists);

		Rubric rubricByNameDoesntExist = controller.getRubricByName("Writing");

		assertEquals(null, rubricByNameDoesntExist);
	}
    
    
    @Test
	public void testCreateStudentGrade() {

		HashMap<String, Integer> grades = new HashMap<String, Integer>();

		grades.put("Design", 5);
		grades.put("Implementation", 4);
		grades.put("Testing", 3);
		grades.put("Documentation", 2);

		Grades studentGrade = controller.createStudentGrade("Mereidth Grey", grades);

		assertEquals("Meredith Grey", studentGrade.geStudentName());
		assertEquals(grades, studentGrade.getScore());


	}

    @Test
	public void testCriterionAverage() {
		

		ArrayList<String> criterion = new ArrayList<>();
		double avgTest = Double.valueOf((2.0 + 2.0) / 2.0);

		criterion.add(new String("Design"));
		criterion.add(new String("Implementation"));
		criterion.add(new String("Testing"));
		criterion.add(new String("Documentation"));

		HashMap<String, Integer> grade1 = new HashMap<String, Integer>();
		HashMap<String, Integer> grade2 = new HashMap<String, Integer>();

		grade1.put("Design", 5);
		grade1.put("Implementation", 3);
		grade2.put("Design", 4);
		grade2.put("Implementation", 1);


		Grades DerekGrades = controller.createStudentGrade("Kyle Richards", grade1);
		Grades MeredithGrade = controller.createStudentGrade("Kim Richards", grade2);

		ArrayList<Grades> studentGrades = new ArrayList<Grades>();

		studentGrades.add( DerekGrades);
		studentGrades.add(MeredithGrade);

		Rubric rub = controller.createRubric("SQA", criterion, studentGrades);

		double average = controller.getCriterionAverage(rub, "Design");

		Assertions.assertEquals(avgTest, average);

		
	}
    @Test
	public void testGetAllStudentGrades() {

		ArrayList<String> criterion = new ArrayList<>();

		criterion.add(new String("Design"));
		criterion.add(new String("Implementation"));
		

		HashMap<String, Integer> grade1 = new HashMap<String, Integer>();
		HashMap<String, Integer> grade2 = new HashMap<String, Integer>();
		

		grade1.put("Design", 5);
		grade2.put("Implementation", 4);
		

		Grades stu1 = controller.createStudentGrade("Student 1", grade1);
		Grades stu2 = controller.createStudentGrade("Student 2", grade2);
		

		ArrayList<Grades> gradeList = new ArrayList<Grades>();

		gradeList.add(stu1);
		gradeList.add(stu2);
		

		List<Grades> gradeList1 = controller.getAllStudentGrades();

		assertEquals(gradeList, gradeList);
	}

    
}


