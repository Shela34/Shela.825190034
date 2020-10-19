package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] daftarfilm = {"1. Dilan 1990", "2. Frozen 2", "3. Imperfect", "4. Milea"};
        int Harga;
        int total; int no;
        System.out.println("Welcome to BESS CINEMA");
        System.out.println("****************************************");
        System.out.println("1. Lihat Detail Film");
        System.out.println("2. Pesan Tiket");
        System.out.println("Menu yang dipilih : ");

        int pilihan =scan.nextInt();
            if (pilihan == 1){
                System.out.println("Pilihan Film : ");
                System.out.println("1. Dilan 1990");
                System.out.println("2. Frozen 2");
                System.out.println("3. Imperfect");
                System.out.println("4. Milea");
                System.out.println("Jam Tayang : ");
                System.out.println("1. Dilan 1990 (09.00 , 13.00 , 17.00 , 21.00) Teater 1");
                System.out.println("2. Frozen 2 (09.00 , 13.00 , 17.00 , 21.00) Teater 4");
                System.out.println("3. Imperfect (09.00 , 13.00 , 17.00 , 21.00) Teater 3");
                System.out.println("4. Milea (09.00 , 13.00 , 17.00 , 21.00) Teater 2");
            }
            if(pilihan == 2){
                for(int i=0;i<daftarfilm.length;i++){
                    System.out.println(daftarfilm[i]);
                }
                no= scan.nextInt();
                System.out.println("Waktu Tayang");
                System.out.println("1. 09.00");
                System.out.println("2. 13.00");
                System.out.println("3. 17.00");
                System.out.println("4. 21.00");

                int jam = scan.nextInt();
                System.out.println("Film yang dipilih: "+daftarfilm[no-1].substring(3, daftarfilm[no-1].length()));
                if(jam == 1){
                    System.out.println("Tayang pada : 09.00 ");
                }
                if(jam == 2) {
                    System.out.println("Tayang pada : 13.00 ");
                }
                if(jam == 3){
                    System.out.println("Tayang pada : 17.00 ");
                }
                if(jam == 4){
                    System.out.println("Tayang pada : 21.00 ");
                }


                System.out.println("****************************************");
                System.out.println("Apakah kamu yakin memesan tiket ini ? ");
                System.out.println("Tekan 1 untuk memesan dan 2 untuk cancel");
                int t=scan.nextInt();

                if(t==1){
                    System.out.println("****************************************");
                    MovieTicket m = new MovieTicket();
                    Harga = m.getHarga(m.Harga);
                    System.out.println("total harga tiket : " +m.total);
                    System.out.println("Pemesanan Tiket Nonton Berhasil");

                }
                else if (t==2){
                    System.out.println("Pemesanan Tiket dibatalkan");
                }

            }
        }

        }

