package com.ocr.anthony;

import java.util.Scanner;

public class Order {

    Scanner sc = new Scanner(System.in);


    /**
     * Run asking process for several menus.
     */
    public void runMenus() {
        System.out.println("Combien souhaitez vous commander de menu ?");
        int menuQuantity = sc.nextInt();
        for (int i = 0; i < menuQuantity; i++) {
            runMenu();
        }
    }

    /**
     * Run asking process for a menu.
     */
    public void runMenu() {
        this.displayAvailableMenu();
        int nbMenu;
        do {
            nbMenu = sc.nextInt();
            this.displaySelectedMenu(nbMenu);
            switch (nbMenu) {
                case 1:
                    askSide(true);
                    askDrink();
                    break;
                case 2:
                    askSide(true);
                    break;
                case 3:
                    askSide(false);
                    askDrink();
                    break;
            }
        } while (nbMenu < 1 || nbMenu > 3);
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
    /**
     * Display a question about menu in the standard input, get response and display it
     */
    public void askMenu() {
        String[] menus = {"poulet", "boeuf", "végétarien"};
        Interaction.askSomething("menu", menus);
    }

    /**
     * Display a question about side in the standard input, get response and display it
     */
    public void askSide(boolean allSidesEnable) {
        if (allSidesEnable) {
            String[] responsesAllSide = {"légumes frais", "frites", "riz"};
            Interaction.askSomething("accompagnement", responsesAllSide);
        } else {
            String[] responsesOnlyRice = {"riz", "pas de riz"};
            Interaction.askSomething("accompagnement", responsesOnlyRice);
        }
    }

    /**
     * Display a question about drink in the standard input, get response and display it
     */
    public void askDrink() {
        String[] responsesDrink = {"eau plate", "eau gazeuse", "soda"};
        Interaction.askSomething("boisson", responsesDrink);
    }
}