#include"getMEM.h"

bool mem_openFile(char* fName) {
	fp = fopen("/proc/meminfo", "r");
	if(errno != 0) {
		perror("Error: ");
		return false;
	}
	return true;

}
bool mem_closeFile() {
	fclose(fp);
	if(errno != 0) {
		perror("Error: ");
		return false;
	}
	return true;
}
bool mem_print() {
	char sBuff[50];

	while(!feof(fp)) {
	fgets(sBuff, 50, fp);
	if(strstr(sBuff, "Mem") || strstr(sBuff, "Swap")) printf("%s", sBuff);
	}
	if(errno != 0) {
		perror("Error: ");
		return false;
	}
	
	return true;
}
