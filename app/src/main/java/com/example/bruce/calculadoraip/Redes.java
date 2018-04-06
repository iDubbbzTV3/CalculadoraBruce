package com.example.bruce.calculadoraip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


    public class Redes {
        public String[] IP (String ip, String subnet) {

            String[] datos = new String[7];

            //Paso el String a un arreglo separando por los puntos
            String[] octetos = ip.split(java.util.regex.Pattern.quote("."));

            //Creo enteros con el valor de cada String partida
            int num1 = Integer.parseInt(octetos[0]);
            int num2 = Integer.parseInt(octetos[1]);
            int num3 = Integer.parseInt(octetos[2]);
            int num4 = Integer.parseInt(octetos[3]);

            int subnet0 = Integer.parseInt(subnet);

            int totalips = (int) (Math.pow(2, 32-subnet0)) ;
            int totalhosts = (int) (Math.pow(2, 32-subnet0)-2);
            String Stotallips = (totalips + "");
            String Stotalhosts = (totalhosts + "");


            //Paso los enteros a Strings binarias, cada una con 8 cifras e.g (00011010)
            String binaryString1 = Integer.toBinaryString(num1);
            binaryString1 = binaryString1.substring(binaryString1.length() - 8);

            String binaryString2 = Integer.toBinaryString(num2);
            binaryString2 = binaryString2.substring(binaryString2.length() - 8);

            String binaryString3 = Integer.toBinaryString(num3);
            binaryString3 = binaryString3.substring(binaryString3.length() - 8);

            String binaryString4 = Integer.toBinaryString(num4);
            binaryString4 = binaryString4.substring(binaryString4.length() - 8);

            //Tomo las Strings y creo una unica String e.g(11111111111111110000000011111111)
            String direccionIP = new String(binaryString1 + binaryString2 + binaryString3 + binaryString4);

            //Convierto el String en un arreglo de caracteres
            char[] charArray = direccionIP.toCharArray();

            char[] charArray2 = direccionIP.toCharArray();

            char[] charArray3 = direccionIP.toCharArray();

            //En el for hago la operacion de subnet para hacer todos los ultimos numeros "0"
            for(int i = subnet0; i < 32; i++){
                charArray[i] = '0';
            }

            for(int i = 0; i < subnet0; i++){
                charArray2[i] = '1';
                charArray2[i+subnet0] = '0';
            }

            for(int i = subnet0; i < 32; i++){
                charArray3[i] = '1';

            }

            //Parto el Array de 32 caracteres a 4 arrays de 8 caracteres (para agregarle el punto)
            char[] char1 = new char[8];
            char[] char2 = new char[8];
            char[] char3 = new char[8];
            char[] char4 = new char[8];

            for (int i = 0; i < 8; i++){
                char1[i] = charArray[i];
            }
            for (int i = 0; i < 8; i++){
                char2[i] = charArray[i+8];
            }
            for (int i = 0; i < 8; i++){
                char3[i] = charArray[i+16];
            }
            for (int i = 0; i < 8; i++){
                char4[i] = charArray[i+24];
            }

            //Parto el Array de 32 caracteres a 4 arrays de 8 caracteres (para agregarle el punto)
            char[] char5 = new char[8];
            char[] char6 = new char[8];
            char[] char7 = new char[8];
            char[] char8 = new char[8];

            for (int i = 0; i < 8; i++){
                char5[i] = charArray2[i];
            }
            for (int i = 0; i < 8; i++){
                char6[i] = charArray2[i+8];
            }
            for (int i = 0; i < 8; i++){
                char7[i] = charArray2[i+16];
            }
            for (int i = 0; i < 8; i++){
                char8[i] = charArray2[i+24];
            }

            //Parto el Array de 32 caracteres a 4 arrays de 8 caracteres (para agregarle el punto)
            char[] char9 = new char[8];
            char[] char10 = new char[8];
            char[] char11= new char[8];
            char[] char12 = new char[8];

            for (int i = 0; i < 8; i++){
                char9[i] = charArray3[i];
            }
            for (int i = 0; i < 8; i++){
                char10[i] = charArray3[i+8];
            }
            for (int i = 0; i < 8; i++){
                char11[i] = charArray3[i+16];
            }
            for (int i = 0; i < 8; i++){
                char12[i] = charArray3[i+24];
            }

            //Paso los arreglos de caracteres a Strings binarias
            String caracter1 = new String(char1);
            String caracter2 = new String(char2);
            String caracter3 = new String(char3);
            String caracter4 = new String(char4);

            //Paso los Strings de binarios a Integers
            int foo1 = Integer.parseInt(caracter1, 2);
            int foo2 = Integer.parseInt(caracter2, 2);
            int foo3 = Integer.parseInt(caracter3, 2);
            int foo4 = Integer.parseInt(caracter4, 2);

            //Ahora uno los arrays y les agrego punto entre medio

            String direccionnet = new String(foo1+"."+foo2+"."+foo3+"."+foo4);

            //Paso los arreglos de caracteres a Strings binarias
            String caracter5 = new String(char5);
            String caracter6 = new String(char6);
            String caracter7 = new String(char7);
            String caracter8 = new String(char8);

            //Paso los Strings de binarios a Integers
            int foo5 = Integer.parseInt(caracter5, 2);
            int foo6 = Integer.parseInt(caracter6, 2);
            int foo7 = Integer.parseInt(caracter7, 2);
            int foo8 = Integer.parseInt(caracter8, 2);

            //Ahora uno los arrays y les agrego punto entre medio

            String direccionmascara = new String(foo5 + "." + foo6 + "." + foo7 + "." + foo8);

            //Paso los arreglos de caracteres a Strings binarias
            String caracter9 = new String(char9);
            String caracter10 = new String(char10);
            String caracter11 = new String(char11);
            String caracter12 = new String(char12);

            //Paso los Strings de binarios a Integers
            int foo9 = Integer.parseInt(caracter9, 2);
            int foo10 = Integer.parseInt(caracter10, 2);
            int foo11 = Integer.parseInt(caracter11, 2);
            int foo12 = Integer.parseInt(caracter12, 2);

            //Ahora uno los arrays y les agrego punto entre medio

            String direccionbroadcast = new String(foo9 + "." + foo10 + "." + foo11 + "." + foo12);


            datos[0] = Stotallips; //Cantidad de redes
            datos[1] = Stotalhosts; //Cantidad de hosts
            datos[2] = direccionnet; //Net ID
            datos[3] = direccionmascara; //Mascara de red


            return datos;
        }
    }

