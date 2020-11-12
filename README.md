# Algo Cheatsheet
- [Bit Manipulation](#bit_manipulation)
  * Odd/Even Check 
- [Operations](#operations)
  * isPrime Logic


## <a id="bit_manipulation"></a>Bit Manipulation

* Odd/Even Check 
```java
System.out.println( (4&0) == 0);  --> true (for even values)
System.out.println( (4&0) == 1);  --> false (for odd values)
```

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
