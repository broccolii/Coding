#!/bin/bash

# 变量
your_name='broccoli'
echo $your_name

# 拼接字符串
greeting="hello, "$your_name"!"
greeting_1="hello,${your_name}!"
greeting_2="hello,\"${your_name}\"!"
greeting_3="hello,"${your_name}"!"
echo $greeting $greeting_1 $greeting_2 $greeting_3

# 获取字符串长度
string="abcd"
echo ${#string}

# 提取子字符串
string="hello,broccoli"
echo ${string:6:13}

# 查找字符串
string="alibaba is a great company"
expr index $string 'baba' 