public class OrderMethods {
    /// 1. Metodo que devuelve un arreglo ordenado por burbuja
    public int[] sortBubble(int array[], boolean show) {
        int aux = 0;// guardar valor a cambiar
        for (int i = 0; i < array.length; i++) {
            if (show) {
                System.out.println("\nPasada num " + (i + 1) + "\n");
            }
            for (int j = i + 1; j < array.length; j++) {
                if (show) {
                    System.out.println("i=" + array[i] + " j=" + array[j]);
                }
                if (array[j] < array[i]) {
                    // hacemos un intercambio
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                    if (show) {
                        System.out.println("--Es mayor, se intercambia");
                        printArray(array);
                    }
                }
            }
        }
        return array;
    }

    // 2. Metodo que devuelve un arreglo de enteros ordenados por seleccion
    public int[] sortSelection(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int indx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[indx] > array[j])
                    indx = j;
            }
            int aux = array[indx];
            array[indx] = array[i];
            array[i] = aux;
        }

        return array;
    }
    /// 3. Metodo que devuelve un arreglo de enteros ordenados por insercion

    // 4. Imprimir un arreglo
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}