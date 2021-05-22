import java.util.HashMap;

public class Grades {
String studentName;

HashMap<String,Integer> score = new HashMap();



//Empty Constructor
public Grades() {
    super();
    
}

public Grades(String studentName, HashMap<String, Integer> score) {
    super();
    this.studentName = studentName;
    this.score = score;
}

//Getters & Setters
public String geStudentName() {
    return studentName;
    
}


public void setStudentName(String studentName) {
    this.studentName = studentName;
}

public void setScore(HashMap<String, Integer> score) {
    this.score = score;
}  

public HashMap<String, Integer> getScore() {
    return score;
    
}
    }
