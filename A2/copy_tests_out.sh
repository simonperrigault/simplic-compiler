#!/bin/bash

for file in testfiles/ast/*.out; do
    cp $file testfiles/ast/$(basename $file .out).expected
done