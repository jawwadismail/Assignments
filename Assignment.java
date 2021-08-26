import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment {
	static int id = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student College Name");
		String college = sc.next();

		Student1[] arr = new Student1[3];
		Student1.CollegeName = college;

		int i = 0;
		ArrayList<Student1> arrList = new ArrayList<Student1>();
		for (i = 0; i <= 2; i++) {
			System.out.println("Enter Student Name");
			String name = sc.next();
			System.out.println("Enter Student Date of Birth");
			LocalDate date = LocalDate.parse(sc.next());
			System.out.println("Enter Student Phone Number");
			String number = sc.next();
			
			arr[i] = new Student1(id++, name, date, number);
			arrList.add(arr[i]);
		}
		
	
		for (Student1 student1 : arr) {
			Info1.display(student1);
		}
		
		for(i=0;i<=2;i++) {
			System.out.println("----------------------------");
			Info1.display(arrList.get(i));
			System.out.println("----------------------------");
		}
	}

}

class Student1 {
	int id;
	String name;
	LocalDate DateOfBirth;
	static String CollegeName;
	String phoneNumber;

	public Student1(int id, String name, LocalDate dateOfBirth, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.DateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

class Info1 {
	static void display(Student1 ref) {
		System.out.println("----------------------------");
		System.out.println("Values From Info Student" + ref.id);
		System.out.println("Student id: " + ref.id);
		System.out.println("Student name: " + ref.name);
		System.out.println("Student dateOfBirth: " + ref.DateOfBirth);
		System.out.println("Student collegeName: " + Student1.CollegeName);
		System.out.println("Student phoneNumber: " + ref.phoneNumber);
		System.out.println("----------------------------");
	}
}

