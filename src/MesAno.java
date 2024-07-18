import java.util.Scanner;

public enum MesAno {
    JANEIRO (31), FEVEREIRO(28), MARCO(31), ABRIL(30),
    MAIO(31), JUNHO(30), JULHO(31), AGOSTO(31),
    SETEMBRO(30), OUTUBRO(31), NOVEMBRO(30), DEZEMBRO(31);

    public int dias;
    MesAno(int dias){
        this.dias = dias;
    }
    public int getDias(){
        return dias;
    }


    public static void quantidadeDias(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Mês desejado");
        String mes = sc.nextLine();
        System.out.println("Digite o Ano desejado");
        int ano = sc.nextInt();

        MesAno mesSolicitado = MesAno.valueOf(mes);
        int ultimosDigitos = ano % 100;


        boolean anoBissexto = (ultimosDigitos % 4 == 0) ? true : false;

        if(anoBissexto == true && MesAno.FEVEREIRO.equals(mesSolicitado)){
            int dias = MesAno.FEVEREIRO.getDias()+1;
            System.out.println("O Mes de " + mesSolicitado + " tem " + dias + " dias, Porque " + ano + " é ano bissexto");
        }else {
            System.out.println("O Mes de " + mesSolicitado + " tem " + mesSolicitado.getDias() + " dias");
    }


 }

}