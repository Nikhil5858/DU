#include <stdio.h>

void main(){
	int array1[] = {10,20,30,40,50};
	int array2[] = {60,70,10,80,20};
	int array3[5];
	int i,j;
	int count = 0;
	
	for(i=0;i<5;i++){
		for(j=0;j<5;j++){
			if(array1[i] == array2[j]){
				array3[count] = array1[i]; 
				count++;
				break;
			}
		}
	}
	for (i = 0; i < count; i++) {
        printf("%d ", array3[i]);
    }
}
