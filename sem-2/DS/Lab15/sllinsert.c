#include <stdio.h>
#include <stdlib.h>

struct node{
	int info;
	struct node *link;
};

struct node *first;
struct node *last;

void insert(int x){
	if(first == NULL){
		first = (struct node*)malloc(sizeof(struct node*));
		first->info=x;
		first->link=NULL;
	}
	else{
		struct node *newnode = malloc(sizeof(struct node*));
		newnode->info = x;
		newnode->link=first;
		first=newnode;
	}
}

void insertlast(int y){
	if(first == NULL){
		first = (struct node*)malloc(sizeof(struct node*));
		first->info=y;
		first->link=NULL;
	
	}
	else{
		struct node *newnode,*temp;
		newnode = (struct node*)malloc(sizeof(struct node*));
		temp = first;
		while((temp->link) != NULL){
			temp = temp->link;
		}
		newnode->info=y;
		newnode->link=NULL;
		temp->link=newnode;
	}	
}

void display(){
	struct node *temp;
	temp=first;
	if(first == NULL){
		printf("List is Empty!");
	}
	else{
		while(temp != NULL){
			printf("%d \n",temp->info);
			temp=temp->link;
		}
	}
}

void countnode(){
	struct node *temp;
	temp = first;
	if(first == NULL){
		printf("List is Empty!");
	}
	else{
		int count=0;
		while(temp != NULL){
			count ++;
			temp=temp->link;
		}
		printf("Number of Node : %d\n",count);
	}
}

void main(){
	int c,n;
	while(c != 5){
		printf("1. Enter 1 to Insert : \n");
		printf("2  Enter 2 to Insert-Last : \n");
		printf("3  Enter 3 to Display : \n");
		printf("4  Enter 4 to Node-count : \n");
		scanf("%d",&c);
		switch(c){
			case 1:
				printf("Enter Number : \n");
				scanf("%d",&n);
				insert(n);
					break;
			case 2:
				printf("Enter Number to last : \n");
				scanf("%d",&n);
				insertlast(n);
					break;
			case 3:
				display();
					break;
			case 4:
				countnode();
					break;
		}
	}
}

