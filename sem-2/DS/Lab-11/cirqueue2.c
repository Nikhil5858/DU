#include <stdio.h>
#define num 3
int array[num];
int f = -1;
int r = -1;

int enqueue(){
	if(r>=(num-1)){
		r=0;
	}
	else{
		r++;
	}
	if(r==f){
		printf("Queue is Full! \n");
	}
	else{
		int x;
		printf("Enter Number to Add : \n");
		scanf("%d",&x);
		array[r] = x;
		if(f==-1){
			f=0;
		}
	}
	
}

int dqueue(){
	if(f == -1){
		printf("Queue is Empty\n");
	}
	else if(f == r){
		f = -1;
		r = -1;
		printf("Last element is deleted!\n");
	}
	else{
		if(f == num -1){
			f =0;
		}
		else{
			f++;
		}
	}
}

int display(){
	int i;
	for(i=f;i<=r;i++){
		printf("%d \n",array[i]);
	}
}

void main(){
	int c;
	while(c!=4){
		printf("Enter 1 to Enqueue : \n");
		printf("Enter 2 to Dqueue : \n");
		printf("Enter 3 to Display : \n");
		scanf("%d",&c);
		switch(c){
			case 1 :
				enqueue();
				break;
			case 2 :
				dqueue();
				break;
			case 3 :
				display();
				break;
			default:
				printf("Invalid choice !");
				break;		
		}
	}
}
