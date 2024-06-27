public class ArrayDemo {
    public static void main(String[] args) {
        // Integer array
        int[] intArray = {1, 2, 3, 4, 5};
        
        // String array
        String[] stringArray = {"Hello", "World", "Java", "Arrays"};
        
        // Char array
        char[] charArray = {'a', 'b', 'c', 'd'};
        
        // Short array
        short[] shortArray = {10, 20, 30, 40, 50};
        
        // Byte array
        byte[] byteArray = {1, 2, 3, 4};
        
        // Float array
        float[] floatArray = {1.1f, 2.2f, 3.3f};
        
        // Double array
        double[] doubleArray = {1.11, 2.22, 3.33};
        
        // Boolean array
        boolean[] booleanArray = {true, false, true};
        
        // Long array
        long[] longArray = {100000L, 200000L, 300000L};
        
        // Print arrays and their lengths
        printArray(intArray, "intArray");
        printArray(stringArray, "stringArray");
        printArray(charArray, "charArray");
        printArray(shortArray, "shortArray");
        printArray(byteArray, "byteArray");
        printArray(floatArray, "floatArray");
        printArray(doubleArray, "doubleArray");
        printArray(booleanArray, "booleanArray");
        printArray(longArray, "longArray");
    }

    public static void printArray(int[] array, String arrayName) {
        System.out.print(arrayName + ": ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length + "\n");
    }

    public static void printArray(String[] array, String arrayName) {
        System.out.print(arrayName + ": ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length + "\n");
    }

    public static void printArray(char[] array, String arrayName) {
        System.out.print(arrayName + ": ");
        for (char element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length + "\n");
    }

    public static void printArray(short[] array, String arrayName) {
        System.out.print(arrayName + ": ");
        for (short element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length + "\n");
    }

    public static void printArray(byte[] array, String arrayName) {
        System.out.print(arrayName + ": ");
        for (byte element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length + "\n");
    }

    public static void printArray(float[] array, String arrayName) {
        System.out.print(arrayName + ": ");
        for (float element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length + "\n");
    }

    public static void printArray(double[] array, String arrayName) {
        System.out.print(arrayName + ": ");
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length + "\n");
    }

    public static void printArray(boolean[] array, String arrayName) {
        System.out.print(arrayName + ": ");
        for (boolean element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length + "\n");
    }

    public static void printArray(long[] array, String arrayName) {
        System.out.print(arrayName + ": ");
        for (long element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length + "\n");
    }
}

