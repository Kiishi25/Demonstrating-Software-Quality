public class Criteria {
    private int grade;
    private String criteriaName;

    public Criteria(){
        
    }
    public Criteria(int grade, String criteriaName) {
        this.grade = grade;
        this.criteriaName = criteriaName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCriteriaName() {
        return criteriaName;
    }

    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }
    public String toString() {
        return "Criteria{" +
                "criteriaName='" + criteriaName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
