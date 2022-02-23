# Character Data

The data type char uses 'single quote' marks.  Character data is different than String data.

Character values may be assigned with either a character like 'A' may be defined by assigning the number 65;

Any of these would work:

```java
char symbol1 = 'A';
char symbol2 = 65;
char symbol3 = 0x65;
char symbol4 = '\u0065';
```

In effect Java treats character data more like integers than strings.

### ASCII

[https://www.asciitable.com/](https://www.asciitable.com/)

* The original ASCII Code was developed for use with teletype output
* Originally there were 7 bits.  This meant there can be 2<sup>7</sup> characters represented.
* The structure of the ASCII code is
  * 0 - 31 are control signals
  * 32 is the blank space
  * Zero is at 48
  * Capital letters start at 65.  'A' has an ASCII code of 65
  * Lower case letters start at 97.  'a' has an ASCII code of 97
  * The tilde mark '~' has an ASCII code of 127
* ASCII codes were designed for American English
* When bytes moved to 8-bits there were another 128 characters available
  * Letters with accent marks were included.  Most European languages were covered
  * Box drawing symbols were included
  * Mathematical and other useful special characters were included

### Unicode

Unicode constants may be represented as either quoted characters or as the unicode value.  The following should all get the same results.

```java
char symbol5 = '⊾';
char symbol6 = 0x22BE;
char symbol7 = '\u22BE';
```

For example, the unicode character '⊾' is may be represented as `\u22BE`  [See unicode page](https://unicode.org/charts/PDF/U2200.pdf)

* 16-bit Unicode allows 256 alphabets with up to 256 characters per letter
* Java support Unicode.  The problem is that the computer must also have the appropriate fonts to support the alphabet you are using.
* ASCII is basically first code group in Unicode.  So ASCII is a subset of Unicode

### Escape Sequences

Escape|Character|Name|ASCII<br>(decimal)|Unicode<br>(hex)
:---:|:---:|:---:|:---:|:---:
'\b'|⌫|Backspace|8|'\u0008'
'\t'|⭾|Tab|9|'\u0009'
'\n'|↵|Linefeed or Enter|10|'\u000A'
'\f'|&nbsp;|Form Feed|12|'\u000C'
'\r'|&nbsp;|Carriage Return|13|'\u000D'
'\\'|&bsol;|Backslash|92|\u005C
'\"'|"|Double Quote|34|\u0022

### Comparing and testing char data

Character data may be compared like most integer data.  Therefore ==, !=, &lt;, >, &lt;=, and >= work.