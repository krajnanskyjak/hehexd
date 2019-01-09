#ifndef __PARKHAUS__H__
#define __PARKHAUS__H__

#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>

#define PARKCOUNT_MAX 500

int parkCount;
void *park(void *ptr);

#endif
