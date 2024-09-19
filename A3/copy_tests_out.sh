#!/bin/bash

for file in testfiles/ast/*.out; do
    cp $file testfiles/ast/$(basename $file .out).expected
done

for file in testfiles/prettyprint/*.out; do
    cp $file testfiles/prettyprint/$(basename $file .out).expected
done

for file in testfiles/visitor/*.out; do
    cp $file testfiles/visitor/$(basename $file .out).expected
done