#include"getMEM.h"

int main (int argc, char** argv) {
	if(mem_openFile(argv[1]) == false) return 1;
	if(mem_print() == false) return 2;
	if(mem_closeFile() == false) return 3;
	return 0;
}
