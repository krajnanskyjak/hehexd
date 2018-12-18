#ifndef __STRSIZE__C__
#define __STRSIZE__C__
#include"ownLib.h"

unsigned long strSize(char* string) {
    unsigned long i;
    for(i = 0; string[i] != '\0'; i++);
    return i+1;
}

#endif