package one.digitalinovation;

public class Product {
    private String part1;
    private String part2;
    // Outros atributos e métodos da classe

    public Product(String part1, String part2) {
        this.part1 = part1;
        this.part2 = part2;
        // Inicialização de outros atributos
    }

    // Uso do Builder para criar um objeto Product
    Product product = new ProductBuilder()
            .withPart1("Parte 1")
            .withPart2("Parte 2")
            .build();

    public String getPart1() {
        return null;
    }

    public String getPart2() {
    return null;
    }
}


