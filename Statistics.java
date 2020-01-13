import java.util.stream.IntStream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.IntSummaryStatistics;
import java.text.DecimalFormat;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import java.util.Scanner;

public class Statistics extends Application {

	private static DecimalFormat df2 = new DecimalFormat("#.##");
	static Scanner sc = new Scanner(System.in);
	static JFrame frame3;
	static JFrame frame2 = new JFrame("����������");

	
	public void start(Stage primaryStage) throws Exception {

		CategoryAxis xAxis = new CategoryAxis();
		
		xAxis.setLabel("���������");

		NumberAxis yAxis = new NumberAxis();

		yAxis.setLabel("����������");

		// Create a BarChart

		BarChart<String, Number> barChart = new BarChart<String, Number>(xAxis, yAxis);

		XYChart.Series<String, Number> dataSeries1 = new XYChart.Series<String, Number>();

		dataSeries1.setName("2019-2020");


		dataSeries1.getData().add(new XYChart.Data<String, Number>("aimatologikes", Menu.sum_categories[0]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("aktinografies", Menu.sum_categories[1]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("allergiologikes", Menu.sum_categories[2]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("anosologikes", Menu.sum_categories[3]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("axonikestomogr", Menu.sum_categories[4]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("biochimikes", Menu.sum_categories[5]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("gastrenterologikes", Menu.sum_categories[6]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("gynaikologikes", Menu.sum_categories[7]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("ourwn", Menu.sum_categories[8]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("kalliergeies", Menu.sum_categories[9]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("kardiologikes", Menu.sum_categories[10]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("magnitikestomogr", Menu.sum_categories[11]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("mastografies", Menu.sum_categories[12]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("mikroviologikes", Menu.sum_categories[13]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("neurologikes", Menu.sum_categories[14]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("ormonikes", Menu.sum_categories[15]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("progennitikos", Menu.sum_categories[16]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("yperichoi", Menu.sum_categories[17]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("checkup", Menu.sum_categories[18]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("doppler", Menu.sum_categories[19]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("triplex", Menu.sum_categories[20]));

		dataSeries1.getData().add(new XYChart.Data<String, Number>("paketa", Menu.sum_categories[21]));

		// Add Series to BarChart.

		barChart.getData().add(dataSeries1);

		barChart.setTitle("������� ���������� ��� ��������");

		VBox vbox = new VBox(barChart);

		primaryStage.setTitle("BarChart");

		Scene scene = new Scene(vbox, 800, 600);

		primaryStage.setScene(scene);

		primaryStage.setHeight(600);

		primaryStage.setWidth(700);

		primaryStage.show();

		// set color in bars

		Node n = barChart.lookup(".data0.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data1.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data2.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data3.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data4.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data5.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data6.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data7.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data8.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data9.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data10.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data11.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data12.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data13.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data14.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data15.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data16.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data17.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data18.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data19.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data20.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		n = barChart.lookup(".data21.chart-bar");

		n.setStyle("-fx-bar-fill: red");

		Stage stage = new Stage();

		IntStream stream = IntStream.of(Menu.sum_categories);

		IntSummaryStatistics stats = stream.summaryStatistics();

		Scene scene1 = new Scene(new Group());

		stage.setTitle("������� ��������� %");

		stage.setWidth(500);

		stage.setHeight(500);

		ObservableList<PieChart.Data> pieChartData =

				FXCollections.observableArrayList(
						
						new PieChart.Data("�������������", Menu.sum_categories[0] / ((double) stats.getSum()) * 100),

						new PieChart.Data("�������������", Menu.sum_categories[1] / ((double) stats.getSum()) * 100),

						new PieChart.Data("���������������", Menu.sum_categories[2] / ((double) stats.getSum()) * 100),

						new PieChart.Data("������������", Menu.sum_categories[3] / ((double) stats.getSum()) * 100),

						new PieChart.Data("�������� �����������",
								Menu.sum_categories[4] / ((double) stats.getSum()) * 100),

						new PieChart.Data("����������", Menu.sum_categories[5] / ((double) stats.getSum()) * 100),

						new PieChart.Data("������������������",
								Menu.sum_categories[6] / ((double) stats.getSum()) * 100),

						new PieChart.Data("��������������", Menu.sum_categories[7] / ((double) stats.getSum()) * 100),

						new PieChart.Data("�����", Menu.sum_categories[8] / ((double) stats.getSum()) * 100),

						new PieChart.Data("������������", Menu.sum_categories[9] / ((double) stats.getSum()) * 100),

						new PieChart.Data("�������������", Menu.sum_categories[10] / ((double) stats.getSum()) * 100),

						new PieChart.Data("���������� �����������",
								Menu.sum_categories[11] / ((double) stats.getSum()) * 100),

						new PieChart.Data("������������", Menu.sum_categories[12] / ((double) stats.getSum()) * 100),

						new PieChart.Data("���������������", Menu.sum_categories[13] / ((double) stats.getSum()) * 100),

						new PieChart.Data("������������", Menu.sum_categories[14] / ((double) stats.getSum()) * 100),

						new PieChart.Data("���������", Menu.sum_categories[15] / ((double) stats.getSum()) * 100),

						new PieChart.Data("������������� �������",
								Menu.sum_categories[16] / ((double) stats.getSum()) * 100),

						new PieChart.Data("��������", Menu.sum_categories[17] / ((double) stats.getSum()) * 100),

						new PieChart.Data("checkup", Menu.sum_categories[18] / ((double) stats.getSum()) * 100),

						new PieChart.Data("doppler", Menu.sum_categories[19] / ((double) stats.getSum()) * 100),

						new PieChart.Data("triplex", Menu.sum_categories[20] / ((double) stats.getSum()) * 100),

						new PieChart.Data("������", Menu.sum_categories[21] / ((double) stats.getSum()) * 100)
						);

		final PieChart chart = new PieChart(pieChartData);

		chart.setStartAngle(180);

		chart.setTitle("������� ��������� % ");

		((Group) scene1.getRoot()).getChildren().add(chart);

		stage.setScene(scene1);

		stage.show();

	}

	public static void generalResults() throws Exception {

		IntStream stream = IntStream.of(Menu.sum_categories);

		IntSummaryStatistics stats = stream.summaryStatistics();

		int max = (int) stats.getMax();

		String po = Integer.toString(max);

		int min = (int) stats.getMin();

		String min1 = Integer.toString(min);

		int avg = (int) stats.getAverage();

		String avg1 = Integer.toString(avg);

		int k = (int) stats.getCount();

		String p = Integer.toString(k);

		int num = (int) stats.getSum();

		String num1 = Integer.toString(num);
		
		JOptionPane.showMessageDialog(frame2,"� ���������  ������� ���������  �����: "+p
		                              +"\r\n � ���������  ������� ����������  �����: "+num1
				                      +"\r\n � �������� �� ��� ���������� ������ ����������� ������� ������ ����������: "+po
		                              +"\r\n � �������� �� ��� ��������� ������ ����������� �������� ������ ����������: "+min1
		                              +"\r\n � ����� ���� ���������� ��� ���� ��� ��������� �����: "+avg1);
	

	}

	public static void evaluationResults() throws Exception {

		// ���������� ������������ �������

		double[] mo = new double[4];

		double[] mo2 = new double[2];

		double max2 = 0;

		double min2 = 0;

		int answer = 0;

		int answer2 = 0;

		StringBuilder text = new StringBuilder();
		text.append("���������� ������������ �������:");
		text.append("\r\n\r\n� ����� ���� ��� ���� ������� �����:" + "\r\n");
		for (int j = 0; j < 4; j++) {

			// ��� ���� ������� ��� ��� ������ ��� ��� ���������� ��� ���� ��� ����
			// ���������

			mo[j] = Evaluation.sumscenter[j][0] / Evaluation.sumscenter[j][1];

			String m = Double.toString(mo[j]);
			
			text.append("�������" + (j + 1) + "  \"" + Evaluation.questions.get(j) + "\":  " + m + "\r\n");

			if (mo[j] > max2) {

				max2 = mo[j];

				answer = j + 1;

			}

			if (mo[j] < min2) {

				min2 = mo[j];

				answer2 = j + 1;

			}

		}
		JOptionPane.showMessageDialog(frame2,text.toString());

		JOptionPane.showMessageDialog(frame2,
				"� ������� ��� ����������� ���� ���� ��� ��� ���������� ���������� ����� �: \r\n" + (answer2 + 1) + "--> \""
						+ Evaluation.questions.get(answer2) + "\"  " + "  �� ���� ��� ���������: " + min2
						+ "\r\n\r\n� ������� ��� ����������� ���� ���� ��� ��� ��������� ���������� ����� �: \r\n"
						+ (answer + 1) + "--> \"" + Evaluation.questions.get(answer) + "\" " + "   �� ���� ��� ���������: "
						+ max2);

		for (int k = 0; k < Evaluation.questions2.size(); k++) {
/*
			mo2[k] = Evaluation.sumsapp[k][0];
			String m = Double.toString(mo2[k]);
			mo2[k] = Evaluation.sumsapp[k][1];
			String mkl = Double.toString(mo2[k]);
*/
			JOptionPane.showMessageDialog(frame2, "������ ���������� ���� ������� (����������� �����������):\r\n " +
			(k + 1) + "--> " + "\"" + Evaluation.questions2.get(k) +"\""
					+ "\r\n\r\n" + "������� ����������:  " + Evaluation.sumsapp[k][0] + "\r\n" + "��������� ����������:  " + Evaluation.sumsapp[k][1]);

		}

	}

	private static void servicesResults() {

		// TODO Auto-generated method stub
		StringBuilder text = new StringBuilder();
		text.append("���������� ���������:"+"\r\n\r\n");
		text.append("������� ��������� (f%) ��� ��� ��������: " + "\r\n\r\n");

        IntStream stream = IntStream.of(Menu.sum_categories);

		IntSummaryStatistics stats = stream.summaryStatistics();

		double maxf = 0;

		double minf = (Menu.sum_categories[0] / (double) stats.getSum()) * 100;

		
		for (int i = 0; i < 22; i++) {

			double q = Menu.sum_categories[i] / ((double) stats.getSum()) * 100;

			String doubl = df2.format(q);
            text.append("-" + Services.eidikotites.get(i) + ":    "  +  doubl  +  "%"+"\r\n");


			if (Menu.sum_categories[i] / (double) stats.getSum() * 100 > maxf) {

				maxf = Menu.sum_categories[i] / (double) stats.getSum() * 100;

			}

			if (Menu.sum_categories[i] / (double) stats.getSum() * 100 < minf) {

				minf = Menu.sum_categories[i] / (double) stats.getSum() * 100;

			}

		}
		JOptionPane.showMessageDialog(frame2,text.toString());
		String nb = df2.format(maxf);

		String bn = df2.format(minf);
	    JOptionPane.showMessageDialog(frame2,  "� ������� ������� ���������(f%) ����� :"+nb+"%"
				                               +"\r\n � �������� ������� ���������(f%) �����:"+bn+"%");
	
	}

	public void generalResults(Stage primaryStage) throws Exception {

		// TODO Auto-generated method stub

	}

	public static void statQuestions(String [] ar) throws Exception {

		String asd = JOptionPane.showInputDialog(frame3, "�������� �������� ���� ������������ ����������:"

				+ "\r\n 1.������ ����������"

				+ "\r\n 2.���������� ���������"

				+ "\r\n 3.���������� �����������"

				+ "\r\n 4. ����������� ��� ������� ���������");

		while (asd.equals("1") || asd.equals("2") || asd.equals("3") || asd.equals("4")) {

			if (asd.equals("1")) {

				Statistics.generalResults();

			} else if (asd.equals("2")) {

				servicesResults();
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			} else if (asd.equals("3")) {

				Statistics.evaluationResults();

			} else if (asd.equals("4")) {

				launch(ar);

			}

			asd = JOptionPane.showInputDialog(frame3,
					"�������� �������� ���� ������������ ����������: " + "\r\n 1.������ ����������"

							+ "\r\n 2.���������� ���������"

							+ "\r\n 3.���������� �����������"

							+ "\r\n 4. ����������� ��� ������� ���������" + "\r\n (�������� 0 ��� �����)");

		}

	}

}
		