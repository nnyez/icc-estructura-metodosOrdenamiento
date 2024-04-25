import java.util.Scanner;


public class ViewMenus {
    Scanner sc;

    public ViewMenus(Scanner sc) {
        this.sc = sc;
    }

    public int showMainMenu() {
        System.out.println("\nMenu Principal");
        System.out.println("1.- Insertar un array");
        System.out.println("2.- Ordenar el array");
        System.out.println("0.- Salir");
        System.out.println("\n Ingrese una Opcion\n");
        System.out.print("Opcion: ");

        return sc.nextInt();
    }

    public int showSubMenuSort() {
        int option;
        boolean ok = false;
        do {
            System.out.println("\nMETODOS ORDENAMIETO");
            System.out.println("1.- Metodo Burbuja");
            System.out.println("2.- Metodo Seleccion");
            System.out.println("3.- Metodo Insercion");
            System.out.println("4.- Metodo Burbuja Mejorado\n");
            System.out.print("Opcion: ");
            option = sc.nextInt();
            System.out.println();//salto de linea
            if (option > 0 && option <= 4)
                ok = true;
            else
                System.out.println("Opcion no valida");
        } while (!ok);

        return option;

    }

    public boolean showSubMenuLog() {   
        int option;
        boolean ok = false;
        do {
            System.out.println("MOSTRAR PROCEDIMIENTO");
            System.out.println("1.- Mostrar Pasos");
            System.out.println("2.- No Mostrar Pasos\n");
            System.out.print("Opcion: ");

            option = sc.nextInt();
            if (option > 0 && option <= 2)
                ok = true;
            else
                System.out.println("Opcion no valida");
        } while (!ok);

        return option==1;
    }
    public boolean showSubMenuAscDes(){
        int option;
        boolean ok = false;
        do {
            System.out.println("MOSTRAR PROCEDIMIENTO");
            System.out.println("1.- Ascendente");
            System.out.println("2.- Descendente\n");
            System.out.print("Opcion: ");

            option = sc.nextInt();
            if (option > 0 && option <= 2)
                ok = true;
            else
                System.out.println("Opcion no valida");
        } while (!ok);

        return option==1;
    }

    public int[] insertArray() {
        
        System.out.println("Ingresar el tamaño de su arreglo");
        int len = sc.nextInt();
        int [] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingresar el valor "+(i+1)+":");
            array[i]= sc.nextInt();
        }
        return array;
    }



}
