package javaTest;

import java.util.Scanner;
/**
 * @author HP
 *
 */

public class Main {

	public static Scanner in = new Scanner(System.in);

	public static void loadObjects(Table[][] calendar, String path) { 	// CREATE Services, Employees,
																		// Calendar(type:Table)

		Services.listEidikotites();
		Services.addAllServices();
		boolean err = true;

		int size = Services.eidikotites.size();
		for (int i = 0; i < size; i++) {
			err = true;
			while (err) {
				try {
					CreateObjects.createServices(path + Services.eidikotites.get(i) + ".txt");
					err = false;
				} catch (NumberFormatException e) {
					System.err.println("����� ������������ �������� ��o �����o " + Services.eidikotites.get(i)
							+ " ��� ���������������!");
					System.err.println("��������� �� ������ ��� ������������ ��!");
					path = in.nextLine();
				}

			}
		}
		err = true;
		while (err) {

			try {
				CreateObjects.createEmployees("C:\\Users\\HP\\Desktop\\java2_\\exe2\\employees.txt");
				err = false;
			} catch (NumberFormatException e) {
				System.err.println("����� ������������ �������� ��o �����o employees ��� ���������������!");
			}
		}

		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 30; j++) {
				Table table = new Table();
				calendar[i][j] = table;
			}
		}
	}

	public static void main(String[] args) throws Exception {

		String clientChoice;
		String identity;
		Table calendar[][] = new Table[13][31];
		int pl = 0;
		loadObjects(calendar, "C:\\Users\\HP\\Desktop\\java2_\\exe2\\");
		Evaluation.loadEvaluation();

		for (;;) {

			System.out.println("���������� / �������");
			if (pl > 1) {
				//in.nextLine();
				identity = in.next();
			} else {
				identity = in.next();
			}

			if (identity.contains("�������")) {

				System.out.println(
						"(1)���������� �������� \n\n(2)�������� �������� \n\n(3)������ �������� \n\n(4)���������� ������������ �������"
								+ "\n---------------------------------------");
				clientChoice = in.next();

				if (clientChoice.contains("����������")) {

					Client.questionsAboutClient();
					String t[] = EnterAppointment.questionsToBegin();
					double dur[] = EnterAppointment.choiceDuration(t);
					String ans = t[0];

					if (ans.equals("1")) {

						EnterAppointment.basedOnDate(t, dur, calendar, "katachorish");

					} else if (ans.equals("2")) {

						EnterAppointment.basedOnDateAndEmp(t, dur, "katachorish", null, calendar);

					} else {
						System.out.println("������ �� ��������� ��� ��� �� ��� ��������!");
					}

					System.out.println("����������� ��������� ��� �������� ��������� ������� �� ��� ����������!"
							+ "\n------------------------------------------------------------------------");
					Evaluation.evaluateProcedure();

				} else if (clientChoice.contains("��������")) {

					int[] del = new int[3];
					String answerdelete = "���";

					while (answerdelete.contains("���")) {
						del = DeleteAndChange.deleteQuestions();
						answerdelete = DeleteAndChange.deleteAppointment(del, calendar);
					}

				} else if (clientChoice.contains("������")) {

					int del2[] = DeleteAndChange.changeQuestions();
					DeleteAndChange.changeAppointment(del2, calendar);

				} else if (clientChoice.contains("����������")) {
					Evaluation.evaluate();

				} else {
					System.out.println("������ �� ��������� ��� ��� ��� �������� ��������");
					System.out.println();
				}

				// JUST CHECKING THE TABLE Table-------------
				System.out.println();
				System.out.println();
				for (int i = 0; i <= 16; i++) {
					for (int j = 0; j <= Employees.employees.size(); j++) {
						System.out.print(calendar[4][1].getTable()[i][j]);
					}
					System.out.println();
				}
				System.out.println();
				System.out.println();
				//--------------------------------------------

			} else if (identity.contains("����������")) {

				System.out.println("(1)������� ����������� \n\n(2)������ ��������� \n\n(�������� 1 � 2)"
						+ "\n-----------------------------");
				String compChoice = in.next();

				if (compChoice.contains("1")) {

					Statistics.statQuestions(args);
					

				} else if (compChoice.contains("2")) {

					System.out.println(
							"(1)������ ��������� ��������� \n\n(2)������ ��������� ��������� \n\n(�������� 1 � 2)"
									+ "\n--------------------------------------------");
					String anscomp = in.next();

					if (anscomp.equals("1")) {
						
						Services.changeServcices();
						
					} else if (anscomp.equals("2")) {
						
						Employees.changeEmployees();
				
					} else {
						System.out.println("������ �� �������� 1 � 2 !!");
					}

				} else {
					System.out.println("������ �� ��������� ��� �� ��� ��� ��������!");
				}

			} else {
				System.out.println("������ �� �������� ����� ��� �������� ��� !");
			}
			pl++;
			System.out.println();
		}

	}

}