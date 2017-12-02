# About

extJWNL WordNet 3.1 Map Data contains serialized dictionary files
from Unix version of WordNet 3.1 augmented with
an extJWNL configuration file.

# Getting started

In the pom.xml:

```xml
<dependency>
    <groupId>net.sf.extjwnl</groupId>
    <artifactId>extjwnl</artifactId>
    <version>1.9.4</version>
</dependency>
<dependency>
    <groupId>net.sf.extjwnl</groupId>
    <artifactId>extjwnl-data-wn31-map</artifactId>
    <version>1.0</version>
</dependency>
```

In the code:

```java
Dictionary d = Dictionary.getDefaultResourceInstance();
```

# Credits
This resource was created following [issue #22](https://github.com/extjwnl/extjwnl/issues/22) 
and draft from [Paul Landes](https://github.com/plandes/).