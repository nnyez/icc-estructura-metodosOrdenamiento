import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        SortMethods sorts = new SortMethods();
        Scanner sc = new Scanner(System.in);//scanner
        ViewMenus view = new ViewMenus(sc);//clase show menus 

        int[] numbers = { 3, 54, 31, 245, 100, 2, 21, 200 };
        int option;

        do {
            option = view.showMainMenu();
            switch (option) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    numbers = view.insertArray();//creamos un arreglo con los valores ingresados por el usuario
                    break;
                case 2:
                    showSubMenuSort(view, sorts, numbers);//vamos al menu de metodos de ordenamiento
                    break;

                default:
                    break;
            }

        } while (option != 0);

        sc.close();
    }

    public static void showSubMenuSort(ViewMenus view, SortMethods sorts, int[] array) {
        int op = view.showSubMenuSort();// menu opciones de ordenamiento
        boolean showLog = view.showSubMenuLog();// menu opciones mostrar o no los pasos
        boolean sortAsc = view.showSubMenuAscDes();// menu para ordenamiento ascendente o descendente
        int[] orderArray;// array ordenado
        switch (op) {
            case 1:
                System.out.println("BURBUJA:");
                System.out.print("\nStartArray: ");
                sorts.printArray(array);// antes de ordenar

                orderArray = sorts.sortBubble(array, showLog, sortAsc);

                System.out.print("SortArray: ");
                sorts.printArray(orderArray);// despues de ordenar
                break;
            case 2:
                System.out.println("SELECCION:");

                System.out.print("\nStartArray: ");
                sorts.printArray(array);// antes de ordenar

                orderArray = sorts.sortSelection(array, showLog, sortAsc);

                System.out.print("-SortArray: ");
                sorts.printArray(orderArray);// despues de ordenar
                break;
            case 3:
                System.out.println("INSERCION:");

                System.out.print("\nStartArray: ");
                sorts.printArray(array);// antes de ordenar

                orderArray = sorts.sortInsertion(array, showLog, sortAsc);

                System.out.print("-SortArray: ");
                sorts.printArray(orderArray);// despues de ordenar
                break;
            case 4:
                System.out.println("BURBUJA MEJORADO:");

                System.out.print("\nStartArray: ");
                sorts.printArray(array);// antes de ordenar

                orderArray = sorts.sortBubblePro(array, showLog, sortAsc);

                System.out.print("-SortArray: ");
                sorts.printArray(orderArray);// despues de ordenar
                break;
            default:
                break;
        }
    }
}
