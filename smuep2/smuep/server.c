#include<stdio.h>
#include<sys/ipc.h>
#include<sys/shm.h>
#include<string.h>
#include"header.h"

int main(int argc, char** argv) {

int shID;
int retv=MEM_OK;
int i;
char* p;
char pressedKey;
char sBuff[100];

shID = shmget(KEY, MAX_MEM, IPC_CREAT | FLAGS);

if(shID < 0) {
	 perror("Mem not found.");
	 retv=MEM_MISSING;
} else {
	p = shmat(shID, NULL, 0);

	
	strcat(p, "Operator: Jakub Krajnansky\nCounter: 1010\nGreeting: Hello World!");

	//fgets(sBuff, 100, p);
	//printf(sBuff);

	shmdt(p);
	pressedKey = getchar();
	while(pressedKey != 'd') {
		pressedKey = getchar();
	}
	shmctl(shID, IPC_RMID, NULL);
	retv=MEM_OK;
}


return retv;
}
