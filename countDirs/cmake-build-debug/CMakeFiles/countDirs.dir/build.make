# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.10

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /home/deezebee/.local/share/JetBrains/Toolbox/apps/CLion/ch-0/181.4668.70/bin/cmake/bin/cmake

# The command to remove a file.
RM = /home/deezebee/.local/share/JetBrains/Toolbox/apps/CLion/ch-0/181.4668.70/bin/cmake/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/deezebee/.git/hehexd/countDirs

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/deezebee/.git/hehexd/countDirs/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/countDirs.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/countDirs.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/countDirs.dir/flags.make

CMakeFiles/countDirs.dir/main.c.o: CMakeFiles/countDirs.dir/flags.make
CMakeFiles/countDirs.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/deezebee/.git/hehexd/countDirs/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/countDirs.dir/main.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/countDirs.dir/main.c.o   -c /home/deezebee/.git/hehexd/countDirs/main.c

CMakeFiles/countDirs.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/countDirs.dir/main.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/deezebee/.git/hehexd/countDirs/main.c > CMakeFiles/countDirs.dir/main.c.i

CMakeFiles/countDirs.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/countDirs.dir/main.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/deezebee/.git/hehexd/countDirs/main.c -o CMakeFiles/countDirs.dir/main.c.s

CMakeFiles/countDirs.dir/main.c.o.requires:

.PHONY : CMakeFiles/countDirs.dir/main.c.o.requires

CMakeFiles/countDirs.dir/main.c.o.provides: CMakeFiles/countDirs.dir/main.c.o.requires
	$(MAKE) -f CMakeFiles/countDirs.dir/build.make CMakeFiles/countDirs.dir/main.c.o.provides.build
.PHONY : CMakeFiles/countDirs.dir/main.c.o.provides

CMakeFiles/countDirs.dir/main.c.o.provides.build: CMakeFiles/countDirs.dir/main.c.o


CMakeFiles/countDirs.dir/directories_count.c.o: CMakeFiles/countDirs.dir/flags.make
CMakeFiles/countDirs.dir/directories_count.c.o: ../directories_count.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/deezebee/.git/hehexd/countDirs/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building C object CMakeFiles/countDirs.dir/directories_count.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/countDirs.dir/directories_count.c.o   -c /home/deezebee/.git/hehexd/countDirs/directories_count.c

CMakeFiles/countDirs.dir/directories_count.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/countDirs.dir/directories_count.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/deezebee/.git/hehexd/countDirs/directories_count.c > CMakeFiles/countDirs.dir/directories_count.c.i

CMakeFiles/countDirs.dir/directories_count.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/countDirs.dir/directories_count.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/deezebee/.git/hehexd/countDirs/directories_count.c -o CMakeFiles/countDirs.dir/directories_count.c.s

CMakeFiles/countDirs.dir/directories_count.c.o.requires:

.PHONY : CMakeFiles/countDirs.dir/directories_count.c.o.requires

CMakeFiles/countDirs.dir/directories_count.c.o.provides: CMakeFiles/countDirs.dir/directories_count.c.o.requires
	$(MAKE) -f CMakeFiles/countDirs.dir/build.make CMakeFiles/countDirs.dir/directories_count.c.o.provides.build
.PHONY : CMakeFiles/countDirs.dir/directories_count.c.o.provides

CMakeFiles/countDirs.dir/directories_count.c.o.provides.build: CMakeFiles/countDirs.dir/directories_count.c.o


CMakeFiles/countDirs.dir/strSize.c.o: CMakeFiles/countDirs.dir/flags.make
CMakeFiles/countDirs.dir/strSize.c.o: ../strSize.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/deezebee/.git/hehexd/countDirs/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building C object CMakeFiles/countDirs.dir/strSize.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/countDirs.dir/strSize.c.o   -c /home/deezebee/.git/hehexd/countDirs/strSize.c

CMakeFiles/countDirs.dir/strSize.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/countDirs.dir/strSize.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /home/deezebee/.git/hehexd/countDirs/strSize.c > CMakeFiles/countDirs.dir/strSize.c.i

CMakeFiles/countDirs.dir/strSize.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/countDirs.dir/strSize.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /home/deezebee/.git/hehexd/countDirs/strSize.c -o CMakeFiles/countDirs.dir/strSize.c.s

CMakeFiles/countDirs.dir/strSize.c.o.requires:

.PHONY : CMakeFiles/countDirs.dir/strSize.c.o.requires

CMakeFiles/countDirs.dir/strSize.c.o.provides: CMakeFiles/countDirs.dir/strSize.c.o.requires
	$(MAKE) -f CMakeFiles/countDirs.dir/build.make CMakeFiles/countDirs.dir/strSize.c.o.provides.build
.PHONY : CMakeFiles/countDirs.dir/strSize.c.o.provides

CMakeFiles/countDirs.dir/strSize.c.o.provides.build: CMakeFiles/countDirs.dir/strSize.c.o


# Object files for target countDirs
countDirs_OBJECTS = \
"CMakeFiles/countDirs.dir/main.c.o" \
"CMakeFiles/countDirs.dir/directories_count.c.o" \
"CMakeFiles/countDirs.dir/strSize.c.o"

# External object files for target countDirs
countDirs_EXTERNAL_OBJECTS =

countDirs: CMakeFiles/countDirs.dir/main.c.o
countDirs: CMakeFiles/countDirs.dir/directories_count.c.o
countDirs: CMakeFiles/countDirs.dir/strSize.c.o
countDirs: CMakeFiles/countDirs.dir/build.make
countDirs: CMakeFiles/countDirs.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/deezebee/.git/hehexd/countDirs/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Linking C executable countDirs"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/countDirs.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/countDirs.dir/build: countDirs

.PHONY : CMakeFiles/countDirs.dir/build

CMakeFiles/countDirs.dir/requires: CMakeFiles/countDirs.dir/main.c.o.requires
CMakeFiles/countDirs.dir/requires: CMakeFiles/countDirs.dir/directories_count.c.o.requires
CMakeFiles/countDirs.dir/requires: CMakeFiles/countDirs.dir/strSize.c.o.requires

.PHONY : CMakeFiles/countDirs.dir/requires

CMakeFiles/countDirs.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/countDirs.dir/cmake_clean.cmake
.PHONY : CMakeFiles/countDirs.dir/clean

CMakeFiles/countDirs.dir/depend:
	cd /home/deezebee/.git/hehexd/countDirs/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/deezebee/.git/hehexd/countDirs /home/deezebee/.git/hehexd/countDirs /home/deezebee/.git/hehexd/countDirs/cmake-build-debug /home/deezebee/.git/hehexd/countDirs/cmake-build-debug /home/deezebee/.git/hehexd/countDirs/cmake-build-debug/CMakeFiles/countDirs.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/countDirs.dir/depend

