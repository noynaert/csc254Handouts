# 03.015 Truth Tables

## and

"If you wash the dishes AND clean your room I will give you $10.

Wash the Dishes|Clean your room| AND
:---:|:---:|:---:
False|False|$0
False|True|$0
True|False|$0
True|True|$10

### Same thing, using 0 for false and 1 for true

Wash the Dishes|Clean your room| AND
:---:|:---:|:---:
0|0|0
0|1|0
1|0|0
1|1|1

## or

"If you wash the dishes OR clean your room I will give you $10.

Wash the Dishes|Clean your room| OR
:---:|:---:|:---:
False|False|$0
False|True|$10
True|False|$10
True|True|$10

### Same thing, using 0 for false and 1 for true

Wash the Dishes|Clean your room| OR
:---:|:---:|:---:
0|0|0
0|1|1
1|0|1
1|1|1

### Truth tables with more conditions

Traditionally truth tables count down in binary to avoid missing options.

The sequence for 8 would be

```text
000
001
010
011
100
101
110
111
```
