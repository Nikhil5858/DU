#include<stdio.h>

#define n 5
int cq[n];
int r = -1;
int f = -1;

void cqinsert(){
	if(r == n-1){
		r=0;
	}
	else{
		r=r+1;
	}
	if(r==f){
		printf("=======================Overflow!=======================\n");
	}
	else{
		int z;
		printf("Enter Number to Insert : \n");
		scanf("%d",&z);
		cq[r] = z;
		if(f==-1){
			f=0;
		}
	}
}

void cqdelete(){
    if(f == -1){
        printf("============================Queue is Empty!============================\n");
    }
    else if(f == r){  
        f = -1;
        r = -1; 
        printf("Element deleted. Queue is now empty.\n");
    }
    else{
        printf("Element deleted: %d\n", cq[f]);
        if(f == n - 1) {
            f = 0; 
        }
        else {
            f = f + 1;  
        }
    }
}


void display(){
	int i;
	for(i=0;i<=r;i++){
		printf("%d \n",cq[i]);
	}
}

void main(){
	int x;
	while(x!=4){
		
		printf("1.Enter 1 to Enqueq : \n");
		printf("2.Enter 2 to Dequeq : \n");
		printf("3.Enter 3 to Display : \n");
		scanf("%d",&x);
		
		switch(x){
			case 1:
				cqinsert();
				break;
			case 2:
				cqdelete();
				break;
			case 3:
				display();
				break;
		}
	}
}













