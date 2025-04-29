#include <stdio.h>
    
void main(){
	int array[6] = {10,20,30,40,50,60};
	int right = 5;
	int left = 0;
	int middle;
	int x=30;
	while(left<=right){
		middle=(left+right)/2;
		if(array[middle]==x){
			printf("Element found at index %d\n", middle);
			return middle;
		}
		else if(array[middle]>x){
			right = middle - 1;
		}
		else{
			left = middle + 1;
		}
	}
	printf("Element Not Found!");
}   
