import java.util.*;

public class Main {
    public static void main(String[] args) {
        List lstLlamadasxCabina= new ArrayList<>();
        List<Cabina> lstCabinas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int op;
        int max = 60;
        int min = 1;
        boolean continuar = true;
        do {
            System.out.println("Bienvenido, vas a poder realizar alguna de las siguientes funciones");
            System.out.println("""
                ---------------------------------
                1. CREAR UNA NUEVA CABINA
                2. SELECCIONAR CABINA EN LA QUE DESEAR REALIZAR UNA LLAMADA
                3. MOSTRAR INFORMACION GUARDADA EN CADA CABINA
                4. MOSTRAR CONSOLIDADO GENERAL DE LAS CABINAS
                5. REINICIAR INFORMACION DE UNA CABINA TELEFONICA
                6. SALIR DEL PROGRAMA
                ---------------------------------
                """);
            op = teclado.nextInt();
            switch(op){
                case 1 -> {

                    Cabina cabina = new Cabina();

                    teclado.nextLine();
                    System.out.println("VAS A CREAR UNA CABINA");
                    cabina.setNombreC(teclado.nextLine());
                    Cabina CABINA = new Cabina(cabina.getNombreC());
                    lstCabinas.add(CABINA);
                    System.out.println(lstCabinas);
                }
                case 2 -> {
                    System.out.println("INGRESE CABINA A LA QUE DESEA INGRESAR");
                    teclado.nextLine();
                    String NombreCabina;
                    NombreCabina = teclado.nextLine();
                    for (Cabina cabina : lstCabinas)
                        if (cabina.getNombreC().equalsIgnoreCase(NombreCabina)) {
                            System.out.println("ESTAS EN LA CABINA " + cabina);
                        }
                    System.out.println("""
                            ¿QUE TIPO DE LLAMADA DESEAS REALIZAR?
                            1. LLAMADA LOCAL = $50
                            2. LLAMADA A DISTANCIA = $350
                            3. LLAMADA A CELULAR = $150
                            """);
                    int call;
                    call = teclado.nextInt();
                    switch(call){
                        case 1 -> {
                            int Nminutos;
                            Random minutos = new Random();
                            Nminutos = minutos.nextInt(max-min+1)+min;
                            System.out.println("VAS A REALIZAR UNA LLAMADA LOCAL");
                            System.out.println("EL PRECIO DE LA LLAMADA POR MINUTO ES DE " + );
                            teclado.nextLine();
                            System.out.println("LA LLAMADA TUVO UNA DURACION DE " + Nminutos);

                        }
                      }
                    }
                default -> {
                    System.out.println("ESA OPCION ES INVALIDA");
                    return;
                }
            }
        }while(continuar);
    }
}