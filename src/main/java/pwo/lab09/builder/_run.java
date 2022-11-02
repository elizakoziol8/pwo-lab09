/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.builder;

import java.util.Scanner;

/**
 *
 * @author opensuse
 */
public class _run {

    public static void main(String[] args) {

        TxtPic1 txtPic = new TxtPic1('.', '*', 20, "txtpic1.txt");
        txtPic.save();

        TxtPic2 txtPic2 = new TxtPic2();
        TxtPic3 txtPic3 = new TxtPic3();

        txtPic2
                .setBackground('_')
                .setForeground('*')
                .setSize(20)
                .setFileName("txtpic2.txt")
                .createTxtPic()
                .save();
        Scanner in = new Scanner(System.in);
        System.out.println("Znak tla: ");
        txtPic3.setBackground(in.next().charAt(0));
        System.out.println("Znak wyswietlanego obrazka: ");
        txtPic3.setForeground(in.next().charAt(0));
        System.out.println("Rozmiar: ");
        txtPic3.setSize(in.nextInt());
        System.out.println("Nazwa pliku wynikowego: ");
        txtPic3.setFileName(in.next().toString()).createTxtPic().save();
    }

}
