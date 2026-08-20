#include <stdio.h>
#include <string.h>

int main() {
    char buffer[32];
    printf("Enter name: ");
    gets(buffer);
    printf("Hello %s\n", buffer);
    return 0;
}

// gets() allows arbitrary stack buffer overflow through unbounded input.
