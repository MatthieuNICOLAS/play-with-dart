Play With Dart
==============

This project is a template to create a web application using [Play Framework](https://www.playframework.com/) to develop the back-end and [Dart](https://www.dartlang.org/) to code the front-end.

Getting Started
---------------

First, [install Play Framework](https://www.playframework.com/documentation/2.4.x/Installing).
Then, you have to add to **Eclipse** the [Dart Plugin](https://www.dartlang.org/tools/eclipse-plugin/).

Now you have to clone the repository:
```
git clone https://github.com/MatthieuNICOLAS/play-with-dart.git
```

Import it to **Eclipse**. You may now run the application using the following commands:
```
cd path/to/play-with-dart
activator run
```

To access to your application, browse to <http://localhost:9000>
But depending on your browser, you may need to build the Dart files before. Indeed, Dart is only compatible with the browser Dartium.
To make it compatible with all browsers, you have to compile the Dart files. 
To do so, follow these steps:
* Switch to the **Eclipse's Dart perspective**
* Right click on **public/dart/pubspec.yaml**
* Select **Pub build** option
* Update references to Dart files like URLs. 
  * For example, *dart/web/play-with-dart.dart* &#8594; *dart/build/web/play-with-dart.dart*

It is important to remember that you will need to rebuild the project each time you update a Dart file and want to test the modifications into another browser than **Dartium**.

Tips
----

To not have to compile Dart files at each change, you may want to test your application using **Dartium**. But, if you use **Chromium** as a browser usually, you may encounter conflicts while trying to run **Dartium**.
Declare the following alias to launch it easily:
```
alias dartium='DART_FLAGS="--checked" ~/path/to/dart/chromium/chrome --remote-debugging-port=59509 --user-data-dir=~/.dartium --enable-experimental-web-platform-features --enable-html-imports --no-first-run --no-default-browser-check --no-process-singleton-dialog chrome://version/ http://localhost:9000'
```

Troubleshooting
---------------

[Dart Plugin](https://www.dartlang.org/tools/eclipse-plugin/) seems to be quite resource-consuming. You may then spot several freeze while using **Eclipse**. By default, only 512Mo are allocated to it. To increase this limit, open with your favorite editor *path/to/eclipse/eclipse.ini* and replace the default value into the following line by at least **1024** for 32-bit Eclipse (**2048** for 64-bit):
```
-Xmx512m
```

License
-------

Play With Dart is licensed under the GNU General Public License 3.

This program is free software: you can redistribute it and/or modify it under
the terms of the GNU General Public License as published by the Free Software
Foundation, either version 3 of the License, or (at your option) any later
version.

This program is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with
this program. If not, see <http://www.gnu.org/licenses/>.

The documentation, tutorial and source code are intended as a community
resource and you can basically use, copy and improve them however you want.
Included works are subject to their respective licenses.
