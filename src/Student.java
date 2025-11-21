import javafx.beans.property.SimpleStringProperty;

public class Student {
    private final SimpleStringProperty name;
    private final SimpleStringProperty email;
    private final SimpleStringProperty course;
    private final SimpleStringProperty dateTime;

    public Student(String name, String email, String course, String dateTime) {
        this.name = new SimpleStringProperty(name);
        this.email = new SimpleStringProperty(email);
        this.course = new SimpleStringProperty(course);
        this.dateTime = new SimpleStringProperty(dateTime);
    }

    public String getName() { return name.get(); }
    public void setName(String value) { name.set(value); }

    public String getEmail() { return email.get(); }
    public void setEmail(String value) { email.set(value); }

    public String getCourse() { return course.get(); }
    public void setCourse(String value) { course.set(value); }

    public String getDateTime() { return dateTime.get(); }
    public void setDateTime(String value) { dateTime.set(value); }
}
