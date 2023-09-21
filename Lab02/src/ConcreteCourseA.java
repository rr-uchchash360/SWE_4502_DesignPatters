public class ConcreteCourseA extends AbstractCourseTemplate {

    @Override
    public void createCourseContent() {
        System.out.println("Creating video lectures and reading materials for Course A.");
    }

    @Override
    public void createAssessments() {
        System.out.println("Creating quizzes and assignments for Course A.");
    }
}

