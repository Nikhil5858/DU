#include <stdio.h>

void main(){
	int r1,c1;
	printf("Enter Number of Rows for Matrix 1 \n");
	printf("Enter Number of Rows : ");
	scanf("%d",&r1);
	printf("Enter Number of Colums : ");
	scanf("%d",&c1);
		
	int arr1[r1][c1];
	int arr2[r1][c1];
	int multi[r1][c1];
	int i,j,k;
	
	printf("Enter Elements For Array 1: ");
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			scanf("%d",&arr1[i][j]);
		}
	}
	
	printf("Enter Elements Array 2: ");
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			scanf("%d",&arr2[i][j]);
		}
	}
	
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			multi[i][j] = 0;
			for(k=0;k<c1;k++){
				multi[i][j] += arr1[i][k] * arr2[k][j];
			} 
		}
	}
	
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			printf("%d\t",multi[i][j]);
		}
		printf("\n");
	}
	
}
