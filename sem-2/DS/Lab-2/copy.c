#include <stdio.h>

void main(){
    int array1[] = {10,20,30,40,50};
    int array2[5];
    int i;
    for(i=0;i<=5;i++){
            array2[i] = array1[i];
    }

    for(i=0;i<=4;i++){
        printf("%d\n",array2[i]);
    }
}
