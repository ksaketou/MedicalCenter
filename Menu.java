/**
 * 
 */
package ergasia2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author HP
 *
 */
public class Menu {

	static Scanner v = new Scanner(System.in);

	public static String chooseService() {
		System.out.println("�������� �������� �������� \n------------------------------");
		Services.listEidikotites();
		for (int i = 0; i < 22; i++) {
			// System.out.println(Services.eidikotitesoles.get(i).get(0).getCategory());
			System.out.println(Services.eidikotites.get(i));
		}
		String eidikotita = v.nextLine();
		return eidikotita;
	}

	public static String chooseCriterion() {
		boolean ok = false;
		String ans = null;
		while (ok == false) {

			try {
				System.out.println("�������� �������� �� �� �������� ������ �� ����� � ���������� ��� ��������");
				System.out.println(" 1.���� ����������� \n 2.���� ������� ��� �����������");
				ans = wannabeMain.in.next();
				ok = true;

			} catch (InputMismatchException e) {

				System.out.println("insert the number of month and day.");
			}

		}
		return ans;
	}

	public static boolean filterAndPrintServices(String search, String eidikotita) { // ���� ��� ������� �� ����������
																						// ����� ���
																						// ��� ���������
																						// ���������-���������

		// eidikotita = ������ � ��������� ��������� ��� ������� � �������
		boolean flag = true;
		boolean exists = false;
		String exetasi_se_lista;// �� ����� ��� ��������� �������� ��� ��������� ��� ������ ���
		ArrayList<String> exetaseis_list = new ArrayList<String>(); // �� ���������� ��� ������������ �� ����� �� ���
																	// ��������� ��� ������
		if (search.contains("����")) {

			for (int a = 0; a < 22; a++) {
				if (eidikotita.toLowerCase().contains(Services.eidikotites.get(a))) {

					int size = Services.eidikotitesoles.get(a).size();

					for (int i = 0; i < size; i++) {
						System.out.println(Services.eidikotitesoles.get(a).get(i).getName());
						exists = true;
					}
					break;
				}

			}

		} else {
			for (int y = 0; y < 22; y++) {

				if (eidikotita.toLowerCase().contains(Services.eidikotites.get(y))) {

					for (int i = 0; i < Services.eidikotitesoles.get(y).size(); i++) {
						exetasi_se_lista = Services.eidikotitesoles.get(y).get(i).getName();

						if (exetasi_se_lista.toLowerCase().contains(search.toLowerCase())) {
							exetaseis_list.add(exetasi_se_lista);
							exists = true;
						}
					}
					if (exists == false) {
						System.out.println("��� ������� ������ �������");
						flag = false;
					} else {
						System.out.println("�������� ��� ������� ��� ����������");
						for (int k = 0; k < exetaseis_list.size(); k++) {
							System.out.println(exetaseis_list.get(k));
						}
					}

					break; // ������ ��� ��������� ��� ��������� ��� �������� �� �����, ��� ������ ��� ��
							// for ���
							// ������ ��� ������� ����������
				}
			}
		}
		return flag;
	}

}
