#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
    int A, B;
    if (scanf("%d %d", &A, &B) != 2) {
        return 1;
    }
    printf("%.12lf\n", (double)A / (double)B);
    return 0;
}