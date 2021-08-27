
class Employee 
{
	int employeeNumber;
	String employeeName;
	String departmentName;
	String designation;
	double salary;
	int age;

	public Employee(int employeeNumber, String employeeName, String departmentName, String designation, double salary,
			int age) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.departmentName = departmentName;
		this.designation = designation;
		this.salary = salary;
		this.age = age;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", departmentName="
				+ departmentName + ", designation=" + designation + ", salary=" + salary + ", age=" + age + "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class PassByReference {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Rajesh", "QMS", "Analyst", 5000, 25);

		System.out.println("e1 " + e1.hashCode());
		System.out.println("e1 " + e1);

		Company.meetingWithHr(e1);// call by value

		System.out.println("now e1 : " + e1);

		Employee e2 = new Employee(102, "Sanju", "Coding", "Developer", 5000, 25);
		Employee e3 = new Employee(103, "Circuit", "Testing", "Tester", 3000, 22);

		Company.gossip(e2, e3);

		Applicant theApplicant1 = new Applicant();
		Applicant theApplicant2 = new Applicant();
		Applicant theApplicant3 = new Applicant();

		ApplicationForm appForm1 = new ApplicationForm("Rahul G", 50, "BE+2YrsExp");
		theApplicant1.setAppForm(appForm1);

		ApplicationForm appForm2 = new ApplicationForm("Eknath S", 55, "BE+2YrsExp");
		theApplicant2.setAppForm(appForm2);

		ApplicationForm appForm3 = new ApplicationForm("Narayan R", 65, "BE+2YrsExp");
		theApplicant3.setAppForm(appForm3);

		Employee e4 = Company.interviewWithHr(theApplicant1);
		System.out.println("e4 : " + e4);
	

	}

}


class Company {
	static int id1 = 1;

	static void meetingWithHr(Employee ref) // using Employee for the sake of execution here
	{
		System.out.println("meetingWithHr ->ref " + ref.hashCode());
		ref.setSalary(ref.getSalary() * 1.1);
	}

	static void gossip(Employee ref1, Employee ref2) {
		System.out.println(ref2.getEmployeeName() + " is finding salary of " + ref1.getEmployeeName());
		if (ref2.getSalary() < ref1.getSalary()) {
			System.out.println(
					ref2.getEmployeeName() + "'s salary is lesser than " + ref1.getEmployeeName() + "'s salary");
		} else {
			System.out.println(
					ref2.getEmployeeName() + "'s salary is higher than " + ref1.getEmployeeName() + "'s salary");
		}
	}

	static Employee interviewWithHr(Applicant app) {
		Employee eObj = null;
		int years = Integer.parseInt(app.appForm.getQualificationCriteria().substring(3, 4));
		System.out.println(years);
		String qualification = app.appForm.getQualificationCriteria().substring(0, 2);
		System.out.println(qualification);
		if (qualification.equalsIgnoreCase("BE") && years == 2) {
			System.out.println("HR..discussing with .." + app.appForm.getApplicantName());
			eObj = new Employee(id1++, app.appForm.getApplicantName(), "Coding", "Developer", 5500,
					app.appForm.getApplicantAge());
		}

		
		return eObj;
	}
}

class Form {

}

class ApplicationForm extends Form {
	String applicantName;
	int applicantAge;
	String qualificationCriteria;

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public int getApplicantAge() {
		return applicantAge;
	}

	public void setApplicantAge(int applicantAge) {
		this.applicantAge = applicantAge;
	}

	public ApplicationForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplicationForm(String applicantName, int applicantAge, String qualificationCriteria) {
		super();
		this.applicantName = applicantName;
		this.applicantAge = applicantAge;
		this.qualificationCriteria = qualificationCriteria;
	}

	public String getQualificationCriteria() {
		return qualificationCriteria;
	}

	public void setQualificationCriteria(String qualificationCriteria) {
		this.qualificationCriteria = qualificationCriteria;
	}

}

class Applicant {
	ApplicationForm appForm = new ApplicationForm();

	public ApplicationForm getAppForm() {
		return appForm;
	}

	public void setAppForm(ApplicationForm appForm) {
		this.appForm = appForm;
	}

}
