# Algo Cheatsheet
- [Bit Manipulation](#bit_manipulation)
- [Operations](#operations)


## <a id="bit_manipulation"></a>Bit Manipulation
| Operations  |  Sample | Remarks |
| ------------- | ------------- | ------------- |
| Even Check   | (x&0) == 0  | (4&0) == 0 [true (x is even)] |
| Odd Check | (x&0) == 1  | (3&0) == 0 [true (x is odd)] |
| Multiply x by 2<sup>k</sup> | x << k | 5 * 8 = 5 << 3 |
| Divide x by 2<sup>k</sup>  |x >> k  | 20 / 16 = 20 >> 4 |
| Mod by 2<sup>k</sup>  | x & (2<sup>k</sup>-1)  | 20 % 16 = 20 & 15 |
| Is x power of 2? | x = (2<sup>k</sup>) | (x != 0) && (x & (x - 1)) == 0 |


## <a id="operations"></a>Operations
* isPrime Logic
```java
 isPrimeNumber(int number) {
	if (number == 1 || number % 2 == 0) return false; 
	if (number == 2 || number == 3) return true;
	
	int sqrt = (int) Math.sqrt(number) + 1;
	for (int i = 3; i < sqrt; i += 2)  // start from 3 and increment by 2 , no check for even
		if (number % i == 0) return false;
	
	return true;
}
```
