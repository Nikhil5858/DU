#include<stdio.h>
#include<ctype.h>
#include<string.h>

int top = -1;
char infix[100];
char postfix[100];
char s[100];

char pop(){
	if(top == -1){
		printf("Stack Is UnderFlow!");
		return '\0';
	}
	else{
		char x = s[top];
		s[top] = '\0';
		top--;
		return x;
	}
}

void push(char ch){
	if(top>=99){
		printf("Stack is Overflow");
	}
	else{
		top = top + 1;
		s[top]=ch;
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
	int i=0;
	int j=0;
	printf("Enter Infix Expression : \n");
	scanf("%s",input);
	
	input[strrev(input)] = ')';
	
	push('(');
	
	while(input[i] != '\0'){
		char temp = input[i];
		if(temp == '('){
			push(temp);
		}
		else if(isalnum(temp)){
			postfix[j] =temp;
			j++;
		}
		else if(temp == ')'){
			while(s[top] != '('){
				postfix[j] = pop();
				j++;
			}
			char x = pop();
		}
		else if(temp =='+' || temp == '-' || temp == '/'|| temp == '*' || temp == '^'){
			while(oppre(s[top]) > temp){
				postfix[j] = pop();
				j++;
			}
			push(temp);
		}
		i++;
	}
	printf("%s",postfix);
}








