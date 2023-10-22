package one.digitalinovation;

public class ProductBuilder {
    private String part1;
    private String part2;
    // Outros atributos relacionados à construção

    public ProductBuilder withPart1(String part1) {
        this.part1 = part1;
        return this;
    }

    public ProductBuilder withPart2(String part2) {
        this.part2 = part2;
        return this;
    }

    public Product build() {
        return new Product(part1, part2);
    }
}
