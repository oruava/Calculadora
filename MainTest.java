package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void areaRectangulo() {
        assertEquals(30,Main.areaRectangulo(6,5));
        assertEquals(8,Main.areaRectangulo(2,4));
    }

    @Test
    void areaCuadrado() {
        assertEquals(49,Main.areaCuadrado(7));
        assertEquals(81,Main.areaCuadrado(9));
    }

    @Test
    void areaCirculo() {
        assertEquals(452.3893421169302,Main.areaCirculo(12));
        assertEquals(1661.9025137490005,Main.areaCirculo(23));

    }

    @Test
    void areaEsfera() {
        assertEquals(2123.7166338267,Main.areaEsfera(13));
        assertEquals(3631.6811075498013,Main.areaEsfera(17));

    }

    @Test
    void areaCubo() {
        assertEquals(1014,Main.areaCubo(13));
        assertEquals(600,Main.areaCubo(10));

    }

    @Test
    void areaCono() {
        assertEquals(267.0353755551324,Main.areaCono(5,12));
        assertEquals(103.67255756846318,Main.areaCono(3,8));

    }

    @Test
    void perimetroCuadrado() {
        assertEquals(12,Main.perimetroCuadrado(3));
        assertEquals(20,Main.perimetroCuadrado(5));
    }

    @Test
    void perimetroRectangulo() {
        assertEquals(16,Main.perimetroRectangulo(5,3));
        assertEquals(10,Main.perimetroRectangulo(3,2));
    }

    @Test
    void perimetroCirculo() {
        assertEquals(18.84955592153876,Main.perimetroCirculo(3));
        assertEquals(31.41592653589793,Main.perimetroCirculo(5));
    }

    @Test
    void volumenEsfera() {
        assertEquals(14137.166941154068,Main.volumenEsfera(15));
        assertEquals(5575.279762570686,Main.volumenEsfera(11));
    }

    @Test
    void volumenCubo() {
        assertEquals(1000,Main.volumenCubo(10));
        assertEquals(27,Main.volumenCubo(3));
    }

    @Test
    void volumenCono() {
        assertEquals(667.0648401122327,Main.volumenCono(7,13));
        assertEquals(376.99111843077515,Main.volumenCono(6,10));
    }

    @Test
    void sumarNumeros() {
        assertEquals(20,Main.sumarNumeros(7,13));
        assertEquals(-19,Main.sumarNumeros(-10,-9));
    }

    @Test
    void restarNumeros() {
        assertEquals(-7,Main.restarNumeros(-10,-3));
        assertEquals(-12,Main.restarNumeros(3,15));
    }

    @Test
    void multiplicarNumeros() {
        assertEquals(0,Main.multiplicarNumeros(99,0));
        assertEquals(-25,Main.multiplicarNumeros(5,-5));

    }

    @Test
    void dividirNumeros() {
        assertEquals(0,Main.dividirNumeros(0,13));
        assertEquals(-3.5,Main.dividirNumeros(7,-2));
    }

    @Test
    void numeroMayor() {
        assertEquals(13,Main.numeroMayor(7,13));
        assertEquals(4,Main.numeroMayor(4,4));
    }

    @Test
    void numeroMenor() {
        assertEquals(-5,Main.numeroMenor(1,-5));
        assertEquals(0,Main.numeroMenor(0,100));
    }

    @Test
    void calcularPotencia() {
        assertEquals(125,Main.calcularPotencia(5,3));
        assertEquals(-1,Main.calcularPotencia(-1,3));
        assertEquals(0.0625,Main.calcularPotencia(4,-2));
    }

    @Test
    void calcularPorcentaje() {
        assertEquals(500,Main.calcularPorcentaje(100,20));
        assertEquals(10,Main.calcularPorcentaje(1,10));
    }

    @Test
    void ecuacion1() {
        assertEquals(-1,Main.ecuacion1(1,3,2));
        assertEquals(-3,Main.ecuacion1(1,7,12));
    }

    @Test
    void ecuacion2() {
        assertEquals(-2,Main.ecuacion2(1,3,2));
        assertEquals(-4,Main.ecuacion2(1,7,12));
    }

    @Test
    void determinante() {
        assertEquals(0,Main.determinante(1,2,2,2,4,7));
        assertEquals(7,Main.determinante(5,1,9,3,2,28));
    }

    @Test
    void valorX() {
        assertEquals(4.25,Main.valorX(2,3,1,-2,-5,4,-4));
        assertEquals(-10.0,Main.valorX(1,-2,4,-1,1,3,-1));
    }

    @Test
    void valorY() {
        assertEquals(-2.5,Main.valorY(2,3,1,-2,-5,4,-4));
        assertEquals(-7.0,Main.valorY(1,-2,4,-1,1,3,-1));
    }

}