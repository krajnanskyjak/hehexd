#ifndef __MAIN__C__
#define __MAIN__C__
#include"directories_count.h"


int main(int argc, char **argv) {

    recSwitch = FALSE;                                           //global variable to use for the recursive option

    if (argc == 2) {                                    //2 arguments = probably no recursive switch

        dirName = (char*) calloc(sizeof((*argv[1])), 1);    //global variables to save the name of the directory
        origDir = (char*) calloc(sizeof((*argv[1])), 1);
        strcpy(dirName, argv[1]);
        strcpy(origDir, argv[1]);

        if (directories_open(argv[1]) != TRUE) {
            perror(ERROR_MSG);
            return errno;
        }
        if (directories_count() != TRUE) {
            perror(ERROR_MSG);
            return errno;
        }
        if (directories_close() != TRUE) {
            perror(ERROR_MSG);
            return errno;
        }

    } else if (argc > 3) {                              //too many arguments
        errno = E2BIG;
        perror(ERROR_MSG);
        return errno;

    } else if (argc == 3) {
        if (strcmp(argv[1], "-r") == 0) {               //check if it's really a recursive switch, then set the variable

            dirName = (char*) calloc(sizeof((*argv[2])), 1);    //global variables to save the name of the directory
            origDir = (char*) calloc(sizeof((*argv[2])), 1);
            strcpy(dirName, argv[2]);
            strcpy(origDir, argv[2]);

            recSwitch = TRUE;

            if (directories_open(argv[2]) != TRUE) {
                perror(ERROR_MSG);
                return errno;
            }
            if (directories_count() != TRUE) {
                perror(ERROR_MSG);
                return errno;
            }
            if (directories_close() != TRUE) {
                perror(ERROR_MSG);
                return errno;
            }
        } else {
            errno = EINVAL;
            perror(ERROR_MSG);
            return errno;
        }
    } else {
        errno = EINVAL;
        perror(ERROR_MSG);
        return errno;
    }
}
#endif