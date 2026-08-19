import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Set<Integer> students = new HashSet<>();
		Scanner sc = new Scanner (System.in);
		System.out.println("Student A: ");
		int n = sc.nextInt();
		addStudents(sc,students,n);
		System.out.println("Student B: ");
		n = sc.nextInt();
		addStudents(sc,students,n);
		System.out.println("Student C: ");
		n = sc.nextInt();
		addStudents(sc,students,n);
		System.out.println(students.size());
		sc.close();
	}
	
	public static void addStudents (Scanner sc, Set<Integer> students, int n) {
		for (int i = 0; i < n; i++) {
	        System.out.println("Student Code: ");
	        Integer student = sc.nextInt();
	        students.add(student);
	    }
	}
}
