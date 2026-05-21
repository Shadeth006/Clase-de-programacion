package clase002;

import javax.swing.JOptionPane;

/**
 * Universidad Fidélitas Introducción a la Programación - Clase 02 Estructuras
 * de decisión: if, if-else, if compuesto, switch
 *
 * @author j4ckf3th
 */
public class Clase002 {

    public static void main(String[] args) {

        String lectura = " ";

        // PRÁCTICA EN CLASE 1: ¿Puede votar?
        lectura = JOptionPane.showInputDialog("Digite su edad:");
        int edad = Integer.parseInt(lectura);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Usted puede votar.");
        } else {
            JOptionPane.showMessageDialog(null, "Usted NO puede votar.");
        }

        // PRÁCTICA EN CLASE 2: ¿Aprobó el curso?
        lectura = JOptionPane.showInputDialog("Digite su nota final del curso:");
        double notaFinal = Double.parseDouble(lectura);

        if (notaFinal >= 70) {
            JOptionPane.showMessageDialog(null, "¡Felicidades! Usted aprobó el curso con " + notaFinal + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Usted reprobó el curso. Nota obtenida: " + notaFinal + ".");
        }

        // DE 1: Nombre del día según número
        
        lectura = JOptionPane.showInputDialog("Digite el número del día (1=Domingo ... 7=Sábado):");
        int numeroDia = Integer.parseInt(lectura);

        String nombreDia = " ";

        switch (numeroDia) {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miércoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;
            default:
                nombreDia = "Número inválido. Debe ser entre 1 y 7.";
                break;
        }

        JOptionPane.showMessageDialog(null, "El día número " + numeroDia + " es: " + nombreDia);

        // DE 2: ¿Día laboral o libre?
        
        if (numeroDia >= 2 && numeroDia <= 6) {
            JOptionPane.showMessageDialog(null, nombreDia + " es un día LABORAL.");
        } else if (numeroDia == 1 || numeroDia == 7) {
            JOptionPane.showMessageDialog(null, nombreDia + " es un día LIBRE.");
        } else {
            JOptionPane.showMessageDialog(null, "Número de día inválido.");
        }

        // DESARROLLEMOS 3: Mayor de cuatro números
        lectura = JOptionPane.showInputDialog("Digite el primer número:");
        double p1 = Double.parseDouble(lectura);

        lectura = JOptionPane.showInputDialog("Digite el segundo número:");
        double p2 = Double.parseDouble(lectura);

        lectura = JOptionPane.showInputDialog("Digite el tercer número:");
        double p3 = Double.parseDouble(lectura);

        lectura = JOptionPane.showInputDialog("Digite el cuarto número:");
        double p4 = Double.parseDouble(lectura);

        double mayor = p1;

        if (p2 > mayor) {
            mayor = p2;
        }
        if (p3 > mayor) {
            mayor = p3;
        }
        if (p4 > mayor) {
            mayor = p4;
        }

        JOptionPane.showMessageDialog(null,
                "De los cuatro números ingresados, el mayor es: " + mayor);

        // TRABAJO EXTRACLASE: Salario con bono y deducciones
        lectura = JOptionPane.showInputDialog("Digite los años de antigüedad en la empresa:");
        int aniosAntiguedad = Integer.parseInt(lectura);

        lectura = JOptionPane.showInputDialog("Digite la cantidad de horas laboradas por semana:");
        double horasSemana = Double.parseDouble(lectura);

        lectura = JOptionPane.showInputDialog("Digite el precio pagado por hora:");
        double precioPorHora = Double.parseDouble(lectura);

        double salarioBruto = horasSemana * 4 * precioPorHora;

        if (aniosAntiguedad > 12) {
            double bono = salarioBruto * 0.055;
            salarioBruto = salarioBruto + bono;
        }

        double deducciones = 0;

        if (salarioBruto > 3500) {
            deducciones = salarioBruto * 0.038;
        } else if (salarioBruto > 2500) {
            deducciones = salarioBruto * 0.027;
        }

        double salarioNeto = salarioBruto - deducciones;

        JOptionPane.showMessageDialog(null,
                "Resumen salarial:\n\n"
                + "Años de antigüedad:   " + aniosAntiguedad + "\n"
                + "Salario bruto:        $" + salarioBruto + "\n"
                + "Deducciones:          $" + deducciones + "\n"
                + "Salario neto final:   $" + salarioNeto);

    } // fin main

} // fin clase Clase002
