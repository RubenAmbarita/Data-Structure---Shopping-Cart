/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirclocart;

/**
 *
 * @author ruben
 */
public class SircloCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cart keranjang = new Cart();

        keranjang.tambahProduk("Pisang ijau", 2);
        keranjang.tambahProduk("Semangka Kuning", 3);

        keranjang.tambahProduk("Apel Merah", 1);
        keranjang.tambahProduk("Apel Merah", 4);
        keranjang.tambahProduk("Apel Merah", 2);
        keranjang.hapusProduk("Semangka Kuning");
        keranjang.hapusProduk("Semangka Merah");

        keranjang.tampilkanCart();
    }

}
