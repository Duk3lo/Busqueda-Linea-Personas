public class App {
    public static void main(String[] args) throws Exception {
        MetodoBusqueda metodoBusqueda = new MetodoBusqueda();
        ShowConsole showConsole = new ShowConsole();
        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };
        String name = "CaRLos";
        Persona r1persona = metodoBusqueda.searchPersonaByName(personas, name);
        showConsole.showPersonaResult(r1persona, name);

        int rangoMax = 25;
        int age = 25;
        Persona r2Persona = metodoBusqueda.searchPersonabByAges(personas, rangoMax);
        showConsole.showPersonaResult(r2Persona, age);

        boolean valorNombre = true;
        int i = 272;
        Persona r3Persona = metodoBusqueda.findByValuesNames(personas, i);
        showConsole.showPersonaResult(r3Persona, i, valorNombre);
    }
}
