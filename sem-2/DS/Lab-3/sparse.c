#include <stdio.h>

void main(){
	int r1,c1;
	printf("Enter Number of Rows for Matrix 1 \n");
	printf("Enter Number of Rows : ");
	scanf("%d",&r1);
	printf("Enter Number of Colums : ");
	scanf("%d",&c1);
		
	int arr1[r1][c1];
	int notcount = 0;
	int count = 0;
	int i,j;
	
	printf("Enter Elements For Array 1: ");
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			scanf("%d",&arr1[i][j]);
		}
	}
	
	
	
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			if(arr1[i][j] == 0){
				count ++;	
			}
			if(arr1[i][j] != 0){
				notcount ++;
			}
		}
	}
	
	printf("Sparse Count : %d\n",count);
	printf("Not Sparse Count : %d\n",notcount);
	
	if(count > notcount){
		printf("Matrix Is Sparse");
	}
	else{
		printf("Matrix Is Not Sparse");
	}
}
