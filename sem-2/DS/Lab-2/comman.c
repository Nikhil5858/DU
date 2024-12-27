#include <stdio.h>

void main(){
	int array1[5] = {1,2,3,9,5};
	int array2[5] = {6,7,1,8,9};
	int i,j;
	for(i=0;i<5;i++){
		for(j=0;j<5;j++){
			if(array1[i]  == array2[j]){
				printf("Comman Element is  : %d ",array1[i]);
			}
		}
	}
}