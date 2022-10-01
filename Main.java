public class Main {
    public static void main(String[] args) {
        int nota1 = 10;
        nota1 = 90;
        int nota2 = 20;
        int soma = nota1 + nota2;
        int subtracao = nota1 - nota2;
        int multiplicacao = nota1 * nota2;
        float divisao = nota1 / nota2;
        float restoDaDivisao = nota1 % nota2;

        byte nota3 = 10;
        boolean aprovado = true;
        double salario = 0.0;
        char classe = 'A';

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(restoDaDivisao);
        //atribui 7 a variavel
        int media = 7;
        //estrutura condicional
        //se media maior ou igual a 7
        //fazer x senao fazer y
        if (media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

        if (media == 7){
            System.out.println("Aprovado");
        }else if (media > 5){
            System.out.println("Rescuperação");
        }else{
            System.out.println("Reprovado");
        }

        }
    }


