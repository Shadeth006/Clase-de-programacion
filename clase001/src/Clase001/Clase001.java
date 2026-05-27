package Clase001; // Define el paquete (carpeta lógica) al que pertenece esta clase

import javax.swing.JOptionPane; // Importa la clase JOptionPane para mostrar ventanas gráficas de entrada/salida

/**
 * Universidad Fidélitas
 * Introducción a la Programación - Clase 01
 * Ejercicios de variables, entrada y salida con JOptionPane
 *
 * @author jafet
 */
public class Clase001 { // Declara la clase pública llamada Clase01 (debe coincidir con el nombre del archivo)

    public static void main(String[] args) { 
        // Método principal: punto de entrada del programa. Java siempre empieza aquí.
        // "public" = accesible desde cualquier lugar
        // "static"  = no necesita crear un objeto para llamarlo
        // "void"    = no devuelve ningún valor
        // "String[] args" = permite recibir argumentos desde la línea de comandos

        // --------------------------------------------------------
        // EJERCICIO 1: Mostrar dos mensajes (con dos instrucciones)
        // --------------------------------------------------------

        JOptionPane.showMessageDialog(null, "Bienvenido al mundo de Java.");
        // showMessageDialog muestra una ventana emergente con un mensaje
        // Parámetro 1 → null: significa que la ventana no tiene ventana padre (aparece centrada en la pantalla)
        // Parámetro 2 → el texto que se muestra dentro de la ventana

        JOptionPane.showMessageDialog(null, "Podrás dar solución a muchos problemas.");
        // Segunda ventana emergente con un mensaje distinto
        // Esto equivale a dos instrucciones separadas para mostrar dos mensajes

        JOptionPane.showMessageDialog(null,
                "Bienvenido al mundo de Java.\nPodrás dar solución a muchos problemas.");
        // Mismo resultado anterior pero en UNA SOLA instrucción
        // \n es un salto de línea (new line): todo lo que sigue aparece en la línea de abajo

        // --------------------------------------------------------
        // EJERCICIO 2: Suma y promedio (valores fijos asignados por el programador)
        // --------------------------------------------------------

        int num1 = 10; // Declara una variable entera llamada num1 y le asigna el valor 10
        int num2 = 20; // Declara una variable entera llamada num2 y le asigna el valor 20
        int num3 = 30; // Declara una variable entera llamada num3 y le asigna el valor 30
        int num4 = 40; // Declara una variable entera llamada num4 y le asigna el valor 40

        int suma = num1 + num2 + num3 + num4;
        // Declara una variable entera "suma" y le asigna el resultado de sumar los cuatro números
        // El operador + realiza la suma aritmética → resultado: 100

        double promedio = suma / 4.0;
        // Declara una variable de tipo double (número real) para guardar el promedio
        // Se divide entre 4.0 (con decimal) para forzar una división real y no entera
        // Si fuera suma / 4 (sin el .0), Java haría división entera y perdería los decimales

        JOptionPane.showMessageDialog(null,
                "Suma de los cuatro números: " + suma
                + "\nPromedio: " + promedio);
        // Muestra una ventana con la suma y el promedio
        // El operador + aquí actúa como concatenación de texto con variables
        // \n inserta un salto de línea entre los dos datos mostrados

        // --------------------------------------------------------
        // EJERCICIO 3: Suma y promedio ingresados por el usuario
        // --------------------------------------------------------

        String lectura = " ";
        // Declara una variable de tipo String (cadena de texto) llamada "lectura"
        // Se inicializa con un espacio en blanco como buena práctica
        // Esta variable se reutilizará para capturar cada dato que ingrese el usuario

        lectura = JOptionPane.showInputDialog("Digite el primer número:");
        // showInputDialog muestra una ventana con un campo de texto para que el usuario escriba
        // El texto ingresado por el usuario se guarda como String en la variable "lectura"

        int n1 = Integer.parseInt(lectura);
        // Como JOptionPane siempre devuelve texto (String), se convierte a entero con Integer.parseInt()
        // El valor numérico resultante se guarda en la variable entera n1

        lectura = JOptionPane.showInputDialog("Digite el segundo número:");
        int n2 = Integer.parseInt(lectura); // Mismo proceso: lee el texto y lo convierte a int

        lectura = JOptionPane.showInputDialog("Digite el tercer número:");
        int n3 = Integer.parseInt(lectura); // Lee el tercer número y lo convierte a int

        lectura = JOptionPane.showInputDialog("Digite el cuarto número:");
        int n4 = Integer.parseInt(lectura); // Lee el cuarto número y lo convierte a int

        int sumaUsuario = n1 + n2 + n3 + n4;
        // Suma los cuatro números ingresados por el usuario y guarda el resultado en sumaUsuario

        double promedioUsuario = sumaUsuario / 4.0;
        // Calcula el promedio dividiendo la suma entre 4.0 (real) para obtener decimales si los hay

        JOptionPane.showMessageDialog(null,
                "Suma: " + sumaUsuario
                + "\nPromedio: " + promedioUsuario);
        // Muestra en pantalla la suma y el promedio de los valores ingresados por el usuario

        // --------------------------------------------------------
        // EJERCICIO 4: Saludo personalizado
        // --------------------------------------------------------

        String nombre = " "; // Declara una variable String para guardar el nombre del usuario
        nombre = JOptionPane.showInputDialog("Digite su nombre:");
        // Pide al usuario que escriba su nombre y lo guarda en la variable "nombre"
        // Como es String, no requiere conversión con parse

        JOptionPane.showMessageDialog(null,
                "Hola " + nombre + ", bienvenido a este programa desarrollado en JAVA con Netbeans.");
        // Construye y muestra un saludo personalizado concatenando el texto con la variable "nombre"
        // Ejemplo: si el usuario escribió "María", muestra "Hola María, bienvenido..."

        // --------------------------------------------------------
        // PRÁCTICA EN CLASE 1: Edad en 5 años
        // --------------------------------------------------------

        lectura = JOptionPane.showInputDialog("Digite su edad actual:");
        // Reutiliza la variable "lectura" para capturar la edad escrita por el usuario (como String)

        int edadActual = Integer.parseInt(lectura);
        // Convierte el texto capturado a un número entero y lo guarda en edadActual

        int edadFutura = edadActual + 5;
        // Calcula la edad futura sumándole 5 años a la edad actual

        JOptionPane.showMessageDialog(null,
                "Dentro de 5 años, tendrá: " + edadFutura + " años.");
        // Muestra el resultado. Ejemplo: si edadActual = 20, muestra "Dentro de 5 años, tendrá: 25 años."

        // --------------------------------------------------------
        // PRÁCTICA EN CLASE 2: Porcentaje de gastos en alimentación
        // --------------------------------------------------------

        lectura = JOptionPane.showInputDialog("Digite su ingreso mensual:");
        double ingresoMensual = Double.parseDouble(lectura);
        // Lee el ingreso mensual como texto y lo convierte a double con Double.parseDouble()
        // Se usa double porque el salario puede tener decimales

        lectura = JOptionPane.showInputDialog("Digite su gasto mensual en alimentación:");
        double gastoAlimentacion = Double.parseDouble(lectura);
        // Lee el gasto en alimentación y lo convierte a double

        double porcentajeAlimentacion = (gastoAlimentacion / ingresoMensual) * 100;
        // Calcula qué porcentaje representa el gasto en alimentación respecto al ingreso total
        // Fórmula: (parte / total) * 100
        // Los paréntesis garantizan que la división se haga primero (precedencia de operadores)

        double porcentajeDisponible = 100 - porcentajeAlimentacion;
        // Calcula el porcentaje restante disponible para otros gastos
        // Si alimentación consume el 30%, queda 70% disponible

        JOptionPane.showMessageDialog(null,
                "Porcentaje gastado en alimentación: " + porcentajeAlimentacion + "%\n"
                + "Porcentaje disponible para otros gastos: " + porcentajeDisponible + "%");
        // Muestra ambos porcentajes en una sola ventana con salto de línea entre ellos

        // --------------------------------------------------------
        // TRABAJO EXTRACLASE: Salario bruto, deducciones y salario neto
        // --------------------------------------------------------

        var nombreTrabajador = " ";
        // "var" es inferencia de tipo: Java detecta automáticamente que es un String
        // Es equivalente a escribir: String nombreTrabajador = " ";

        nombreTrabajador = JOptionPane.showInputDialog("Digite el nombre del trabajador:");
        // Solicita el nombre del trabajador y lo guarda en nombreTrabajador

        lectura = JOptionPane.showInputDialog("Digite el salario semanal de " + nombreTrabajador + ":");
        // Muestra una ventana personalizada incluyendo el nombre ya ingresado
        // Ejemplo: "Digite el salario semanal de Juan:"
        double salarioSemanal = Double.parseDouble(lectura);
        // Convierte el salario semanal de String a double

        double salarioBruto = salarioSemanal * 4;
        // Calcula el salario mensual multiplicando el semanal por 4 semanas
        // Este valor es el salario bruto (antes de deducciones)

        double deducciones = salarioBruto * 0.0934;
        // Calcula el monto de las deducciones aplicando el 9.34% al salario bruto
        // 0.0934 es la representación decimal del 9.34% (9.34 / 100 = 0.0934)

        double salarioNeto = salarioBruto - deducciones;
        // Calcula el salario neto restando las deducciones al salario bruto
        // Este es el dinero que el trabajador realmente recibe

        JOptionPane.showMessageDialog(null,
                "Estimado " + nombreTrabajador + ", el salario de este mes se desglosa de la siguiente manera.\n\n"
                // Primer línea con saludo personalizado; \n\n agrega dos saltos (deja una línea en blanco)
                + "Salario bruto:  " + salarioBruto + "\n"   // Muestra el salario bruto
                + "Deducciones:    " + deducciones + "\n"    // Muestra el monto deducido
                + "Salario Neto:   " + salarioNeto);         // Muestra el salario final neto

    } // fin main - cierra el bloque del método principal

} // fin clase Clase01 - cierra el bloque de la clase