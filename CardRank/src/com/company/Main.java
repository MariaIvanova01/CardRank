package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(scan.nextLine() + ":");

        Arrays.stream(CardRank.values())
                .forEach(cardRank -> System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name()));
    }
}
