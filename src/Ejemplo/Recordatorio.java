package Ejemplo;
import java.util.Stack;
public class Recordatorio {

        Stack<String> stack = new Stack<>();

        private int cima;

        public boolean estaVacia() {
            return cima == -1;
        }

        public boolean estaLlena() {
            return cima == stack.capacity() - 1;
        }
}