# Algo Cheatsheet
- [Bit Manipulation](#bit_manipulation)
- [Operations](#operations)


## <a id="bit_manipulation"></a>Bit Manipulation
* Odd/Even Check 
```java
System.out.println( (4&0) == 0);  --> true (for even values)
System.out.println( (4&0) == 1);  --> false (for odd values)
```

| Operations  | Java Sample | Remarks |
| ------------- | ------------- | ------------- |
| Even Check   | (x&0) == 0  | (4&0) == 0 [true (x is even)] |
| Odd Check | (x&0) == 1  | (3&0) == 0 [true (x is odd)] |
| Multiply x by 2<sup>k</sup> | x << k | 5 * 8 = 5 << 3 |
| Document Service  | http://localhost:9354/  | Y |
| Third Party Service  | http://localhost:9355/  | N |
| Zipkin Service | http://localhost:9092/ | NA |


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
