import java.util.Arrays;

public class Funcionario {
    public  String nome;
    public  int idade;
    public double[] salario;


    public void imprimir (){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Salarios: " + Arrays.toString(this.salario));
        System.out.println("A média dos 3 Salarios é: " + String.format("%.2f", caluclarMedia()));
    }

    public double caluclarMedia(){
        double soma = 0;
        for (double valor : salario){
            soma += valor;
        }
        return soma / this.salario.length;
    }
}

