```java
There are 4 very important properties of XOR that we will be making use of. These are formal mathematical terms but actually the concepts are very simple.

Commutative : A ⊕ B = B ⊕ A

This is clear from the definition of XOR: it doesn’t matter which way round you order the two inputs.
Associative : A ⊕ ( B ⊕ C ) = ( A ⊕ B ) ⊕ C

This means that XOR operations can be chained together and the order doesn’t matter. If you aren’t convinced of the truth of this statement, try drawing the truth tables.
Identity element : A ⊕ 0 = A

This means that any value XOR’d with zero is left unchanged.
Self-inverse : A ⊕ A = 0

This means that any value XOR’d with itself gives zero.

Explaination:
if there are 2 array [a, b] and [c, d] both are even length;
final output is (a ⊕ c ) ⊕ (a ⊕ d) ⊕ (b ⊕ c)  ⊕(b ⊕ d)
=> (a ⊕ a ) ⊕ (b ⊕ b) ⊕ (c ⊕ c) ⊕ (d ⊕ d)
=> 0
else if one is odd i.e. [a, b] and [c, d, e]
final output is (a ⊕ c ) ⊕ (a ⊕ d) ⊕ (a ⊕ e) ⊕ (b ⊕ c) ⊕ (b ⊕ d)⊕ (b ⊕ e) 
=> (a ⊕ a ⊕ a)⊕ (b ⊕ b ⊕ b) ⊕ (c ⊕ c) ⊕ (d ⊕ d) ⊕(e⊕)
=> a ⊕ b

for [a, b, c] and [d, e]
=> d ⊕ e

for [a, b, c] and [d, e, f]
=> a ⊕ b  ⊕ c  ⊕ d  ⊕ e  ⊕ f

```