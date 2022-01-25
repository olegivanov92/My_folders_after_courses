package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_3;
//task 21
public class TestException extends Exception {
    public static void main(String args[]) {
            try {
                throw new TestException();
            } catch(TestException t) {
                System.out.println("Got the Test Exception");
            } finally {
                System.out.println("Inside finally block ");
            }
        }
    }

    // Результат 1.

//task 21
   /* Какой результат мы получим?
        1. Got the Test Exception
        Inside finally block

        2. Got the Test Exception

        3. Inside finally block

        4. Compiler Error*/

