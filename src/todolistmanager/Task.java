package todolistmanager;

/**
 * @author Souley Bane
 */
public class Task {
    private String taskDetails;
    
    public Task(String task){
        taskDetails = task;
    } 
    
    public String getText(){
        return taskDetails;
    }
}