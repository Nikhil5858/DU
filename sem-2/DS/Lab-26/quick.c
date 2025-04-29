#include <stdio.h>
#include <math.h>

int array[6] = {48, 7, 120, 96, 42, 45};

void merge(int low, int mid, int high) {
    int h, i, j, k;
    int b[6];
    h = low;
    i = low;
    j = mid + 1;
    while (h <= mid && j <= high) {
        if (array[h] <= array[j]) {
            b[i] = array[h];
            h++;
        } else {
            b[i] = array[j];
            j++;
        }
        i++;
    }
    if (h > mid) {
        for (k = j; k <= high; k++) {
            b[i] = array[k];
            i++;
        }
    } else {
        for (k = h; k <= mid; k++) {
            b[i] = array[k];
            i++;
        }
    }
    for (k = low; k <= high; k++) {
        array[k] = b[k];
    }
}

void mergesort(int low, int high) {
    int mid;
    if (low < high) {
        mid = floor((low + high) / 2);
        mergesort(low, mid);
        mergesort(mid + 1, high);
        merge(low, mid, high);
    }
}

int main() {
    mergesort(0, 5);
    int i;
    for (i = 0; i < 6; i++) {
        printf("%d \n", array[i]);
    }
    return 0;
}
