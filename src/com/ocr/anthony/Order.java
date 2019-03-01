package com.ocr.anthony;

import java.util.Scanner;

public class Order {
    /**
     * Run asking process for a menu.
     */
    /**
     * Run asking process for a menu.
     */
    public void runMenu() {
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nbMenu = sc.nextInt();
        this.displaySelectedMenu(nbMenu);
        switch (nbMenu) {
            case 1:
                displayAvailableSide(true);
                int nbSide = sc.nextInt();
                displaySelectedSide(nbSide, true);
                displayAvailableDrink();
                int nbDrink = sc.nextInt();
                displaySelectedDrink(nbDrink);
                break;
            case 2:
                displayAvailableSide(true);
                nbSide = sc.nextInt();
                displaySelectedSide(nbSide, true);
                break;
            case 3:
                displayAvailableSide(false);
                nbSide = sc.nextInt();
                displaySelectedSide(nbSide, false);
                displayAvailableDrink();
                nbDrink = sc.nextInt();
                displaySelectedDrink(nbDrink);
                break;
        }
    }
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu:");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {

        String[] menus = {"poulet" ,"boeuf", "végétarien"};

        if(nbMenu > 0 && nbMenu <= 3) {
            System.out.println("Vous avez choisi comme menu : " + menus[nbMenu-1]);
        } else {
            System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
        }
    }
    /**
     * Display all available sides depending on all sides enable or not.
     * All sides = vegetables, frites and rice
     * No all sides = rice or not
     * @param allSideEnable enable display for all side or not
     */
    public void displayAvailableSide(boolean allSideEnable) {
        System.out.println("Choix accompagnement");
        if (allSideEnable) {
            System.out.println("1 - légumes frais");
            System.out.println("2 - frites");
            System.out.println("3 - riz");
        } else {
            System.out.println("1 - riz");
            System.out.println("2 - pas de riz");
        }
        System.out.println("Que souhaitez-vous comme accompagnement ?");
    }
    /**
     * Display a selected side depending on all sides enable or not.
     * All sides = vegetables, frites and rice
     * No all sides = rice or not
     * @param nbSide The selected Side
     * @param allSidesEnable  enable display for all side or not
     */
    public void displaySelectedSide(int nbSide, boolean allSidesEnable) {

        if( (allSidesEnable && (nbSide < 1 || nbSide > 3)) || (!allSidesEnable && (nbSide < 1 || nbSide > 2)) ) {

            System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");

        } else {

            String[] sides = {"légumes frais", "frites", "riz", "pas de riz"};
            int index;

            if (!allSidesEnable) index = nbSide + 1;
            else index = nbSide -1;

            System.out.println("Vous avez choisi comme accompagnement : " + sides[index]);

        }
    }
    /**
     * Display all available drinks in the restaurant
     */
    public void displayAvailableDrink() {
        System.out.println("Choix boisson");
        System.out.println("1 - eau plate");
        System.out.println("2 - eau gazeuse");
        System.out.println("3 - soda");
        System.out.println("Que souhaitez-vous comme boisson ?");
    }
    /**
     * Display a selected drink
     * Drinks are eau plate, eau gazeuse, soda
     * @param nbDrink The selected drink
     */
    public void displaySelectedDrink(int nbDrink) {

        String[] drinks = {"eau plate" ,"eau gazeuse", "soda"};

        if(nbDrink > 0 && nbDrink <= 3) {
            System.out.println("Vous avez choisi comme boisson : " + drinks[nbDrink-1]);
        } else {
            System.out.println("Vous n'avez pas choisi de boisson parmi les choix proposés");
        }
    }
}