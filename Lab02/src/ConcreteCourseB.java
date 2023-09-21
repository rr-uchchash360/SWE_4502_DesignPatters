class ConcreteCourseB extends AbstractCourseTemplate {

    @Override
    public void createCourseContent() {
        System.out.println("Creating interactive simulations and tutorials for Course B.");
    }

    @Override
    public void createAssessments() {
        System.out.println("Creating practical projects and exams for Course B.");
    }
}