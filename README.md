Play With Dart
==============

This project is a template to create a web application using [Play Framework](https://www.playframework.com/) to develop the back-end and [Dart](https://www.dartlang.org/) to code the front-end.

Getting Started
---------------

First, [install Play Framework](https://www.playframework.com/documentation/2.4.x/Installing).
Then, you have to add to Eclipse the [Dart Plugin](https://www.dartlang.org/tools/eclipse-plugin/).

Now you have to clone the repository:
```
git clone https://github.com/MatthieuNICOLAS/play-with-dart.git
```

Import it to Eclipse. Before running the application, you have to compile the Dart files (only compatible with the browser Dartium) to produce the Javascript files (compatible with all browsers).
To do so, you need to: 
* Switch to the Eclipse's Dart perspective
* Right click on *public/dart/pubspec.yaml*
* Select *Pub build* option

It is important to remember that you will need to rebuild the project each time you want to test some changes into the Dart files.

Finally, to run the application, use the following commands:
```
cd path/to/play-with-dart
activator run
```

You can then access to the homepage at <http://localhost:9000>

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
