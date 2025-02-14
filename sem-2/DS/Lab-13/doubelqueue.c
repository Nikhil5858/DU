#include<stdio.h>

#define n 10
int dq[n];
int f=-1;
int r=-1;

void inqueuerear(){
	if(r >= (n - 1)){
		printf("====================Stack is Overflow====================\n");
	}
	else{
		int z;
		printf("Enter Number to Insert : \n");
		scanf("%d",&z);
		r = r+1;
		dq[r] = z;
	}
	if(f == -1){
		f=0;
	}
}

void inqueuefront(){
	if(r >= (n - 1)){
		printf("====================Stack is Overflow====================\n");
	}
	else{
		int z;
		printf("Enter Number to Insert : \n");
		scanf("%d",&z);
		r = r+1;
		dq[r] = z;
	}
	if(f == -1){
		f=0;
	}
}

void dequeuefront(){
	if(f == -1){
		printf("====================Stack is Underflow====================\n");
	}
	else{
		int y = dq[f];
		dq[f] = '\0';
		if(f == 0 || r == 0){
			f = -1;
			r == -1;
		}
		else{
			f = f + 1;
		}
	}
}

void dequeuerear(){
	if(r == -1){
		printf("====================Stack is Underflow====================\n");
	}
	else{
		int y = dq[f];
		dq[f] = '\0';
		if(f == r){
			f=r=-1;
		}
		else{
			r=r-1;
		}
	}
}

void display(){
	int i;
	for(i=f;i<=r;i++){
		printf("%d \n",dq[i]);
	}
}

void reverse(){
	int i;
	for(i=r;i>=f;i--){
		printf("%d \n",dq[i]);
	}
}


void main(){
	int x;
	while(x!=){
		
		printf("1.Enter 1 to Enqueq Rear : \n");
		printf("2.Enter 2 to Enqueq Front : \n");
		printf("3.Enter 3 to Dequeq Front : \n");
		printf("4.Enter 4 to Dequeq Rear : \n");
		printf("5.Enter 5 to Display : \n");
		printf("6.Enter 6 to Reverse Queue : \n");
		scanf("%d",&x);
		
		switch(x){
			case 1:
				inqueuerear();
				break;
			case 2:
				inqueuefront();
				break;
			case 3:
				dequeuefront();
				break;
			case 4:
				dequeuerear();
				break;
			case 5:
				display();
				break;
			case 6:
				reverse();
				break;
		}
	}
}









