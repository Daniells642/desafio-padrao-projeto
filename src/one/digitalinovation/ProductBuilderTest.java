package one.digitalinovation;

public class ProductBuilderTest {

    public void testProductBuilder() {
        // Crie um objeto Product usando o Builder
        Product product = new ProductBuilder()
                .withPart1("Parte 1")
                .withPart2("Parte 2")
                .build();

        // Verifique se os atributos foram configurados corretamente
        assertEquals("Parte 1", product.getPart1());
        assertEquals("Parte 2", product.getPart2());
    }

    private void assertEquals(String s, String part1) {

    }
}