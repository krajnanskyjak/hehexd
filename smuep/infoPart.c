#include"infoPart.h"

bool parti_prepare() {
	fp = fopen("/proc/partitions", "r");
	if(fp == NULL) {
		perror("Error: ");
		return false;
	} else {return true;}
}

bool parti_print() {
	char sBuff[50];

	while(!feof(fp)) {
		fgets(sBuff, 50, fp);
		//nicht geschaft
	}
}

bool parti_close() {
	fclose(fp);
	if(errno != 0) {
		perror("Error: ");
		return false;
	} else {return true;}
}
