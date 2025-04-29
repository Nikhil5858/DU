#include <stdio.h>
#include <stdlib.h>

struct node {
    int info;
    struct node *Lptr, *Rptr;
};

struct node *first = NULL;

void insertFirst(int x) {
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode->info = x;
    newnode->Lptr = NULL;
    newnode->Rptr = first;
    if (first != NULL) {
        first->Lptr = newnode;
    }
    first = newnode;
}

void insertLast(int x) {
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode->info = x;
    newnode->Rptr = NULL;
    if (first == NULL) {
        newnode->Lptr = NULL;
        first = newnode;
        return;
    }
    struct node *temp = first;
    while (temp->Rptr != NULL) {
        temp = temp->Rptr;
    }
    temp->Rptr = newnode;
    newnode->Lptr = temp;
}

void deleteFirst() {
    if (first == NULL) {
        printf("List is empty!\n");
        return;
    }
    struct node *temp = first;
    first = first->Rptr;
    if (first != NULL) {
        first->Lptr = NULL;
    }
    free(temp);
    printf("First element deleted.\n");
}

void deleteLast() {
    if (first == NULL) {
        printf("List is empty!\n");
        return;
    }
    struct node *temp = first;
    if (temp->Rptr == NULL) {
        free(first);
        first = NULL;
        printf("Last element deleted.\n");
        return;
    }
    while (temp->Rptr != NULL) {
        temp = temp->Rptr;
    }
    temp->Lptr->Rptr = NULL;
    free(temp);
    printf("Last element deleted.\n");
}

void display() {
    struct node *temp = first;
    if (first == NULL) {
        printf("List is Empty\n");
        return;
    }
    printf("List: ");
    while (temp != NULL) {
        printf("%d <-> ", temp->info);
        temp = temp->Rptr;
    }
    printf("NULL\n");
}

int main() {
    int c, n;
    while (1) {
        printf("\n1. Insert First\n");
        printf("2. Insert Last\n");
        printf("3. Display\n");
        printf("4. Delete First\n");
        printf("5. Delete Last\n");
        printf("6. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &c);
        
        switch (c) {
            case 1:
                printf("Enter Number to Insert First: ");
                scanf("%d", &n);
                insertFirst(n);
                break;
            case 2:
                printf("Enter Number to Insert Last: ");
                scanf("%d", &n);
                insertLast(n);
                break;
            case 3:
                display();
                break;
            case 4:
                deleteFirst();
                break;
            case 5:
                deleteLast();
                break;
            case 6:
                exit(0);
            default:
                printf("Invalid Choice!\n");
        }
    }
    return 0;
}

