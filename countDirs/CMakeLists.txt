cmake_minimum_required(VERSION 3.10)
project(countDirs C)

set(CMAKE_C_STANDARD 11)

add_executable(countDirs main.c directories_count.c ownLib.h directories_count.h strSize.c)