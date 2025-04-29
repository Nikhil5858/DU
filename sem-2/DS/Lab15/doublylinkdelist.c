#include <stdio.h>
#include <stdlib.h>

struct node {
    int info;
    struct node *prev, *next;
};

struct node *head = NULL;

void insertFirst(int x) {
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode->info = x;
    newnode->prev = NULL;
    newnode->next = head;
    if (head != NULL) {
        head->prev = newnode;
    }
    head = newnode;
}

void insertLast(int x) {
    struct node *newnode = (struct node*)malloc(sizeof(struct node));
    newnode->info = x;
    newnode->next = NULL;
    if (head == NULL) {
        newnode->prev = NULL;
        head = newnode;
        return;
    }
    struct node *temp = head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newnode;
    newnode->prev = temp;
}

void deleteFirst() {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }
    struct node *temp = head;
    head = head->next;
    if (head != NULL) {
        head->prev = NULL;
    }
    free(temp);
    printf("First element deleted.\n");
}

void deleteLast() {
    if (head == NULL) {
        printf("List is empty!\n");
        return;
    }
    struct node *temp = head;
    if (temp->next == NULL) {
        free(head);
        head = NULL;
        printf("Last element deleted.\n");
        return;
    }
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->prev->next = NULL;
    free(temp);
    printf("Last element deleted.\n");
}

void display() {
    struct node *temp = head;
    if (head == NULL) {
        printf("List is Empty\n");
        return;
    }
    printf("List: ");
    while (temp != NULL) {
        printf("%d <-> ", temp->info);
        temp = temp->next;
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

