#include<stdio.h>

#define num 5
int array[num];
int top = -1;

void push(){
	if(top >= num-1){
		printf("======================  Stack is Overflow  ======================\n");
	}
	else{
		int x;
		printf("Enter Number For Push In Array : \n");
		scanf("%d",&x);
		top = top + 1;
		array[top] = x;
	}
}

void pop(){
	if(top == -1){
		printf("======================  Stack is Underflow  ======================\n");
	}
	else{
		int y = array[top];
		array[top] = '\0';
		top--;
		printf("Pop Element in Stack is : %d\n",y); 
	}
}

void peep(){
	if(top == -1){
		printf("======================  Stack is Underflow  ======================\n");
	}
	else{
		int found = 0;
		int z,i;
		printf("Enter Number To Search : \n");
		scanf("%d",&z);
		for(i=0;i<array[top];i++){
			if(array[i] == z+1 ){
				found = 1;
				break;	
			}				
		}
		
		if(!found){
			printf("\nNot Found in Elements : \n");
		}
		
		printf("\nPeep Element is : %d\n",array[top]);
		
	}
}

void display(){
	int i;
	for(i=0;i<array[top];i++){
		printf("Stack Element is : %d\n",array[i]);
	}
}


void main(){
	int c;
	while(c != 6){
		printf("1. Enter Number  1 to Push : \n");
		printf("2. Enter Number  2 to Pop : \n");
		printf("3. Enter Number  3 to Peep : \n");
		printf("4. Enter Number  4 to Display : \n");
		printf("5. Enter Number  5 to Change : \n");
		printf("6. Enter Number  6 to Exit : \n");
		scanf("%d",&c);
		
		switch(c)
		{
			case 1 : 
				push(); break;
			case 2 : 
				pop(); break;
			case 3 : 
				peep(); 
				break;
			case 4 : 
				display();
			break;
//			case 5 : 
//				display();
//			break;
//			case 6 : 
//				Exit();
//			break;
//			default:
//				printf("Invalid Input");
		}	
	}	
}
