package Funciones;
import javax.swing.*;

public class InputsHelper {

    public static int getNum(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero;"));
        return num;
    }
    public static String getString(){
        String chain = JOptionPane.showInputDialog("Ingresa una cadena: ");
        return chain;

    }
    public static boolean getInRange(){
        var min = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero Minimo"));
        var max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero Maximo"));
        var current = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que quiere verificar;"));
        boolean out = false;
        if(current>=min && current<=max){
            out = true;
        }else{
            return out;
        }

        return out;
    }
    public static int getIndex(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese indice entero"));
        return num;
    }


}
