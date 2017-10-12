#include<stdio.h>
#include<stdlib.h>

void test();

int main(int argc, char** argv) {
	test();
	test();
	test();
}

void test() {
	int i = 0;
	int *l = (int*) malloc(sizeof(int))
	*l = 0;
	*l = *l + 1;
	i++;
	printf("%d %d\n", i, *l);
}
