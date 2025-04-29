#include <stdio.h>
#define num 3	

int array[num];
int f=-1;
int r=-1;

int enqueue(){
	if(r>=(num-1)){
		printf("Queue is Full!\n");
	}
	else{
		int x;
		printf("Enter Number to Add : \n");
		scanf("%d",&x);
		r++;
		f=0;
		array[r] = x;
	}
	
}

int dqueue(){
	if(f == -1){
		printf("Queue Empty!\n");
	}
	else{
		int y = array[f];
		array[f] = '\0';
		if(f==r){
			f = -1;
			r = -1;
		}
		else{
			f++;
		}
	}
}


int display(){
	int i;
	for(i=0;i<=r;i++){
		printf("%d \n",array[i]);
	}
}

void main(){
	int c;
	while(c!=4){
		printf("Enter  1 to Enqueue : \n");
		printf("Enter  2 to Dqueue : \n");
		printf("Enter  3 to Display : \n");
		scanf("%d",&c);
		switch(c){
			case 1:
				enqueue();
				break;
			case 2:
				dqueue();
				break;
			case 3:
				display();
				break;
		}
	}
}
