#ifndef __INFOPART_H_
#define __INFOPART_H_

//Wieso heisst das /proc-Filesystem virtuell?
//Unter /proc liegen keine "echten" Dateien und Verzeichnisse, sondern nur "Hooks" zum Kernel.
//Drinne stehen Informationen wie z.B. Wie viel Speicher uebrig ist, oder Informationen ueber
//den Prozessor. Es koennen auch Daten in /proc reingeschrieben werden, wenn man irgendetwas
//wie z.B. die CPU-Governors einstellen will.

#include<stdio.h>
#include<stdlib.h>
#include<errno.h>

typedef enum {true, false} bool;
FILE *fp;

bool parti_prepare();
bool parti_print();
bool parti_close();

#endif
