package Views;

public class Caixa {
    public int mostrarOpcoes (){
        System.out.println("Bem-vindo ao caixa! Suas opções são: ");
        System.out.println("1 - Adicionar filme");
        System.out.println("2 - Adicionar série");
        System.out.println("3 - Adicionar disco");
        System.out.println("4 - Mostrar valor total");
        System.out.println("5 - Finalizar compra");
        System.out.println("Digite sua opção: ");
        return Teclado.scan.nextInt();
    }

}
