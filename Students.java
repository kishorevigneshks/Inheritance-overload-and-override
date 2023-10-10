package Assignments;

public class Students {

	public void getStudentInfo(int id1, int id2) {
		System.out.println("Students id's are: " + id1 + " " + id2);

	}

	public void getStudentInfo(int id3, String name) {
		System.out.println("Students id3 and name: " + id3 + " " + name);
	}

	public void getStudentInfo(String mail, int phone) {
		System.out.println("Students mailid and phonenumber: " + mail + " " + phone);
	}

	public static void main(String[] args) {

		Students obj = new Students();
		obj.getStudentInfo(9063, 9068);
		obj.getStudentInfo(9062, "Magesh");
		obj.getStudentInfo("kittu@mailid", 1234567789);

	}

}
