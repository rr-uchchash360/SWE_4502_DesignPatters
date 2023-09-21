public class Main {
    public static void main(String[] args) {
        AbstractCourseTemplate courseA = new ConcreteCourseA();
        AbstractCourseTemplate courseB = new ConcreteCourseB();

        courseA.createAndPresentCourse();
        System.out.println("--------------------------");
        courseB.createAndPresentCourse();
    }
}
