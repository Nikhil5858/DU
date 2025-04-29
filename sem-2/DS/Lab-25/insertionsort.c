#include <stdio.h>

void main(){
	int array[6] = {48,7,120,96,42,45};
	int i=1,j,key;
	while(i<6){
		key = array[i];//i=7
		j = i-1;// 1 - 1 =0
		while(j>=0 && array[j]>key){ // array[48] > 7
			array[j+1] = array[j]; // swap 7 | 48
			j = j-1; 
		}
		array[j+1] = key;
		i = i + 1;
	}
	int k;
	for(k=0;k<6;k++){
		printf(" %d",array[k]);
	}
}
