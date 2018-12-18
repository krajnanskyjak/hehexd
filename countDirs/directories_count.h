#ifndef __DIRECTORIES_COUNT__H__
#define __DIRECTORIES_COUNT__H__

#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<dirent.h>
#include<sys/types.h>
#include<string.h>
#include<sys/statfs.h>
#include<errno.h>
#include<unistd.h>
//my own library with some simple QoL functions
#include"ownLib.h"

//prefix to every error message printed out by perror()
#define ERROR_MSG "ERROR"
//the amount of bytes that are allocated to the padding at the beginning
#define PADDING_BASE_ALLOC 20
//the amount of bytes that are added in increments every time the padding variable runs out of memory
#define PADDING_INC_ALLOC 5

typedef enum BOOL {
    TRUE,
    FALSE,
} BOOL;

typedef struct dirent dirent;

//global variables to help navigate between directories
char* dirName;
char* origDir;

//global variable to indicate whether or not the user has passed a "-r" switch to list directories recursively
BOOL recSwitch;

DIR *dir;
dirent *dirEnt;
//struct statfs statFS;

//function prototypes
BOOL directories_open(char* pDir);
BOOL directories_count();
BOOL directories_close();

#endif