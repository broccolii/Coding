#! /bin/bash

fruit=apple
count=5
echo "We have $count ${fruit}(s)"

# 环境变量
echo "----- PATH -----"
echo $PATH˜ | tr ':' '\n'
echo "----- HOME -----"
echo $HOME
echo "----- PWD -----"
echo $PWD
echo "----- USER -----"
echo $USER
echo "----- UID -----"
echo $UID
echo "----- SHELL -----"
echo $SHELL
echo $0


