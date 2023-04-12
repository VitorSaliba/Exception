import java.util.Scanner;

public class ExemploFinally {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            float dividendo, divisor, resultado;
            System.out.print("Digite o dividendo: ");
            dividendo = s.nextInt();
            System.out.print("Digite o dividendo: ");
            divisor = s.nextInt();

            if(divisor == 0){
                throw new Exception("Não é possível fazer divisão por zero.");
            }
            resultado = dividendo / divisor;

            System.out.println(dividendo + " / " + divisor + " = " + resultado);
        } catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            System.out.println("Bloco finally");
        }
    }
}
