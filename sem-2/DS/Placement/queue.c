#include <stdio.h>

#define num 5
int f = 0, r = 0;
int q[num];

void push() {
    if (r == num) { 
        printf("============================Queue is Overflow!============================\n");
        return;
    }

    int x;
    printf("Enter Number to push in Queue: ");
    scanf("%d", &x);

    q[r] = x; 
    r++;      
}

void pop() {
    if (f == r) { 
        printf("============================Queue is Underflow!============================\n");
        f = r = 0;
        return;
    }

    printf("Popped: %d\n", q[f]); 
    f++;
}

void display() {
	int i;
    if (f == r) { 
        printf("============================Queue is Empty!============================\n");
        return;
    }

    for (i = f; i < r; i++) { 
        printf("Queue Element: %d\n", q[i]);
    }
    printf("\n");
}

int main() {
    int z = 0;

    while (z != 4) {
        printf("\n1. Push\n");
        printf("2. Pop\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &z);

        switch (z) {
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            default:
                printf("Invalid choice!\n");
        }
    }
    return 0;
}

