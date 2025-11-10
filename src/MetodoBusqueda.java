public class MetodoBusqueda {
    public Persona searchPersonaByName(Persona[] personas, String name) {
        for (Persona persona : personas) {
            if (persona.getName().equalsIgnoreCase(name)) {
                return persona;
            }
        }
        return null;
    }

    // Encontrar una persona que sea mayor de: age
    // Y la edad sea impar
    public Persona searchPersonabByAges(Persona[] personas, int age) {
        for (Persona persona : personas) {
            if (persona.getAge() >= age && persona.getAge() % 2 != 0) {
                return persona;
            }
        }
        return null;
    }

    public Persona findByValuesNames(Persona[] personas, int i) {
        for (Persona persona : personas) {
            char[] letras = persona.getName().toCharArray(); // convertir el nombre a arreglo de caracteres
            int valor = 0;

            for (int j = 0; j < letras.length; j++) {
                valor += (j + 1) * 10;
            }

            if (valor == i) {
                return persona;
            }
        }
        return null;
    }

}
