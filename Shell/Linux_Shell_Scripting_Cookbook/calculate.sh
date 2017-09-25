#! /bin/bash

no1=4;
no2=5;

let result=no1+no2
echo $result

let no1++
echo $no1

echo "---------------"

result=$[ no1 + 5 ]
echo $result

result=$(( no1 + 50 ))
echo $result

result=$(expr 3 + 4)
echo $result


# 浮点数计算
echo "4 * 0.25" | bc


no=54;
result=`echo "$no * 1.5" | bc`
echo $result

