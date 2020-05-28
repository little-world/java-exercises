
/// if
if (x < 3)
  System.out.println("small");
#// if x is smaller then 3 print 'small'

/// if with block
if (x < 3) {
  System.out.println("small");
}
#// if x is smaller then 3 print 'small'

/// if
if (x < 3)
  System.out.println("small");
else
  System.out.println("big");
#// if x is smaller then 3 print 'small'
else print 'big'

/// if shortcut
int y  = x < 3 ? -1 : 1;
#// if x is smaller then 3  y becomes -1
else y becomes 1

/// types
String name = ""
switch(x) {
  case 1: case 2:
      name = "one or two"; break;
  case 3: name = "three"; break;
  default: name = "?"
}
#// a jump table
