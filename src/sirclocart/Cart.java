/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirclocart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author ruben
 */
public class Cart implements InterfaceProduk {

    private Map<String, Produk> map;

    public Cart() {

        map = new LinkedHashMap<String, Produk>();
    }

    @Override
    public void tambahProduk(String kodeProduk, int kuantitas) {
        Produk p = map.get(kodeProduk);
        if (p != null) {
            p.setKuantitas(p.getKuantitas() + kuantitas);
        } else {
            p = new Produk(kodeProduk, kuantitas);
            map.put(kodeProduk, p);
        }
    }

    @Override
    public void hapusProduk(String kodeProduk) {
        if (map.containsKey(kodeProduk)) {
            map.remove(kodeProduk);
        } 
    }

    @Override
    public void tampilkanCart() {
        for (Produk p : map.values()) {
            System.out.println(p.getKode() + " (" + p.getKuantitas() + ")");
        }
    }

}
