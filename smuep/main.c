#include"infoPart.h"

int main(int argc, char** argv) {
	
	if(parti_prepare() == false) return 1;
	if(parti_print() == false) return 2;
	if(parti_close() == false) return 3;
	return 0;
}
