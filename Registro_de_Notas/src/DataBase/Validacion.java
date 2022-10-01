package DataBase;

public class Validacion {

    public Validacion() {

    }

    /* Metdodo de validacion si es correo Institucional de estudiante o Docente 
     * Si el usuario pertences a un estudiante, el metodo retorna true
     * Si el usuario pertences a un Docente, el metodo retorna false
    */

    public boolean validar(String correo){
        // correo = "211179@unamba.edu.pe"
        //Usando el medoto split para separar la cadena de texto
        String[] parts = correo.split("@");
        String part1 = parts[0]; // 211179
        String part2 = parts[1]; // unamba.edu.pe

        // Retorno true si es todo numero
        boolean aceptacion =  part1.matches("[+-]?\\d*(\\.\\d+)?");
        
        return aceptacion;
    }
}
