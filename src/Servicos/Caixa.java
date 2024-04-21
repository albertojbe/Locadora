package Servicos;

public class Caixa {
    public static int mostrarOpcoes (){
        System.out.println("Opções: ");
        System.out.println("1 - Adicionar filme");
        System.out.println("2 - Adicionar série");
        System.out.println("3 - Adicionar disco");
        System.out.println("4 - Mostrar carrinho");
        System.out.println("5 - Finalizar compra");
        System.out.println("Digite sua opção: ");
        return Teclado.scan.nextInt();
    }

}
