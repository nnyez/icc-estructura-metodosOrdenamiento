import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        OrderMethods order = new OrderMethods();
        Scanner sc = new Scanner(System.in);
        int[] numbers = { 10, 5, 16, 3 };
        int option = 1;
        // order.printArray(numbers);

        // int [] bubble = order.sortBubble(numbers,true);

        // System.out.println("Order for Bubble method");
        // order.printArray(bubble);

        while (option != 0) {
            System.out.println("\nMenu Principal");
            System.out.println("Ingrese 0 para terminar\n");
            System.out.println("1.- Metodo de ordenamiento por burbuja");
            System.out.println("4.- Imprimir el vector");

            System.out.println("\n Ingrese una Opcion");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingresando al metodo de ordenamiento \n Burbuja");
                    System.out.println("Desea mostrar los pasos?(Si:true No:false)");
                    
                    boolean show = sc.nextBoolean();
                    order.printArray(numbers);

                    int[] sortArray =order.sortBubble(numbers, show);
                    order.printArray(sortArray);

                    break;
                case 4:
                    order.printArray(numbers);
                    break;

                default:
                    break;
            }

        }

    }
}
