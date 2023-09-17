/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.arquimjoao.junit5.MathUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author João P. Arquim
 */
public class MathUtilTest {
    
    @Test
    public void testMdcAPar() {//verifica se o mdc de 6 e 3 é 3
        final int x = 6;
        final int y = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(x, y);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testMdcAImpar() {//verifica seo mdc de 9 e 3 é 3
        final int x = 9;
        final int y = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(x, y);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testMdcPares() {//olha se o divisor de 8 e 16 é 4
        final int x = 16;
        final int y = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(x, y);
        //assertEquals(esperado, obtido);
        assertTrue(obtido % divisor == 0);
    }
    
    @Test
    public void testMdcPositivo() {
        final int x = 15;
        final int y = 0;
        final int esperado = x;
        final int obtido = MathUtil.mdc(x, y);
        assertEquals(esperado, obtido);
    }
}
