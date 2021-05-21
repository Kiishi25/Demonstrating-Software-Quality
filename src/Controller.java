import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Controller {
 

    //List of All Student Grades
	List<Grades> studentGradeList = new ArrayList<Grades>();
    //List of All Rubrics
	List<Rubric> rubricList = new ArrayList<Rubric>();
	
	//Empty Constructor
	public Controller() {
		
	}
  
   //Create rubrics
    public Rubric createRubric(String title, List<String> criterion, List<Grades>grades) {
		Rubric rubric = new Rubric(title, grades, criterion);
		rubricList.add(rubric);
		return rubric;
		
	}

    //List of Rubrics Created 
	public List<Rubric> getAllRubrics() {
		return rubricList;
	}


    // Get a specific Rubric by name
	public Rubric getRubricByName(String rubricName) {
		for (Rubric rubr : rubricList) {
			if (rubr.getTopicName().equals(rubricName)) {
				return rubr;
			}
		}
		return null;
	}


    public Grades createStudentGrade( String studentName, HashMap<String, Integer> score) {
		Grades studentGrade = new Grades(studentName, score);
		return studentGrade;
	}
	
    public List<Grades>getAllStudentGrades(){
		return studentGradeList;
	}

    public double getCriterionAverage(Rubric rubric, String criterion) {
		
		int total =0;
		for(Grades grade :rubric.getGrades()) {
			total = total + grade.getScore().get(criterion);
		}
		int average = Math.round(total/rubric.getGrades().size());

		return average;
	}
	

  
    // Add Criterion to Rubric
	public ArrayList<String> addCriterionToRubric(String criterion, Rubric rubric) {

		ArrayList<String> criterionLis = (ArrayList<String>) rubric.getCriterion();

			criterionLis.add(criterion);

		return criterionLis;
	}


//CALCULATES MAXIMIUM OF ALL SCORES IN RUBRIC
public int calculateTotalMax(Rubric rubric) {
    ArrayList<Integer> results = new ArrayList<>();
    for(Grades grade :rubric.getGrades()) {
        results.addAll((Collection<? extends Integer>) grade);
    }
   
    return Collections.max(results);
}

//CALCULATES Minimum OF ALL SCORES IN RUBRIC
public int calculateTotalMin(Rubric rubric) {
    ArrayList<Integer> results = new ArrayList<>();
    for(Grades grade :rubric.getGrades()) {
        results.addAll((Collection<? extends Integer>) grade);
    }
   
    return Collections.min(results);
}

public double calculateStandardDeviation(Rubric rubrics){
    ArrayList<Integer> results = new ArrayList<>();
    for(Grades grade :rubrics.getGrades()) {
        results.addAll((Collection<? extends Integer>) grade);
    }
        double standardDeviation = 0.0;
        int sum = results.stream().mapToInt(Integer::intValue).sum();
        double mean = sum / results.size();
        for (double num : results) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        System.out.println("Standard deviation: " + standardDeviation / results.size());
        return Math.sqrt(standardDeviation / results.size());
    }

//method check if student grade is empty
public static boolean checkEmptyStudentGrade(ArrayList<Grades> g1) {

    //if student grade is empty
    if (g1.isEmpty()) {
        //appropriate message is printed to the user
        System.out.println("Error: You have no Student Grade's added to the rubric");
        return false;
    } else {

        return true;
    }


}

    public static void main(String[] args) {
        new Controller();
    }
}
