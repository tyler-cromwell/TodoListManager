package todolistmanager;

/**
 * @author Souley Bane, Tyler Cromwell
 */
public class Task implements Comparable {
    private String title;
    private int priority;
    private boolean isDone;
    private String notes;

    public Task(String title) {
        this.title = title;
        this.priority = Priority.NORMAL.ordinal();
        this.isDone = false;
        this.notes = "";
    }

    public String getTitle() {
        return this.title;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getNotes() {
        return this.notes;
    }

    public boolean getIsDone(){
        return this.isDone;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int compareTo(Object object) {
        Task other = (Task) object;
        return (this.priority - other.priority);
    }
}