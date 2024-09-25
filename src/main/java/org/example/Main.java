package org.example;

import org.example.MODELOS.Apartamentos;

import java.util.Scanner;

//datos apartamento, mostrar
public class Main {
    public static void main(String[] args) {
        System.out.println("**************");
        System.out.println("APARTAMENTOS");
        System.out.println("**************");

        System.out.println("\n¡¡¡Bienvenido!!!");

        Scanner lea=new Scanner(System.in);
        Apartamentos apartamento=new Apartamentos();
        System.out.print("INGRESE NUMERO DEL APARTAMENTO: ");
        apartamento.setNumeroapartamento(lea.nextInt());

        System.out.print("INGRESE EL AREA: ");
        apartamento.setSuperficiemetros(lea.nextDouble());

        System.out.print("INGRESE NUMERO DE HABITACIONES: ");
        apartamento.setNumeroHbitaciones(lea.nextInt());

        System.out.print("INGRESE NUMERO DE BAÑOS: ");
        apartamento.setNumeroBaños(lea.nextInt());

        System.out.print("INGRESE PRECIO DEL ALQUILER: ");
        apartamento.setPrecioAlquiles(lea.nextDouble());


        System.out.print("¿TIENE BALCÓN? (TRUE PARA SI, FALSE PARA NO): ");
        apartamento.setTieneBalcon(lea.nextBoolean());

        System.out.print("¿ESTÁ DISPONIBLE? (TRUE PARA SI, FALSE PARA NO): ");
        apartamento.setDisponibilidad(lea.nextBoolean());

        System.out.println(apartamento);
    }
}