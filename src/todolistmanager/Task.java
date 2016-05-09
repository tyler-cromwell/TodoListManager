package todolistmanager;

/**
 * @author Souley Bane
 */
public class Task {
    
    public Task(String taskDetails){
        
    } 
    
    //Task Details
    private String taskDetails;
    
    public String getTaskDetails(){
        return taskDetails;
    }
    
    public String setTaskDetails(String TaskDetails){
        this.taskDetails = taskDetails;
        return taskDetails;
    }
    
    //Title
    private String Title;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }
    
    //Priority 
    private int Priority;

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    //Notes 
    private String notes;
    
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    //Is it done
    private boolean isDone;
    
    public boolean getisDone(){
        return isDone;
    }
    
    public boolean setisDone(){
        this.isDone = isDone;
        return isDone;
    }
}