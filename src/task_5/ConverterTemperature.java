package task_5;

import java.util.Scanner;

public class ConverterTemperature {
    public static void main(String[] args) {
        int TC;
        Scanner scan = new Scanner(System.in);
        System.out.println("������� �������� � �������� �������:");
        TC = scan.nextInt();

        ConverterTemperature.convert(TC);
    }

    public static void convert(int TC) {
        // ����������� �� ������� TC � ����������� �� ���������� TF ������� ��������� ������������:
        //TF = 1.8 * TC + 32
        double TF = 1.8 * TC + 32;
        System.out.println("����������� � �������� ����������: " + TF);

        // ������� �������� ������� � ��������: ��������� 273.15 � ����������� �������
        double TK = TC + 273.15;
        System.out.println("����������� �� ��������: " + TK);
    }
}
