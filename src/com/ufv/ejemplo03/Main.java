package com.ufv.ejemplo03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();


        System.out.println("Escribe tu nombre");
        p.setNombre(sc.nextLine());

        System.out.println("Escribe tus apellidos");
        p.setApellidos(sc.nextLine());

        System.out.println("Escribe tu dni");
        p.setDni(Integer.parseInt(sc.nextLine()));

        System.out.println("Escribe tu edad:");
        p.setEdad(Integer.parseInt(sc.nextLine()));


        System.out.println("Hola: " + p.getNombre());
        System.out.println("Apellidos: " + p.getApellidos());
        System.out.println("Dni: " + p.getDni());
        System.out.println("Edad: " + p.getEdad());


    }
}
