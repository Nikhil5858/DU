#include<stdio.h>
#include<ctype.h>

int top = -1;
char s[100];
int op1,op2,value=0;

void push(char ch){
	if(top >= 99){
		printf("Stack is Overflow!");
	}else{
		top = top + 1;
		s[top] = ch;
	}
}

char pop(){
	if(top == -1){
		printf("Stack is Underflow!");
	}
	else{
		return s[top--];
	}
}

int preop(char op){
	switch(op){
		case '+':
			return op1+op2;
			break;
		case '-':
			return op1-op2;
			break;
		case '*':
			return op1*op2;
			break;
		case '/':
			return op1/op2;
			break;
		default:
			return 0;
	}
}

void main(){
	char postfix[100];
	printf("Enter Postfix Value: ");
	scanf("%s",postfix);
	int i=0;
	char temp;
	
	while(postfix[i] != '\0'){
		temp = postfix[i];
		
		if(isdigit(temp)){
			push(temp);
		}
		else{
			char c = pop();
			op2 = c - '0';
			c = pop();
			op1 = c - '0';
			value = preop(temp);
			push(value + '0');
		}
		i++;
	}
	printf("%d",pop() - '0');
}










