#include"parkhaus.h"
int main(int argc, char **argv) {
    pthread_t thread1;
    int i;

    i = pthread_create(&thread1, NULL, park, (void*) 243);

    pthread_join(thread1, NULL);
    return 0;
}