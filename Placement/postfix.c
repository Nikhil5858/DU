#include<stdio.h>
#include<string.h>
#include<ctype.h>

int top = -1;
char s[100];
char postfix[100];

void push(char ch){
	if(top>=99){
		printf("Stack is Overflow");
	}
	else{
		top = top + 1;
		s[top]=ch;
	}
}

int pop(){
	if(top == -1){
		printf("Stack is Underflow!");
		return '\0';
	}
	else{
		return s[top--];
	}
}

int oppre(char op){
	switch(op){
		case '+':
		case '-':
			return 1;
			break;
		case '*':
		case '/':
			return 2;
			break;
		case '^':
			return 3;
			break;
		default:
			return 0;
	}
}

int main(){
	char input[100];
	int i=0,j=0;
	printf("Enter Infix Operation to convert Postfix : \n");
	scanf("%s",input);
	
	strcat(input,")");
	
	push('(');
	
	while(input[i] != '\0'){
		
		char temp = input[i];
		
		if(temp == '('){
			push(temp);
		}
		else if(isalnum(temp)){
			postfix[j] = temp;
			j++;
		}
		else if(temp == ')'){
			while(s[top] != '('){
				postfix[j] = pop();
				j++;
			}
			char x = pop();
		}
		else if(temp == '+' || temp == '-' || temp == '*'|| temp == '/'|| temp == '^'){
			while(oppre(s[top]) >= oppre(temp)){
				postfix[j] = pop();
				j++;
			}
			push(temp);
		}
		i++;
	}
	printf("%s",postfix);
}
























