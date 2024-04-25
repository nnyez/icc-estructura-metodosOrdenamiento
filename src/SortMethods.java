public class SortMethods {
    /*
     * 1. Metodo que devuelve un arreglo ordenado por burbuja
     * sort == true es asc
     * sort == false es desc
     * showLog == true muestra los pasos
     * showLog == false oculta los pasos
     * arr vector a ordenar
     */
    public int[] sortBubble(int arr[], boolean showLog, boolean sortAsc) {
        int aux = 0;// guardar valor a cambiar
        int[] array = arr.clone();

        for (int i = 0; i < array.length - 1; i++) {
            if (showLog) {
                System.out.println("\nPasada num " + (i + 1) + "\n");
            }
            for (int j = i + 1; j < array.length; j++) {
                if (showLog) {
                    System.out.println("i=" + array[i] + " j=" + array[j]);
                }
                if ((array[j] < array[i] && !sortAsc) || (array[j] > array[i] && sortAsc)) {
                    // hacemos un intercambio
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                    if (showLog) {
                        System.out.println("--Es " + (sortAsc ? "menor" : "mayor") + ", se intercambia");
                        printArray(array);
                    }
                }
            }
        }

        return array;
    }

    /*
     * 2. Metodo que devuelve un arreglo de enteros ordenados por seleccion
     * sort == true es asc
     * sort == false es desc
     * showLog == true muestra los pasos
     * showLog == false oculta los pasos
     * arr vector a ordenar
     */
    public int[] sortSelection(int arr[], boolean showLog, boolean sortAsc) {
        int[] array = arr.clone();

        for (int i = 0; i < array.length - 1; i++) {
            int indexM = i;
            if (showLog) {
                System.out.println("\nPasada num " + (i + 1) + "\n");
            }
            for (int j = i + 1; j < array.length; j++) {
                if (showLog) {
                    System.out.println((sortAsc ? "indxMayor=" : "indxMenor=") + array[indexM] + " j=" + array[j]);
                }
                if ((array[j] < array[indexM] && !sortAsc) || (array[j] > array[indexM] && sortAsc)) {
                    indexM = j;
                }
            }
            if (showLog) {
                System.out.println((sortAsc ? "indxMayor=" : "indxMenor=") + array[indexM]);

                System.out
                        .println("--Se se intercambia el valor de indx " + (sortAsc ? "mayor:" : "menor:") + +array[indexM]
                                + " con la posicion actual " + array[i]);
                printArray(array);
            }
            int aux = array[i];
            array[i] = array[indexM];
            array[indexM] = aux;

        }

        return array;
    }

    /*
     * 3. Metodo que devuelve un arreglo de enteros ordenados por insercion
     * sort == true es asc
     * sort == false es desc
     * showLog == true muestra los pasos
     * showLog == false oculta los pasos
     * arr vector a ordenar
     */
    public int[] sortInsertion(int[] arr, boolean showLog, boolean sortAsc) {
        int[] array = arr.clone();
        for (int i = 1; i < array.length; i++) {
            int elemento = array[i];
            int j = i - 1;
            if (showLog) {
                System.out.println("\nPasada num " + i + "\n");
                System.out.println("Actual (i)=" + array[i]);
            }

            while ((j >= 0 && array[j] > elemento && !sortAsc) || (j >= 0 && array[j] < elemento && sortAsc)) {
                if (showLog) {
                    System.out.println("i=" + array[i] + " j=" + array[j]);
                    System.out.println((sortAsc ? "--Mayor" : "--Menor") + ", Se intercambia");
                }
                array[j + 1] = array[j];

                j--;

            }

            array[j + 1] = elemento;
            if (showLog) {
                printArray(array);
            }
        }
        return array;

    }

    /*
     * 3. Metodo que devuelve un arreglo de enteros ordenados por insercion
     * sort == true es asc
     * sort == false es desc
     * showLog == true muestra los pasos
     * showLog == false oculta los pasos
     * arr vector a ordenar
     */
    public int[] sortBubblePro(int[] arr, boolean showLog, boolean sortAsc) {

        int aux = 0;// guardar valor a cambiar
        int[] array = arr.clone();
        int n = array.length;// limitamos a los elementos que ya estan ordenados
        for (int i = 0; i <= n; i++) {
            if (showLog) {
                System.out.println("\nPasada num " + (i + 1) + "\n");
            }
            for (int j = 1; j < n; j++) {
                // System.out.println("i=" + array[i] + " j=" + array[j] + " a=" + array[j -
                // 1]);
                if (showLog) {
                    System.out.println((sortAsc ? "Menor=" : "Mayor=") + array[j - 1] + " j=" + array[j]);
                }
                if ((array[j] < array[j - 1] && !sortAsc) || (array[j] > array[j - 1] && sortAsc)) {
                    // hacemos un intercambio
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                    if (showLog) {
                        System.out.println("--Es " + (sortAsc ? "menor" : "mayor") + ", se intercambia");
                        printArray(array);
                    }

                }

            }
            n -= 1;
        }

        return array;
    }

    // 4. Imprimir un arreglo
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}