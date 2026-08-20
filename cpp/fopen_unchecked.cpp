#include <cstdio>

int main() {
    // Intentional bug: return value of fopen is not checked; fgets on NULL would crash
    FILE* f = fopen("nonexistent.txt", "r");
    char buf[100];
    // If fopen returns NULL, this is undefined behavior / potential null dereference
    fgets(buf, sizeof(buf), f);
    printf("Read: %s\n", buf);
    return 0;
}
