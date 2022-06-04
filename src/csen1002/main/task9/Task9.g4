/**
 * Write your info here
 *
 * @name Karim Ebrahim
 * @id 43-0414
 * @labNumber 10
 */

grammar Task9;

@members {
	/**
	 * Compares two integer numbers
	 *
	 * @param x the first number to compare
	 * @param y the second number to compare
	 * @return 1 if x is equal to y, and 0 otherwise
	 */
	public static int equals(int x, int y) {
	    return x == y ? 1 : 0;
	}
}

s returns [int check]:
 a c b  {$check = equals($a.n,$b.n) * equals($a.n,$c.n);} ;

a returns [int n]:
 'a' a1 = a {$n = $a1.n + 1 ;} | {$n=0;} ;

c returns [int n]:
 'c' c1 = c {$n = $c1.n + 1 ;} | {$n=0;} ;

b returns [int n]:
 'b' b1 = b {$n = $b1.n + 1 ;} | {$n=0;} ;

// Write additional lexer and parser rules here