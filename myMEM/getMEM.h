#ifndef __GET_MEM
#define __GET_MEM

#include<stdio.h>
#include<string.h>
#include<errno.h>

typedef enum {false, true} bool;
FILE *fp;

bool mem_openFile(char *fName);
bool mem_closeFile();
bool mem_print();
#endif
