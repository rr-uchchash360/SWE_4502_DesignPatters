public abstract class AbstractCourseTemplate {

    public void createAndPresentCourse() {
        createCourseContent();
        createAssessments();
        presentCourse();
    }

    public void createCourseContent(){

    };

    public void createAssessments(){

    };

    void presentCourse() {
        System.out.println("Presenting the course to students.");
    }
}
