public class Topic {
    private String topicName;

    

    public Topic(String topicName){

    }

    public Topic(){
        
    }
   
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
    @Override
    public String toString() {
        return
                "TopicName='" + topicName + '\'' ;
    }
}
