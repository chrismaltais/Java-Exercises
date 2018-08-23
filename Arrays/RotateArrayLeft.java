// A left rotation operation on an array shifts each of the array's elements x units to the left.

private static void printLeftRotation(int[] array, int numRotations) {
    int i = 0;
    while (i < numRotations) {
        int temp = array[0];
        for (int j = 0; j < array.length - 1; j++) {
            array[j] = array[j+1];
        }
        array[array.length - 1] = temp;
        i++;
    }
        
    for (int k = 0; k < array.length; k++) {
        System.out.print(array[k] + " ");
    }
        
}
private static void printLeftRotationHack(int[] array, int numRotations) {
    int numElements = array.length;
    int[] newArray = new int[array.length];
    for (int i = 0; i < numElements; i++) {
        newArray[(i + numElements - numRotations) % numElements] = array[i];
    }
        
    for (int i = 0; i < numElements; i++) {
        System.out.print(newArray[i] + " ");
    }
}