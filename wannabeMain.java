/**
 * 
 */
package ergasia2;

import java.util.Scanner;

/**
 * @author HP
 *
 */
public class wannabeMain {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Table calendar[][] = new Table[13][31];
		Main.loadObjects(calendar, "C:\\Users\\HP\\Desktop\\java2_\\exe2\\");
		
		
		//System.out.println(Services.eidikotitesoles.get(2).get(2).getCost());
		

		for (;;) {
			//System.out.println("����������     /     �������");
			//String identity = in.next();

			//if (identity.contains("�������")) {

				System.out.println(
						"(1)���������� �������� \n\n(2)�������� �������� \n\n(3)������ �������� \n\n(4)���������� ������������ �������"
								+ "\n------------------------------------");
				String clientChoice = in.next();

				if (clientChoice.contains("����������")) {
					

					  // ���� ����� ���� ��� �� ���������� �� ����� ������������� � Table
					  System.out.println(); System.out.println(); System.out.println();
					  System.out.println(); System.out.println(); System.out.println();
					  System.out.println(); System.out.println(); for (int i = 0; i <= 16; i++) {
					  for (int j = 0; j <= Employees.employees.size(); j++) {
					  System.out.print(calendar[4][1].getTable()[i][j]); } System.out.println(); }

					Client.questionsAboutClient();
					String t[] = EnterAppointment.questionsToBegin();
					double dur[] = EnterAppointment.choiceDuration(t);
					String ans = t[0];

					if (ans.equals("1")) {

						EnterAppointment.basedOnDate(t, dur, calendar);

					} else {

						String kat = "katachorish";
						EnterAppointment.basedOnDateAndEmp(t, dur, kat, null, calendar);

					}

				} else if (clientChoice.contains("��������")) {

					int[] del = new int[3];

					del = DeleteAndChange.deleteQuestions();
					DeleteAndChange.deleteAppointment(del, calendar);

				} else if (clientChoice.contains("������")) {

				} else if (clientChoice.contains("����������")) {

				}

			    
				  // ���� ����� ���� ��� �� ���������� �� ����� ������������� � Table
				  System.out.println(); System.out.println(); System.out.println();
				  System.out.println(); System.out.println(); System.out.println();
				  System.out.println(); System.out.println(); for (int i = 0; i <= 16; i++) {
				  for (int j = 0; j <= Employees.employees.size(); j++) {
				  System.out.print(calendar[4][1].getTable()[i][j]); } System.out.println(); }
				 

			/*} else {

				System.out.println("*������� ����������� \n*������ ���������");
				String answer = in.next();
				if (answer.contains("������� �����������")) {
					
				} else {
					System.out.println("*������ ��������� ��������� \n ������ ��������� ���������");
					String answer1 = in.next();
					if (answer1.contains("������ ��������� ���������")) {
						
					} else {
						
					}

				}
			}*/
		}
		
		
		
		
		/*
		Employees emp1 = new Employees("  ��������������  ", "�������������");
		Employees emp2 = new Employees("������  ", "doppler");
		Employees emp3 = new Employees("���������  ", "triplex");
		Employees emp4 = new Employees("����������  ", "�������������");
		Employees emp5 = new Employees("�������  ", "������������");

		Employees.listEmployees(emp1);
		Employees.listEmployees(emp2);
		Employees.listEmployees(emp3);
		Employees.listEmployees(emp4);
		Employees.listEmployees(emp5);
		*/

		
		
		/*
		 * Services s = new Services("������ ������� �������", 4,
		 * "������������� ���������", 5); Services.addAimat(s); Services h = new
		 * Services("������������", 75, "������������� ���������", 1);
		 * Services.addAimat(h); Services g = new Services("�����������", 15,
		 * "�������������", 1); Services.addAimat(g); Services k = new
		 * Services("������������ �2", 65, "�������������", 5); Services.addAimat(k);
		 * Services f = new Services("����� �����������", 5 ,"�������������", 5);
		 * Services.addAimat(f);
		 */

		
		
		
		/*
		 * 
		 * String t [] = EnterAppointment.questionsToBegin();
		 * 
		 * int dur = EnterAppointment.choiceDuration(t);
		 * 
		 * //System.out.println(calendar[4][7].checkingFreehours(calendar[4][7].getTable
		 * (), t[1], dur));
		 * 
		 * String ans = t[0];
		 * 
		 * if (ans.equals("1")) { EnterAppointment.basedOnDate(t, dur, calendar); } else
		 * { String kat= "katachorish"; EnterAppointment.basedOnDateAndEmp(t, dur, kat,
		 * null, calendar); }
		 * 
		 * for (int i = 0; i <= 16 ; i++) { for (int j = 0; j <=
		 * Employees.employees.size(); j++) {
		 * System.out.print(calendar[4][1].getTable()[i][j]); } System.out.println(); }
		 * }
		 * 
		 */

		
		
		
		/*
		 * 
		 * System.out.print(calendar[1][20].getTable()[5][2]); boolean b =
		 * calendar[1][20].getTable()[5][2].contains("���"); if (b) {
		 * System.out.println("dfghjui"); }
		 * 
		 * 
		 * for (int i = 0; i <= 16 ; i++) {
		 * 
		 * for (int j = 0; j <= Employees.employees.size(); j++) {
		 * 
		 * System.out.print(calendar[1][20].getTable()[i][j]); } System.out.println(); }
		 * 
		 * 
		 */

		
		
		/*
		 * for (int i = 0; i <= 16 ; i++) {
		 * 
		 * for (int j = 0; j <= Employees.employees.size(); j++) {
		 * System.out.print(table.getTable()[i][j]); } System.out.println(); }
		 * 
		 * 
		 * for (int i = 0; i <= 16 ; i++) {
		 * 
		 * for (int j = 0; j <= Employees.employees.size(); j++) {
		 * 
		 * System.out.print(calendar[1][20].getTable()[i][j]); } System.out.println(); }
		 * 
		 * 
		 * 
		 * for (int i = 0; i < Employees.employees.size(); i++) {
		 * System.out.println(Employees.employees.get(i));
		 * System.out.println(Employees.employees.get(i).getDoc_name());
		 * System.out.println(Employees.employees.get(i).getSpecialty());
		 * 
		 * }
		 */

		
		
		// String a = Menu.choosecriterion();
		// System.out.println(a);

		
		
		/*
		 * System.out.println(Services.getAimatologikes()); Services f =
		 * Services.aimatologikes.get(0); System.out.println(f.toString());
		 * 
		 * 
		 * for (int i=0;i<=1;i++) { for (int j=0;j<=1;j++) { Calendar.ap[i][j] = new
		 * Appointments2();
		 * Calendar.ap[i][j].wannabetoString(Calendar.ap[i][j].getTable()); } }
		 * 
		 */

		
		
		/*
		 * Calendar.ap[1][1].wannabetoString(Calendar.ap[1][1].getTable());
		 * 
		 */

		
		
		/*
		 * CreatesServicesLists.createsAimatologikes();
		 * System.out.println(Services.getAimatologikes());
		 */
		
		
		
		/*
		 * CreatesServicesLists.createsAllergiologikes();
		 * System.out.println(Services.allergiologikes.get(5));
		 * System.out.println(Services.getAllergiologikes());
		 * 
		 */

		
		
		/*
		 * Appointments2.createTable(); for (int i = 1; i <= 16 ; i++) { for (int j = 1;
		 * j < Employees.employees.size(); j++) {
		 * System.out.print(Appointments2.table[i][j]); } System.out.println(); }
		 */
	}

}
