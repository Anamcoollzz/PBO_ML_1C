/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moba;

/**
 *
 * @author Hairul Anam
 */
public class Main {
    public static void main(String[] args) {
        // ANGGOTA 
        // AHMAD FAUZAL ADIFIA [162410101119]
        // HAIRUL ANAM [162410101128]
        // MUHAMMAD YUSUF AULIYA [162410101138]
        HairulAnam ha = new HairulAnam();
        ha.setHeroes();
        ha.setFriend();
        Adifia af = new Adifia();
        af.setHeroes();
        af.setFriend();
        YusufAuliya ya = new YusufAuliya();
        ya.setHeroes();
        ya.setFriend();
        System.out.print("HERO PUNYA HAIRUL ANAM : ");
        for(int i = 0; i < ha.getHeroes().length; i++){
            System.out.print(ha.getHeroes()[i].getName()+",");
        }
        System.out.println("");
        System.out.print("HERO PUNYA YUSUF AULIYA : ");
        for(int i = 0; i < ya.getHeroes().length; i++){
            System.out.print(ya.getHeroes()[i].getName()+",");
        }
        System.out.println("");
        System.out.print("HERO PUNYA ADIFIA : ");
        for(int i = 0; i < af.getFriends().length; i++){
            System.out.print(af.getFriends()[i].getNickName()+",");
        }
        System.out.println("\n\nPERTEMANAN\nTEMAN BAGAIKAN KEPOMPONG\n");
        System.out.print("TEMAN HAIRUL ANAM : ");
        for(int i = 0; i < ha.getFriends().length; i++){
            System.out.print(ha.getFriends()[i].getNickName()+",");
        }
        System.out.println("");
        System.out.print("TEMAN YUSUF AULIYA : ");
        for(int i = 0; i < ya.getFriends().length; i++){
            System.out.print(ya.getFriends()[i].getNickName()+",");
        }
        System.out.println("");
        System.out.print("TEMAN ADIFIA : ");
        for(int i = 0; i < af.getFriends().length; i++){
            System.out.print(af.getFriends()[i].getNickName()+",");
        }
    }
}
