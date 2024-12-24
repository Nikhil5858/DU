#include <stdio.h>

void main() {
    int num;
    printf("Enter number: ");
    scanf("%d", &num);
    
    int i;
    int prime = 1;  
    
   
    for(i = 2; i < num; i++){
        if(num % i == 0){
            prime = 0; 
            break;
        }
    }
    
    if(prime == 1) {
        printf("Number is Prime\n");
    }
    else {
        printf("Number is Not Prime\n");
    }
}

