#include<stdio.h>
#include<string.h>
#include<sys/ipc.h>
#include<sys/shm.h>
#include"header.h"

int main(int argc, char** argv) {

int shID;
char* p;
char sBuff[100];
int retv = 0;
int i;

shID = shmget(KEY, MEM_MAX, FLAGS);

if(shID < 0) {
	perror("Mem not found.");
	retv = MEM_MISSING;
} else {
	p = shmat(shID, NULL, 0);
	
	for(i = 0; i < MEM_MAX; i++) {
		putchar(p[i]);
	}
}


return retv;
}
