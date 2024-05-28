package llam.endes.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;



class ArraysTest {

    static int[] array1, array2, resul;

    @BeforeAll
    static void iniciar() {
        array1 = new int[]{2, 4, 5};
        array2 = new int[]{1, 1, 1};
        resul = new int[]{3, 5, 6};
    }

    @BeforeEach
    void iniciar2() {
        array1 = new int[]{2, 4, 5};
        array2 = new int[]{1, 1, 1};
        resul = new int[]{3, 5, 6};
    }

    @Test
    @Order(3)
    void testSumar() {
        MisArrays arra = new MisArrays();
        assertArrayEquals(resul, arra.sumar(array1, array2));
    }

    @Test
    @Order(2)
    void testSumar2() {
        MisArrays arra = new MisArrays();
        int[] array1 = new int[]{3, 6, 9, 12, 15};
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        int[] resul = new int[]{4, 8, 12, 16, 20};
        assertArrayEquals(resul, arra.sumar(array1, array2));
    }

    @Test
    @Order(1)
    void testDecrementar() {
        MisArrays arra = new MisArrays();
        arra.decrementar(array1, 1);
        assertArrayEquals(array1, new int[]{1, 3, 4});
    }

    @AfterAll
    static void finalizar() {
        System.out.println("Fin de los tests");
    }

    @AfterEach
    void finalizar2() {
        System.out.println("Finaliza un test");
    }
}
	
	



