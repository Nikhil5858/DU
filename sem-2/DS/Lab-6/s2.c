#include <stdio.h>
#define num 5
int array[num];
int top = -1;

int push(){
	if(top >= num-1){
		printf("Stack is Overflow!\n");
	}
	else{
		int x;
		printf("Enter Number to push :\n");
		scanf("%d",&x);
		top++;
		array[top] = x;
	}
}

int pop(){
	if(top == -1){
		printf("Stack is Underflow!\n");
	}
	else{
		int y = array[top];
		array[top] = '\0';
		top--;
		printf("Poped Element \n",y);
	}
}

int change(){
	if(top == -1){
		printf("Stack is Underflow!\n");
	}
	else{
		int a,b;
		printf("Enter index to chnage\n");
		scanf("%d",&a);
		printf("Enter Value to chnage\n");
		scanf("%d",&b);
		if(a>0 && a<=top){
			array[top - a + 1] = b;	
		}
	}
}

int display(){
	int i;
	for(i=top;i>=0;i--){
		printf("%d \n",array[i]);
	}
}

void main(){
	int c;
	while(c!=5){
		printf("Enter 1 to Push : \n");
		printf("Enter 2 to POP : \n");
		printf("Enter 3 to Display : \n");
		printf("Enter 4 to Change : \n");
		scanf("%d",&c);
		switch(c){
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				change();
				break;
		}
	}
}
