#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include"/home/deezebee/.git/hehexd/countDirs/ownLib.h"

int main (int argc, char** argv) {
	char* lel = calloc(sizeof(char), 13);
	strcpy(lel, "haha");
	printf("%lu", strSize(lel));
	return 0;
}
