class Course {
    String courseName; int duration;
}
class OnlineCourse extends Course {
    String platform; boolean isRecorded;
}
class PaidOnlineCourse extends OnlineCourse {
    int fee; int discount;
}
public class CourseMain {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse();
        p.courseName = "Java Masterclass";
        p.duration = 60;
        p.platform = "Udemy";
        p.isRecorded = true;
        p.fee = 4000;
        p.discount = 20;
        System.out.println(p.courseName+" "+p.platform+" "+p.fee+" "+p.discount+"%");
    }
}
