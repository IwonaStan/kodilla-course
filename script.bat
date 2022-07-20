cls
cd build/libs
del *.jar
cd..
cd..

call gradlew build

IF EXIST Project echo Directory already exists
IF NOT EXIST Project GOTO 1

cd build/libs
IF EXIST *.jar GOTO 2
IF NOT EXIST *.jar echo Compile error

:1
mkdir Project
:2
copy build\libs\*.jar Project