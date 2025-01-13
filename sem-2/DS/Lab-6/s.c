#include<stdio.h>

#define num  5
int array[num];
int top = -1;

int push(){
	if(top >= num-1){
		printf("===========  Stack is Overflow  ===========");
	}
	else{
		int x;
		printf("\nEnter Element to Push : \n");
		scanf("%d",&x);
		top = top + 1;
		array[top] = x;
	}
}

int pop(){
	if(top == -1){
		printf("===========  Stack is Underflow  ===========");
	}
	else{
		int y = array[top];
		array[top] = '\0';
		top--;
		printf("Poped Element is : %d\n",y);	
	}	
}

int peep(){
	if(top == -1){
		printf("===========  Stack is Underflow  ===========");
	}
	else{
		int z;
		printf("\nEnter Element to Search : \n");
		scanf("%d",&z);
		if(z >= 0 && z <= z+1){
			printf("\nElements is : %d\n",array[top - z + 1]);
		}
	}
}

int change(){
	if(top == -1){
		printf("===========  Stack is Underflow  ===========");
	}
	else{
		int a,b;
		printf("Enter Element Index : \n");
		scanf("%d",&a);
		printf("Enter Element to Change : \n");
		scanf("%d",&b);
		if(a>=0 && a<= top){
			array[top - a + 1] = b;
		}
	}
}
int display(){
	int i;
	for(i=top;i>=0;i--){
		printf("%d\n",array[i]);
	}
}

void main(){
	int c;
	while(c != 6){
		printf("1.Enter 1 to Push : \n");
		printf("2.Enter 2 to Display : \n");
		printf("3.Enter 3 to Pop : \n");
		printf("4.Enter 4 to Peep : \n");
		printf("5.Enter 5 to Change : \n");
		scanf("%d",&c);
		
		switch(c){
			case 1:
				push(); break;
			case 2:
				display(); break;
			case 3:
				pop(); break;
			case 4:
				peep(); break;
			case 5:
				change(); break;
		}
	}	
}
