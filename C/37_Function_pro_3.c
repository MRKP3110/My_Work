#include<stdio.h>

//Write a function that prints Namaste if user is indian & Bonjour if the user is french.

void namaste();
void bonjour();

int main(){
    printf("Enter f for french & i for indian:");
    char ch ;
    scanf("%c",&ch);

    if (ch == 'i'){
        namaste();
    }else{
        bonjour();
    }
    return 0 ;
}

void namaste(){
    printf("Namaste\n");
}

void bonjour(){
    printf("Bonjour\n");
}