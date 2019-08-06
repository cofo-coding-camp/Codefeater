#!/usr/bin/env bash
awk 'NR==10{print $0}' data/files_ten.txt
sed -n 10p data/files_ten.txt