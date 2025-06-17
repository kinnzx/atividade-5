public class Desconto {
    public static void main(String[] args) {
        // Declaração das variáveis booleanas
        boolean produtoComDesconto = true;  // exemplo: produto está com desconto
        boolean cupomValido = false;         // exemplo: cliente não possui cupom válido

        // Verifica se o desconto pode ser aplicado (produto com desconto OU cupom válido)
        boolean descontoAplicado = produtoComDesconto || cupomValido;

        // Exibe o resultado no console
        System.out.println("Desconto aplicado: " + descontoAplicado);
    }
}



