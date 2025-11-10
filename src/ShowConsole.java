public class ShowConsole {
    public void showPersonaResult(Persona persona, String name) {
        boolean cond = name.equalsIgnoreCase(persona.getName());
        System.out.println(cond ? "Se encontro el nombre " + name + " como: " + persona.getName()
                : "No se pudo encontrar: " + name);
    }

    public void showPersonaResult(Persona persona, int age) {
        boolean cond = persona != null;
        System.out.println(cond
                ? "Se encontró a " + persona.getName() + " con " + persona.getAge() + " años."
                : "No se pudo encontrar a una persona con la edad: " + age);
    }

    public void showPersonaResult(Persona persona, int i, boolean valorNombre) {
    if (persona != null) {
        if (valorNombre) {
            System.out.println("Se encontró una persona cuyo nombre tiene un valor de " + i + 
                ": " + persona.getName() + " (" + persona.getAge() + " años)");
        } else {
            System.out.println("Persona encontrada: " + persona.getName());
        }
    } else {
        System.out.println("No se encontró ninguna persona con el valor " + i);
    }
}

}