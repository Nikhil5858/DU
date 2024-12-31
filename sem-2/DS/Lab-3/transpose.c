#include <stdio.h>

void main(){
	int r1,c1;
	printf("Enter Number of Rows for Matrix 1 \n");
	printf("Enter Number of Rows : ");
	scanf("%d",&r1);
	printf("Enter Number of Colums : ");
	scanf("%d",&c1);
		
	int arr1[r1][c1];
	int trans[r1][c1];
	int i,j;
	
	printf("Enter Elements For Array 1: ");
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			scanf("%d",&arr1[i][j]);
		}
	}
	
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			trans[i][j] = arr1[j][i];
		}
	}
	
	for(i=0;i<r1;i++){
		for(j=0;j<c1;j++){
			printf("%d\t",trans[i][j]);
		}
		printf("\n");
	}
	
}
