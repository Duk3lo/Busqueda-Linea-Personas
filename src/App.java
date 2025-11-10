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
        String name = "Juan";
        Persona r1persona = metodoBusqueda.searchPersonaByName(personas, "luis");
        showConsole.showPersonaResult(r1persona, name);

        Persona r2Persona = metodoBusqueda.searchPersonabByAges(personas, 25);
        showConsole.showPersonaResult(r2Persona, 25);

        boolean valorNombre = true;
        Persona r3Persona = metodoBusqueda.findByValuesNames(personas, 498);
        showConsole.showPersonaResult(r3Persona, 498, valorNombre);
    }
}
