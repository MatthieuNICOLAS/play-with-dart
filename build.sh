#!/bin/bash

path='public/dart/web'
appName='play-with-dart'

dart2js -o $path/$appName.dart.js $path/$appName.dart
./activator dist
