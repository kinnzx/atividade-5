public class AutorizacaoCompra {
    public static void main(String[] args) {
        // Declaração das variáveis booleanas
        boolean saldoSuficiente = true;    // exemplo: cliente tem saldo suficiente
        boolean contaVerificada = false;   // exemplo: conta não está verificada

        // Verifica se a compra pode ser autorizada (saldo suficiente E conta verificada)
        boolean compraAutorizada = saldoSuficiente && contaVerificada;

        // Exibe o resultado no console
        System.out.println("Compra autorizada: " + compraAutorizada);
    }
}

