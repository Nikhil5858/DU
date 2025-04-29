#include <stdio.h>
#include <stdlib.h>

struct node{
	int info;
	struct node *link;
};

struct node *first = NULL;

void insertfirst(int x){
	struct node *newnode = (struct node*)malloc(sizeof(struct node));
	newnode->info = x;
	newnode->link = first;
	first = newnode;
}

void insertlast(int x){
	struct node *newnode = (struct node*)malloc(sizeof(struct node*));
	newnode->info = x;
	newnode->link = NULL;
	if(first == NULL){
		first = newnode;
	}
	else{
		struct node *temp = first;
		while(temp->link != NULL){
			temp = temp->link;
		}
		temp->link = newnode;
	}
}

void deletefirst(){
	if(first == NULL){
		printf("List is Empty\n");
	}
	struct node *temp = first;
	first= first->link;
	free(temp);
}

void deletelast(){
	if(first == NULL){
		printf("List is Empty\n");
	}
	if(first->link == NULL){
		free(first);
		first=NULL;
	}
	else{
		struct node *temp = first;
		while((temp->link->link!=NULL)){
			temp = temp->link;
		}
		free(temp->link);
		temp->link=NULL;
	}
}

void display(){
	struct node *temp = first;
	if(first == NULL){
		printf("List is Empty!\n");
	}
	while(temp != NULL){
		printf("%d\n",temp->info);
		temp = temp->link;
	}
}

void main(){
	int c,n;
	while(1){
		printf("Enter 1 to Insert First : \n");
		printf("Enter 2 to Insert Last : \n");
		printf("Enter 3 to Delete First : \n");
		printf("Enter 4 to Delete Last : \n");
		printf("Enter 5 to Display : \n");
		scanf("%d",&c);
		
		switch(c){
			case 1:
				printf("Enter Number to insert first : \n");
				scanf("%d",&n);
				insertfirst(n);
				break;	
			case 2:
				printf("Enter Number to insert last : \n");
				scanf("%d",&n);
				insertlast(n);
				break;
			case 3:
				deletefirst();
				break;
			case 4:
				deletelast();
				break;
			case 5:
				display();
				break;
			default:
				printf("Invalid choice!\n");
		}
	}
}

