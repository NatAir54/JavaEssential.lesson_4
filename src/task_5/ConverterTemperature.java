package task_5;

import java.util.Scanner;

public class ConverterTemperature {
    public static void main(String[] args) {
        int TC;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение в градусах Цельсия:");
        TC = scan.nextInt();

        ConverterTemperature.convert(TC);
    }

    public static void convert(int TC) {
        // Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
        //TF = 1.8 * TC + 32
        double TF = 1.8 * TC + 32;
        System.out.println("Температура в градусах Фаренгейта: " + TF);

        // Перевод градусов Цельсия в Кельвина: добавляем 273.15 к температуре Цельсия
        double TK = TC + 273.15;
        System.out.println("Температура по Кельвину: " + TK);
    }
}
