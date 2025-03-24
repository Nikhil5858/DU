#include <stdio.h>
#include <string.h>

#define max 50
#define length 50

char array[max][length];
int top = -1;

int push() {
    if (top >= max - 1) {
        printf("===========  Stack is Overflow  ===========\n");
        return -1;
    }
    else {
        char word[length];
        printf("\nEnter Word to Add: ");
        scanf("%s", word);
        top = top + 1;
        strcpy(array[top], word);
        printf("Added: %s\n", word);
        return 0;
    }
}

int pop() {
    if (top == -1) {
        printf("===========  Stack is Underflow  ===========\n");
        return -1;
    }
    else {
        printf("Undo: %s\n", array[top]);
        array[top][0] = '\0';
        top--;
        return 0;
    }
}


int display() {
	int i;
    if (top == -1) {
        printf("Array is empty.\n");
        return -1;
    }
    
    printf("\nCurrent Array:\n");
    for (i = 0; i <= top; i++) {
        printf("%s ", array[i]);
    }
    printf("\n");
    return 0;
}


int main() {
    int choice;
    
    printf("Text Editor\n");
    printf("=============\n");
    
    while(1) {
        printf("1. Add a word\n");
        printf("2. Undo last word\n");
        printf("3. Display Array\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        
        switch(choice) {
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
                printf("Exiting...\n");
                return 0;
            default:
                printf("Invalid choice!\n");
        }
    }
}
