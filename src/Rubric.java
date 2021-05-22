import java.util.ArrayList;
import java.util.List;

public class Rubric {
  
	String topicName;
	List<Grades>grades = new ArrayList<>();
	List<String> criterion = new ArrayList<String>();
	
	
	//Empty Constructor
	public Rubric() {
		super();
		
	}

	public Rubric(String topicName, List<Grades> grades, List<String> criterion) {
		super();
		this.topicName = topicName;
		this.grades = grades;
		this.criterion = criterion;
	}

	//Getters & Setters
	public String getTopicName() {
		return topicName;
	}


	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}


	public List<Grades> getGrades() {
		return grades;
	}


	public void setGrades(List<Grades> grades) {
		this.grades = grades;
	}


	public List<String> getCriterion() {
		return criterion;
	}


	public void setCriterion(List<String> criterion) {
		this.criterion = criterion;
	}
	

    @Override
    public String toString() {
        return "Rubric{" +
                "topicName='" + topicName + '\'' +
                ", criteria=" + criterion  +
                '}';
    }
}
