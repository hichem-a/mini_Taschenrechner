
    import java.util.Scanner;

    public class  Mini_Taschenrechner{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double op1;
            double op2;
            char operator;
            Boolean b = false;
            // Eingabe die Operanden
            System.out.print("Geben Sie den ersten Operanden ein: ");
            op1 = scanner.nextDouble();
            System.out.print("Geben Sie den zweiten Operanden ein: ");
            op2 = scanner.nextDouble();

            // Eingabe des Operators
            System.out.print("Geben Sie den Operator (+, -, *, /) ein: ");
            do {
                operator = scanner.next().charAt(0);
                if (operator == '*' || operator == '+' || operator == '/' || operator == '-' ){
                    b= true;
                }
                else {
                    System.out.println("Dieser Taschenrechner unterstützt keine komplexen Operationen. Bitte geben Sie nur *, +, - oder / ein.");
                }
            }while (b != true);


            double ergebnis = 0;

            // Fallunterscheidung basierend auf dem Operator
            if (operator == '+') {
                ergebnis = op1 + op2;
            } else if (operator == '-') {
                if(op1>op2){
                    ergebnis=op1-op2;
                }
                else {
                    ergebnis= op2-op1;
                }

            } else if (operator == '*') {
                ergebnis = op1 * op2;
            } else if (operator == '/') {
                if (op2 != 0) {
                    ergebnis = op1 / op2;
                } else {
                    System.out.println("Division durch Null nicht erlaubt.");
                    return;
                }
            }

            // Ergebnis ausgeben
            System.out.println("Ergebnis: " + ergebnis);

            scanner.close();
        }
    }

