import java.util.ArrayList;

public class Rubric {
    private String studentName;
    private ArrayList<Criteria> criteria = new ArrayList<>();

    public Rubric(){
        
    }


    
    public Rubric(String studentName, ArrayList<Criteria> criteria) {
        this.studentName = studentName;
        this.criteria = criteria;
    }
    
    
    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public ArrayList<Criteria> getCriteria() {
        return criteria;
    }


    public void setCriteria(ArrayList<Criteria> criteria) {
        this.criteria = criteria;
    }

    public String toString() {
        return "Rubric{" +
                "studentName=" + studentName +
                ", criteria=" + criteria + 
                '}';
    }
}
