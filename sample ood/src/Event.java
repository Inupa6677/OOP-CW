import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event {

    private int id;
    private String title;
    private String description;
    private LocalDateTime dateTime;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private List<Event> events = new ArrayList<>();

    public void createEvent(Event event){
        events.add(event);

    }
    public void deleteEvent(Event event){
        events.remove(event);
    }





}
