package com.company;

import java.util.Scanner;

public class MovieTicket {
    private String Nama;
    private String seat;
    public int Harga;
    public int total;

    Scanner scan =new Scanner(System.in);

    MovieTicket(){
        System.out.println("****************************************");
        System.out.println("Nama : ");
        this.Nama= scan.nextLine();
        System.out.println("Pilih seat A1-F9 : ");
        this.seat =scan.nextLine();
        System.out.println("\nSeat kamu "+seat+" untuk tiket film ini" );
        }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getseat() {
        return seat;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getHarga(int harga) {
        System.out.println("BESS CINEMA ClASS");
        System.out.println("1. Regular Studio");
        System.out.println("2. The Premiere");
        System.out.println("class : ");
        int ch=scan.nextInt();
        System.out.println("Jumlah tiket :");
        int jl= scan.nextInt();
        if(ch==1){
            System.out.println("Harga tiket : 50000");
            Harga+=50000;
            total=Harga*jl;
        }
        if(ch==2) {
            System.out.println("Harga tiket : 350000");
            Harga += 350000;
            total=Harga*jl;
        }
        return Harga;
    }

    }



