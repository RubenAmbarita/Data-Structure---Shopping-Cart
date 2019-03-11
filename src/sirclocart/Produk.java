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
public class Produk {

    private int kuantitas;
    private String kodeProduk;

    public Produk(String kodeProduk, int kuantitas) {
        this.kodeProduk = kodeProduk;
        this.kuantitas = kuantitas;
    }

    public void setKode(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public int getKuantitas() {
        return (this.kuantitas);
    }

    public String getKode() {
        return (this.kodeProduk);
    }

    public String toString() {
        String sep = System.getProperty("line.separator");
        StringBuffer buffer = new StringBuffer();
        buffer.append(sep);
        buffer.append("----- Product Detail ----- ");
        buffer.append(sep);
        buffer.append("\tkodeProduk = ");
        buffer.append(kodeProduk);
        buffer.append(sep);
        buffer.append("\tkuantitas = ");
        buffer.append(kuantitas);
        buffer.append(sep);
        return buffer.toString();
    }
}
