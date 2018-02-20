### Figures

Example classes for handling figures. This projects is a result from the 
[Software Bootcamp](https://www.youtube.com/watch?v=g8bXwYU1Y7U&list=PLnoPakspmPo6E_ySkPtmXr6-xu-75eCo4) 
(by [Carlos Obregon](https://twitter.com/gaijinco)), also is inspired in the book 
[Elegant Objects](www.yegor256.com/elegant-objects.html). 

#### Shape Builder

The Shape Builder class allows to create forms using a number of repetitions, lines, and 
a function for print based on the current line and position.

This is an example of printing a diagonal: 

```
*    
 *   
  *  
   * 
    *
```

```java
new Shape.Builder()
        .lines(5)
        .chars(5)
        .printer((line, on) -> line == on)
        .value();
```

Based on different combinations you can print different shapes in differents spaces, like circles, 
squares or others.  

#### Tests

All the code was created using TDD, so it was more easy to create the implementation.

<font size="3">Made with :heart: by [Cristian Gómez](https://twitter.com/iyubinest).</font>

License
-------

    Copyright 2018 Cristian Gómez

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.