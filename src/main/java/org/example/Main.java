package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String surname = scanner.nextLine();
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите отчество: ");
        String patronymic = scanner.nextLine();

        System.out.println("Введите дату рождения(YYYY-MM-DD):");
        String birthDateString = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateString);

        Person person = new Person(name, surname, patronymic, birthDate);
        person.showInfo();

        scanner.close();
    }
}