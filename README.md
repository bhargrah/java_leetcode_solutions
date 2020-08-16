# Algo Hacks

# Table of Content
- [Bit Manipulation](#bit_manipulation)
- [Operations](#operations)
- [Observability in Microservices?](#observability)
- [How do Microservice Communicate?](#communication)
- [How to Security/Authentication in Microservice?](#secure_auth)
- [How to Load Test Your Microservice?](#load_test)


## <a id="bit_manipulation"></a>Bit Manipulation
* Odd/Even Check 
```java
System.out.println( (4&0) == 0);  --> true (for even values)
System.out.println( (4&0) == 1);  --> false (for odd values)
```

## <a id="operations"></a>Operations

* isPrime Logic
```java
public static boolean isPrimeNumber(int number) {
		//optimization , do not loop through below logic if number is present in dict
		if(prime_dict.contains(number)) return true;
		
		if (number == 2 || number == 3) return true;
		
		if (number == 1 || number % 2 == 0) return false;
		
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 3; i < sqrt; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
```
