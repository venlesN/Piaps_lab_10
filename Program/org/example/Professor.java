package org.example;
public class Professor extends ResearchEmployee {


	public void teach() {
		// TODO - implement Professor.teach
		throw new UnsupportedOperationException();
	}

	public String createATrainingProgram() {
		// TODO - implement Professor.createATrainingProgram
		throw new UnsupportedOperationException();
	}

	public int giveMarksToStudents() {
		// TODO - implement Professor.giveMarksToStudents
		throw new UnsupportedOperationException();
	}

	public boolean confirmThemeOfCW(String theme) {
		// TODO - implement Professor.confirmThemeOfCW
		if (theme.isEmpty() || theme.indexOf('1') != -1) {
			System.out.println("Not acceptable theme");
			return false;
		} else{
			System.out.println("Theme confirmed");
			return true;
		}
	}

	public boolean acceptTheCW() {
		// TODO - implement Professor.acceptTheCW
		throw new UnsupportedOperationException();
	}

}