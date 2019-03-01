package com.ocr.anthony;

import java.lang.reflect.Array;

public class Order {
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
}