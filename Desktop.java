package Assignments;

public class Desktop extends computer {
	public void desktopSize() {
		System.out.println("DesktopSize: 7inch");
	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}

}
