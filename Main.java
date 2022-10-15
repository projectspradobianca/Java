public class Main {
    public static void main(String[] args){
    int nota1 = 10;
    int nota2 = 8;
    int nota3 = 6;

    int media = (nota1 + nota2 + nota3) / 3 ;

    System.out.println(media);



    if (media > 7){
        System.out.println("Aprovado");
    }else if (media > 5){
        System.out.println("Recuperação");
    }else{
        System.out.println("Reprovado");
    }

    }
}