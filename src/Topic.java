import java.util.ArrayList;

public class Topic {

    private String topicName;
    private ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
    
    public Topic(){

    }

    public Topic(String topicName, ArrayList<Rubric> rubrics) {
        super();
        this.topicName = topicName;
        this.rubrics = rubrics;
    }

    

    public ArrayList<Rubric> getRubrics() {
        return rubrics;
    }

    public void setRubrics(ArrayList<Rubric> rubrics) {
        this.rubrics = rubrics;
    }

   
   
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
  
    public String toString() {
        return "Topic{" +
                "topicName='" + topicName + '\'' +
                ", rubrics=" + rubrics +
                '}';
    }
    

}
