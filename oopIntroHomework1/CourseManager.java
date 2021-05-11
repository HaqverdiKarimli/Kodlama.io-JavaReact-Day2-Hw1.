package oopIntroHomework1;

public class CourseManager {
	public void detailOfProgram(Course course) {
		System.out.println(course.courseName + " " + course.language+" hakkında detaylı bilgiler...");
	}
	public void applyToProgram(Course course) {
		System.out.println(course.courseName + " " + course.language+"-a kayıt başarılı şekilde tamamlandı\n");
	}
	
}
