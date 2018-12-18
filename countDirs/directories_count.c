#ifndef __DIRECTORIES_COUNT__C__
#define __DIRECTORIES_COUNT__C__
#include"directories_count.h"


BOOL directories_open(char *pDir) {
    chdir(pDir);

    dir = opendir(pDir);

    if (dir == NULL) {
        return FALSE;
    } else {
        return TRUE;
    }

}

BOOL directories_count() {
    //char buff[FILENAME_MAX];
    //statfs(getcwd(buff, FILENAME_MAX), &statFS);
    //char cmd[100];
    //char *str = malloc(sizeof(char)*(int)log10(num));


    if (recSwitch == TRUE) {

        /*
         * padding to better display the recursive directory tree
         * both variables are static so they keep the same value across all function frames
         * */
        static char *padding;
        static unsigned int padding_alloc_size;
        if(padding == NULL) {
            padding = (char*) calloc(sizeof(char), PADDING_BASE_ALLOC); //if padding points to NULL, assign PADDING_BASE_ALLOC
            padding_alloc_size = PADDING_BASE_ALLOC;                    //bytes of memory to it and keep track of the size.
            strcpy(padding, "");                                        //zero-terminate the empty string before concantenating
        }
                                                                        //later on


        char* nextDir = calloc(sizeof(*dirName), 1);                    //more dynamic mem alloc just for the sake of it

        while ((dirEnt = readdir(dir)) != NULL) {                       //keep executing until there are no more directories to read

            if ((dirEnt->d_type == DT_DIR) && (strcmp(dirEnt->d_name, ".")) && (strcmp(dirEnt->d_name, ".."))) {
                printf("%s\n", dirEnt->d_name);

                /*
                 * If another directory is found inside the old one, reallocate the mem of nextDir to the size of old
                 * directory name + the size of the newly found directory. One more byte is allocated at the end as well
                 * for the slash.
                 * After this, the nextDir variable is concantenated to form a new absolute path to the new directory
                 * which will then be recursively read as well. This continues until the deepest directory has no more
                 * directories of its own.
                 *
                 * Example: Old directory = /home/user, new dir is found called dir1
                 * ----> variable concantenation = /home/user + / + dir1
                 * */
                nextDir = (char*) realloc(nextDir, sizeof(*dirName) + sizeof(dirEnt->d_name) + 1);
                strcat(nextDir, dirName);
                strcat(nextDir, "/");
                strcat(nextDir, dirEnt->d_name);

                /*
                 * increase padding memory by PADDING_INC_ALLOC bytes every time it becomes too small to hold one more
                 * char
                 * */
                if(strSize(padding) >= padding_alloc_size) {
                    padding = realloc(padding, padding_alloc_size + PADDING_INC_ALLOC);
                    padding_alloc_size += PADDING_INC_ALLOC;
                }

                /*
                 * append another \t with every new recursive call that goes deeper into the directory structure
                 * */
                strcat(padding, "\t");
                directories_open(nextDir);
                strcpy(dirName, nextDir);               //copy the contents of nextDir to dirName so the program can
                printf("%s", padding);                  //form a new reference point for every new recursive call
                directories_count();
                directories_close();

                /*
                 * remove one /t every time the function returns and goes back to its parent directory
                 * */
                if((strcmp(dirName, nextDir))) {
                    printf("\nbut wait there's more\n");
                }

                //strcat(newDir, pDir);
            }
        }
        return TRUE;
    } else {
        /*
         * basically exactly the same as with the recursive switch, besides the functionality to print
         * directories recursively
         * */
        while((dirEnt = readdir(dir)) != NULL) {
            if((dirEnt->d_type == DT_DIR) && (strcmp(dirEnt->d_name, ".")) && (strcmp(dirEnt->d_name, ".."))) {

                printf("%s\n", dirEnt->d_name);
                //strcpy(cmd, "du --max-depth=1");
                //strcat(cmd, dirEnt->d_name);
                //system(cmd);
                //printf("\t");
                //system("");
                //printf("%lu\t\t\n\n", statFS.f_blocks*512);
                //printf(ultoa(statFS.f_blocks));
                //sprintf(str, "\t%d\n", statFS.f_blocks);

            }
        }

    }


    return TRUE;
}

BOOL directories_close() {
    if(!closedir(dir)) {
        return TRUE;
    } else {
        return FALSE;
    }
}
#endif