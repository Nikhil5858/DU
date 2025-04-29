#include <stdio.h>

void main(){
	int array[6] = {4,78,12,96,2,45};
	int i,j;
	for(i=0;i<6;i++){
		int min=i;
		for(j=i+1;j<6;j++){
			if(array[min]>array[j]){
				min=j;				
			}
		}
		if(min != i){
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
	int k;
	for(k=0;k<6;k++){
		printf(" %d",array[k]);
	}
}
