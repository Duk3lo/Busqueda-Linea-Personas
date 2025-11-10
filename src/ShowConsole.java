public class ShowConsole {

    public void showPersonaResult(Persona persona, String name) {
        System.out.println(
            (persona != null && name.equalsIgnoreCase(persona.getName()))
            ? "Se encontró el nombre " + name + " Nombre: " + persona.getName() + ", Edad: " + persona.getAge() + " años."
            : "No se pudo encontrar una persona con el nombre: " + name
        );
    }

    public void showPersonaResult(Persona persona, int age) {
        System.out.println(
            (persona != null)
            ? "Se encontró a " + persona.getName() + " con " + persona.getAge() + " años (buscado: " + age + ")."
            : "No se pudo encontrar a una persona con la edad: " + age
        );
    }

    public void showPersonaResult(Persona persona, int i, boolean valorNombre) {
        System.out.println(
            (persona != null)
            ? (valorNombre
                ? "Se encontró una persona cuyo nombre tiene un valor de " + i + ": " + persona.getName() + " (" + persona.getAge() + " años)."
                : "Persona encontrada: " + persona.getName() + " (" + persona.getAge() + " años).")
            : "No se encontró ninguna persona con el valor: " + i
        );
    }
}
