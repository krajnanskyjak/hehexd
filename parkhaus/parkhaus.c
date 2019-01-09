#include"parkhaus.h"

void *park(void *ptr) {

    int val = *((int*) ptr);
    parkCount = val;
    printf("\nArgument: %d", val);
    printf("\nparkCount: %d", parkCount);

    return 0;
}
