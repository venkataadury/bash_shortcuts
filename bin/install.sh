#!/bin/bash

loc=`dirname $0`
cd $loc
loc=`pwd`
sudo cp *.cpp /bin
cd /bin
echo sudo g++ divi.cpp -g -w -o divi -O3 -I $loc/libraries_cpp/
sudo g++ divi.cpp -g -w -o divi -O3 -I $loc/libraries_cpp/
echo sudo g++ mul.cpp -g -w -o mul -O3 -I $loc/libraries_cpp/
sudo g++ mul.cpp -g -w -o mul -O3 -I $loc/libraries_cpp/
echo sudo g++ sub.cpp -g -w -o sub -O3 -I $loc/libraries_cpp/
sudo g++ sub.cpp -g -w -o sub -O3 -I $loc/libraries_cpp/
echo sudo g++ add.cpp -g -w -o add -O3 -I $loc/libraries_cpp/
sudo g++ add.cpp -g -w -o add -O3 -I $loc/libraries_cpp/
echo "Done with +,-,*,/"
cd $loc

echo Linking monc, monb, pathset, sd
sudo ln -s $loc/monb /bin/monb
sudo ln -s $loc/monc /bin/monc
sudo ln -s $loc/pathset /bin/pathset
sudo ln -s $loc/sd /bin/sd
echo "Done"
echo sudo ln -s $loc/math /bin/
sudo ln -s $loc/math /bin/
