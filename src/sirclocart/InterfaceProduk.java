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
public interface InterfaceProduk {

    void tambahProduk(String kodeProduk, int kuantitas);

    void hapusProduk(String kodeProduk);

    void tampilkanCart();
}
