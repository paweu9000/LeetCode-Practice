class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        fizzbuz = []
        for i in range(1, n+1):
            if i%3==0 and i%5==0:
                fizzbuz.append('FizzBuzz')
            elif i%3==0 and i%5!=0:
                fizzbuz.append('Fizz')
            elif i%3!=0 and i%5==0:
                fizzbuz.append('Buzz')
            else:
                fizzbuz.append(str(i))
        return fizzbuz