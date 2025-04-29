#include <stdio.h>

int linearSearch(int array[], int n, int x) {
    if (n == 0) {
        return -1;
    }
    if (array[n - 1] == x) {
        return n - 1; //
    }
    return linearSearch(array, n - 1, x); 
}

int main() {
    int num, i, x;
    printf("Enter the number of elements: ");
    scanf("%d", &num);
    
    int array[num];
    
    printf("Enter the elements: ");
    for (i = 0; i < num; i++) {
        scanf("%d", &array[i]);
    }
    
    printf("Enter the number to search: ");
    scanf("%d", &x);
    
    int result = linearSearch(array, num, x);
    
    if (result != -1) {
        printf("Element found at index %d\n", result);
    } else {
        printf("Element not found\n");
    }

    return 0;
}

