package Exercicio10;

public class CalculadoraPagamento {
    public String calcularValorFinal(double precoProduto, int opcao) {

        double valorFinal;
        String resumo;

        switch (opcao) {
            case 1:
                valorFinal = precoProduto * 0.90;
                double desconto = precoProduto * 0.10;
                resumo = String.format(
                        "Forma de Pagamento: À vista\n" +
                                "Desconto: R$ %.2f\n" +
                                "O valor final a pagar é: R$ %.2f",
                        desconto, valorFinal
                );
                break;
            case 2:
                valorFinal = precoProduto;
                double valorParcela2x = valorFinal / 2;
                resumo = String.format(
                        "Forma de Pagamento: Parcelado em 2x\n" +
                                "Esta opção não possui juros.\n" +
                                "O valor final a pagar é: R$ %.2f\n" +
                                "Serão 2 parcelas de R$ %.2f",
                        valorFinal, valorParcela2x
                );
                break;
            case 3:
                valorFinal = precoProduto * 1.08;
                double juros = precoProduto * 0.08;
                double valorParcela4x = valorFinal / 4;
                resumo = String.format(
                        "Forma de Pagamento: Parcelado em 4x\n" +
                                "Juros: R$ %.2f\n" +
                                "O valor final a pagar (com juros) é: R$ %.2f\n" +
                                "Serão 4 parcelas de R$ %.2f",
                        juros, valorFinal, valorParcela4x
                );
                break;
            default:
                resumo = "OPÇÃO INVÁLIDA de pagamento. Tente novamente.";
                break;
        }
        return resumo;
    }
}