#include<stdio.h>

#define n 10
int q[n];
int f=-1;
int r=-1;

void inqueue(){
	if(f == r){
		printf("====================Queue is Overflow====================\n");
	}
	else{
		int z;
		printf("Enter Number to Insert : \n");
		scanf("%d",&z);
		r = 1;
		r = r+1;
		q[r] = z;
	}
	if(f == -1){
		f=0;
	}
}

void dequeue(){
	if(f == -1){
		printf("====================Queue is Underflow====================\n");
	}
	else{
		int y = q[f];
		q[f] = '\0';
		if(f == 0 || r == 0){
			f = -1;
			r == -1;
		}
		else{
			f = f + 1;
		}
	}
}

void display(){
	int i;
	for(i=f;i<=r;i++){
		printf("%d \n",q[i]);
	}
}

void reverse(){
	int i;
	for(i=r;i>=f;i--){
		printf("%d \n",q[i]);
	}
}


void main(){
	int x;
	while(x!=5){
		
		printf("1.Enter 1 to Enqueq : \n");
		printf("2.Enter 2 to Dequeq : \n");
		printf("3.Enter 3 to Display : \n");
		printf("4.Enter 4 to Reverse Queue : \n");
		scanf("%d",&x);
		
		switch(x){
			case 1:
				inqueue();
				break;
			case 2:
				dequeue();
				break;
			case 3:
				display();
				break;
			case 4:
				reverse();
				break;
		}
	}
}









