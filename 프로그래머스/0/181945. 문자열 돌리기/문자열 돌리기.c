#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define LEN_INPUT 11
int main() {
	char str[LEN_INPUT];
	scanf("%s", str);
	for (int i = 0;str[i] != '\0'; i++) {
		printf("%c\n", str[i]);
	}
}
