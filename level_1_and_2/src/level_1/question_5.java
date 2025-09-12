package level_1;

public class question_5 {
	public static void main(String[] args) {
		double no_of_pens = 14;
		double no_of_student = 3;
		double pen = (no_of_pens -2) / no_of_student;
		double pin = no_of_pens % no_of_student;
		System.out.println("the pen per student is " +(pen)+ " and the remaining pen not distributed is " +pin);
	}
}
