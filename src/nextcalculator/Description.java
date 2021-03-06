package nextcalculator;

class Description {

    public static String getTask() {
        return "\t\t\tПростой консольный калькулятор." +
                    "\nКалькулятор выполняет простые операции: сложения, вычитания, умножения и деления с двумя числами, " +
                    "\n\t например: a + b, a - b, a * b, a / b." +
                    "\nКалькулятор принимает на вход целые числа только от 1 до 10 включительно, но не больше." +
                    "\nДанные вводятся в одну строку." +
                    "\nКалькулятор умеет работать одновременно только или с арабскими (1,2,3,4,5…)," +
                    "\n или с римскими (I,II,III,IV,V…) цифрами." +
                    "\n\n \t\tВведите действие:\n";
    }

    public static void show(){
        System.out.println(getTask());
    }
}
