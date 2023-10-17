/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import common.AlgorithmShape;
import model.Triangle;
import view.Menu;
/**
 *
 * @author HP
 */
public class ShapeManagement extends Menu<String> {

    static String[] mc = {"Display GUI, Input Data And Perform function", "Exit"};

    protected Library library;
    protected AlgorithmShape algorithm;

    public ShapeManagement() {
        super("=====Calculator Shape Program=====", mc);
        library = new Library();
        algorithm = new AlgorithmShape();

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                algorithm.display(algorithm.inputRectangle(), algorithm.inputCircle(), algorithm.inputTriangle());
                break;
            case 2:
                System.exit(0);
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}
