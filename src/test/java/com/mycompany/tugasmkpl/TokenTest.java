/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasmkpl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TokenTest {

    @Test
    public void testPerhitunganHargaToken() {
        // 1. Persiapkan data test
        int nominal = 50000;
        long nomorToken = 1234567890L;
        double kwh = 20.0;

        // 2. Buat object Token baru
        Token tokenBeli = new Token(nominal, nomorToken, kwh);

        // 3. Cek hasil perhitungan (Java Assertion)
        // Berdasarkan rumus di Token.java: (nominal * 0.1) + (kwh * 1500)
        // Ekspektasi: (50000 * 0.1) + (20.0 * 1500) = 5000 + 30000 = 35000.0
        double ekspektasiHarga = 35000.0;
        
        // Memastikan method getHarga() menghasilkan output yang sama dengan ekspektasi
        assertEquals(ekspektasiHarga, tokenBeli.getHarga(), "Perhitungan harga token pada sistem salah!");
    }
}
