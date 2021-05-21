import java.util.ArrayList;


public class Student {
   String name;
   private ArrayList<Topic> topics = new ArrayList<Topic>();

     //empty constructor
    public Student(){
       
    }
   
    public Student(String name, ArrayList<Topic> topics){
       this.name = name;
       this.setTopics(topics);

    }
        //getters & setters
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public ArrayList<Topic> getTopics() {
            return topics;
        }
        public void setTopics(ArrayList<Topic> topics) {
            this.topics = topics;
        }
        public String toString() {
            return "Student{" +
                    "Name='" + name + '\'' +
                    ", topics=" + topics +
                    '}';
        }
    }
