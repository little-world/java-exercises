
/// if
if (x < 3)
  println("small")
#// if x is smaller then 3 print 'small'

/// if with block
if (x < 3) {
  println("small")
}
#// if x is smaller then 3 print 'small'

/// if
if (x < 3)
  println("small")
else
  println("big")
#// if x is smaller then 3 print 'small'
else print 'big'


/// short cut
int y  = if (x < 3) -1 else 1;
#// if x is smaller then 3  y becomes -1
else y becomes 1

/// when
var name = when(x) {
  1, 2 -> "one or two"
  3 -> "three"
  else -> "?"
}
#// pattern matching
