cmake_minimum_required(VERSION 3.10)
project(parkhaus C)

set(CMAKE_C_STANDARD 11)

add_executable(parkhaus main.c parkhaus.c)

set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -pthread")