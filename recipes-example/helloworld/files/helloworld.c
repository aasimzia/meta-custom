#include "stdio.h"
#include "helloworld.h"

int main() {
    
    #if HELLO == y
    printf("Hello, World!\n");
    #endif
    
    #if WELCOME == y
    printf(|"Welcome to this world\n");
    #endif
    return 0;
}